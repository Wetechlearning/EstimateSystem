package com.we.estimate.Service.Impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.we.estimate.Entity.Cliext;
import com.we.estimate.Mapper.CliextMapper;
import com.we.estimate.Service.CliextService;
@Service
public class CliextServiceImpl implements CliextService{

    @Resource
    private CliextMapper cliextMapper;

    @Override
    public int deleteByPrimaryKey(Integer cdClient) {
        return cliextMapper.deleteByPrimaryKey(cdClient);
    }

    @Override
    public int insert(Cliext record) {
        return cliextMapper.insert(record);
    }

    @Override
    public int insertSelective(Cliext record) {
        return cliextMapper.insertSelective(record);
    }

    @Override
    public Cliext selectByPrimaryKey(Integer cdClient) {
        return cliextMapper.selectByPrimaryKey(cdClient);
    }

    @Override
    public int updateByPrimaryKeySelective(Cliext record) {
        return cliextMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Cliext record) {
        return cliextMapper.updateByPrimaryKey(record);
    }

}
