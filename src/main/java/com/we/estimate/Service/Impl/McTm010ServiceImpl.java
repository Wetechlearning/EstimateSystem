package com.we.estimate.Service.Impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.we.estimate.Entity.McTm010;
import com.we.estimate.Mapper.McTm010Mapper;
import com.we.estimate.Service.McTm010Service;
@Service
public class McTm010ServiceImpl implements McTm010Service{

    @Resource
    private McTm010Mapper mcTm010Mapper;

    @Override
    public int deleteByPrimaryKey(Integer cdClientKari) {
        return mcTm010Mapper.deleteByPrimaryKey(cdClientKari);
    }

    @Override
    public int insert(McTm010 record) {
        return mcTm010Mapper.insert(record);
    }

    @Override
    public int insertSelective(McTm010 record) {
        return mcTm010Mapper.insertSelective(record);
    }

    @Override
    public McTm010 selectByPrimaryKey(Integer cdClientKari) {
        return mcTm010Mapper.selectByPrimaryKey(cdClientKari);
    }

    @Override
    public int updateByPrimaryKeySelective(McTm010 record) {
        return mcTm010Mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(McTm010 record) {
        return mcTm010Mapper.updateByPrimaryKey(record);
    }

    @Override
    public McTm010 selectByClientCode(Integer cdClient) {
        return mcTm010Mapper.selectByCdClient(cdClient);
    }

}
