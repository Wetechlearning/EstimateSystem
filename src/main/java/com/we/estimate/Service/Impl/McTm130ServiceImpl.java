package com.we.estimate.Service.Impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.we.estimate.Mapper.McTm130Mapper;
import com.we.estimate.Entity.McTm130;
import com.we.estimate.Service.McTm130Service;
@Service
public class McTm130ServiceImpl implements McTm130Service{

    @Resource
    private McTm130Mapper mcTm130Mapper;

    @Override
    public int deleteByPrimaryKey(String cdGinkoVirtual,String cdShitenVirtual,String kbJigyo) {
        return mcTm130Mapper.deleteByPrimaryKey(cdGinkoVirtual,cdShitenVirtual,kbJigyo);
    }

    @Override
    public int insert(McTm130 record) {
        return mcTm130Mapper.insert(record);
    }

    @Override
    public int insertSelective(McTm130 record) {
        return mcTm130Mapper.insertSelective(record);
    }

    @Override
    public McTm130 selectByPrimaryKey(String cdGinkoVirtual,String cdShitenVirtual,String kbJigyo) {
        return mcTm130Mapper.selectByPrimaryKey(cdGinkoVirtual,cdShitenVirtual,kbJigyo);
    }

    @Override
    public int updateByPrimaryKeySelective(McTm130 record) {
        return mcTm130Mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(McTm130 record) {
        return mcTm130Mapper.updateByPrimaryKey(record);
    }

    @Override
    public McTm130 selectByNmKoza(String nmKozaVirtual) {
        return mcTm130Mapper.selectByNmKoza(nmKozaVirtual);
    }

}
