package com.we.estimate.Service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.we.estimate.Search.ClientVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.we.estimate.Mapper.ClientMapper;
import com.we.estimate.Entity.Client;
import com.we.estimate.Service.ClientService;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
@Transactional
public class ClientServiceImpl implements ClientService{

    @Autowired
    private ClientMapper clientMapper;

    @Override
    public int deleteByPrimaryKey(Integer cdClient) {
        return clientMapper.deleteByPrimaryKey(cdClient);
    }

    @Override
    public int insert(Client record) {
        return clientMapper.insert(record);
    }

    @Override
    public int insertSelective(Client record) {
        return clientMapper.insertSelective(record);
    }

    @Override
    public Client selectByPrimaryKey(Integer cdClient) {
        return clientMapper.selectByPrimaryKey(cdClient);
    }

    @Override
    public int updateByPrimaryKeySelective(Client record) {
        return clientMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Client record) {
        return clientMapper.updateByPrimaryKey(record);
    }

    /*@Override
    public List<Client> selectByConditions(Map<String, Object> paramMap) {
        return clientMapper.getClients(paramMap);
    }*/

    @Override
    public PageInfo<Client> selectByConditions(Integer pageIndex, Integer pageSize, ClientVo clientVo) {
        PageHelper.startPage(pageIndex,pageSize);
        List<Client> clients = clientMapper.getClients(clientVo);
        //System.out.println(clients);
        PageInfo<Client> pageInfo = new PageInfo<>(clients);
        return pageInfo;
    }

}
