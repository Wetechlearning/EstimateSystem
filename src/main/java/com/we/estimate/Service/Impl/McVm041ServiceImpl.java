package com.we.estimate.Service.Impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.we.estimate.Mapper.McVm041Mapper;
import com.we.estimate.Entity.McVm041;
import com.we.estimate.Service.McVm041Service;
@Service
public class McVm041ServiceImpl implements McVm041Service{

    @Resource
    private McVm041Mapper mcVm041Mapper;

    @Override
    public int insert(McVm041 record) {
        return mcVm041Mapper.insert(record);
    }

    @Override
    public int insertSelective(McVm041 record) {
        return mcVm041Mapper.insertSelective(record);
    }

}
