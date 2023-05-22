package com.we.estimate.Mapper;

import com.we.estimate.Entity.McTm270;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface McTm270Mapper {
    int deleteByPrimaryKey(@Param("cdClientKari") Integer cdClientKari, @Param("idFileClientShisei") Long idFileClientShisei);

    int insert(McTm270 record);

    int insertSelective(McTm270 record);

    McTm270 selectByPrimaryKey(@Param("cdClientKari") Integer cdClientKari, @Param("idFileClientShisei") Long idFileClientShisei);

    int updateByPrimaryKeySelective(McTm270 record);

    int updateByPrimaryKey(McTm270 record);
}