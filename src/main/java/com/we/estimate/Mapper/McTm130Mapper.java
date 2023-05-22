package com.we.estimate.Mapper;

import com.we.estimate.Entity.McTm130;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface McTm130Mapper {
    int deleteByPrimaryKey(@Param("cdGinkoVirtual") String cdGinkoVirtual, @Param("cdShitenVirtual") String cdShitenVirtual, @Param("kbJigyo") String kbJigyo);

    int insert(McTm130 record);

    int insertSelective(McTm130 record);

    McTm130 selectByPrimaryKey(@Param("cdGinkoVirtual") String cdGinkoVirtual, @Param("cdShitenVirtual") String cdShitenVirtual, @Param("kbJigyo") String kbJigyo);

    int updateByPrimaryKeySelective(McTm130 record);

    int updateByPrimaryKey(McTm130 record);

    McTm130 selectByNmKoza(String nmKozaVirtual);
}