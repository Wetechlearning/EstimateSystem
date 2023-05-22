package com.we.estimate.Mapper;

import com.we.estimate.Entity.McVm042;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface McVm042Mapper {
    int insert(McVm042 record);

    int insertSelective(McVm042 record);

    McVm042 selectByNmGinkoShitenVirtual(String cdGinkoVirtual, String cdShitenVirtual);
}