package com.we.estimate.Mapper;

import com.we.estimate.Entity.McTm120;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface McTm120Mapper {
    int deleteByPrimaryKey(String cdFurikomiKoza);

    int insert(McTm120 record);

    int insertSelective(McTm120 record);

    McTm120 selectByPrimaryKey(String cdFurikomiKoza);

    int updateByPrimaryKeySelective(McTm120 record);

    int updateByPrimaryKey(McTm120 record);
}