package com.we.estimate.Service.Impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.we.estimate.Mapper.McTm270Mapper;
import com.we.estimate.Entity.McTm270;
import com.we.estimate.Service.McTm270Service;
@Service
public class McTm270ServiceImpl implements McTm270Service{

    @Resource
    private McTm270Mapper mcTm270Mapper;

    @Override
    public int deleteByPrimaryKey(Integer cdClientKari,Long idFileClientShisei) {
        return mcTm270Mapper.deleteByPrimaryKey(cdClientKari,idFileClientShisei);
    }

    @Override
    public int insert(McTm270 record) {
        return mcTm270Mapper.insert(record);
    }

    @Override
    public int insertSelective(McTm270 record) {
        return mcTm270Mapper.insertSelective(record);
    }

    @Override
    public McTm270 selectByPrimaryKey(Integer cdClientKari,Long idFileClientShisei) {
        return mcTm270Mapper.selectByPrimaryKey(cdClientKari,idFileClientShisei);
    }

    @Override
    public int updateByPrimaryKeySelective(McTm270 record) {
        return mcTm270Mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(McTm270 record) {
        return mcTm270Mapper.updateByPrimaryKey(record);
    }

}
