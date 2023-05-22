package com.we.estimate.Service.Impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.we.estimate.Entity.McTm120;
import com.we.estimate.Mapper.McTm120Mapper;
import com.we.estimate.Service.McTm120Service;
@Service
public class McTm120ServiceImpl implements McTm120Service{

    @Resource
    private McTm120Mapper mcTm120Mapper;

    @Override
    public int deleteByPrimaryKey(String cdFurikomiKoza) {
        return mcTm120Mapper.deleteByPrimaryKey(cdFurikomiKoza);
    }

    @Override
    public int insert(McTm120 record) {
        return mcTm120Mapper.insert(record);
    }

    @Override
    public int insertSelective(McTm120 record) {
        return mcTm120Mapper.insertSelective(record);
    }

    @Override
    public McTm120 selectByPrimaryKey(String cdFurikomiKoza) {
        return mcTm120Mapper.selectByPrimaryKey(cdFurikomiKoza);
    }

    @Override
    public int updateByPrimaryKeySelective(McTm120 record) {
        return mcTm120Mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(McTm120 record) {
        return mcTm120Mapper.updateByPrimaryKey(record);
    }

}
