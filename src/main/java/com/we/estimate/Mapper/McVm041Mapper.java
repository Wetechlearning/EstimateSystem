package com.we.estimate.Mapper;

import com.we.estimate.Entity.McVm041;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface McVm041Mapper {
    int insert(McVm041 record);

    int insertSelective(McVm041 record);
}