package com.we.estimate.Mapper;

import com.we.estimate.Entity.McTm010;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface McTm010Mapper {
    int deleteByPrimaryKey(Integer cdClientKari);

    int insert(McTm010 record);

    int insertSelective(McTm010 record);

    McTm010 selectByPrimaryKey(Integer cdClientKari);

    int updateByPrimaryKeySelective(McTm010 record);

    int updateByPrimaryKey(McTm010 record);

    McTm010 selectByCdClient(Integer cdClient);
}