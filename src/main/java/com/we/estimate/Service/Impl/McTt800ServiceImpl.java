package com.we.estimate.Service.Impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.we.estimate.Entity.McTt800;
import com.we.estimate.Mapper.McTt800Mapper;
import com.we.estimate.Service.McTt800Service;
@Service
public class McTt800ServiceImpl implements McTt800Service{

    @Resource
    private McTt800Mapper mcTt800Mapper;

    @Override
    public int deleteByPrimaryKey(Long idFile) {
        return mcTt800Mapper.deleteByPrimaryKey(idFile);
    }

    @Override
    public int insert(McTt800 record) {
        return mcTt800Mapper.insert(record);
    }

    @Override
    public int insertSelective(McTt800 record) {
        return mcTt800Mapper.insertSelective(record);
    }

    @Override
    public McTt800 selectByPrimaryKey(Long idFile) {
        return mcTt800Mapper.selectByPrimaryKey(idFile);
    }

    @Override
    public int updateByPrimaryKeySelective(McTt800 record) {
        return mcTt800Mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(McTt800 record) {
        return mcTt800Mapper.updateByPrimaryKey(record);
    }

}
