package com.we.estimate.Service;

import com.github.pagehelper.PageInfo;
import com.we.estimate.Entity.Client;
import com.we.estimate.Search.ClientVo;

import java.util.List;
import java.util.Map;

public interface ClientService{


    int deleteByPrimaryKey(Integer cdClient);

    int insert(Client record);

    int insertSelective(Client record);

    Client selectByPrimaryKey(Integer cdClient);

    int updateByPrimaryKeySelective(Client record);

    int updateByPrimaryKey(Client record);

    PageInfo<Client> selectByConditions(Integer pageIndex, Integer pageSize, ClientVo clientVo);
}
