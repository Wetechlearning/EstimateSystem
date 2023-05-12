package com.we.estimate.Service.Impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.we.estimate.Mapper.SyainMapper;
import com.we.estimate.Entity.Syain;
import com.we.estimate.Service.SyainService;
@Service
public class SyainServiceImpl implements SyainService{

    @Resource
    private SyainMapper syainMapper;

    @Override
    public int deleteByPrimaryKey(String cdShain) {
        return syainMapper.deleteByPrimaryKey(cdShain);
    }

    @Override
    public int insert(Syain record) {
        return syainMapper.insert(record);
    }

    @Override
    public int insertSelective(Syain record) {
        return syainMapper.insertSelective(record);
    }

    @Override
    public Syain selectByPrimaryKey(String cdShain) {
        return syainMapper.selectByPrimaryKey(cdShain);
    }

    @Override
    public int updateByPrimaryKeySelective(Syain record) {
        return syainMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Syain record) {
        return syainMapper.updateByPrimaryKey(record);
    }


}
