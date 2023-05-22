package com.we.estimate.Service.Impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.we.estimate.Mapper.McVm042Mapper;
import com.we.estimate.Entity.McVm042;
import com.we.estimate.Service.McVm042Service;
@Service
public class McVm042ServiceImpl implements McVm042Service{

    @Resource
    private McVm042Mapper mcVm042Mapper;

    @Override
    public int insert(McVm042 record) {
        return mcVm042Mapper.insert(record);
    }

    @Override
    public int insertSelective(McVm042 record) {
        return mcVm042Mapper.insertSelective(record);
    }

    @Override
    public McVm042 selectByNmGinkoShitenVirtual(String cdGinkoVirtual, String cdShitenVirtual) {
        return mcVm042Mapper.selectByNmGinkoShitenVirtual(cdGinkoVirtual,cdShitenVirtual);
    }

}
