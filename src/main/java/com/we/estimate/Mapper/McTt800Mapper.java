package com.we.estimate.Mapper;

import com.we.estimate.Entity.McTt800;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface McTt800Mapper {
    int deleteByPrimaryKey(Long idFile);

    int insert(McTt800 record);

    int insertSelective(McTt800 record);

    McTt800 selectByPrimaryKey(Long idFile);

    int updateByPrimaryKeySelective(McTt800 record);

    int updateByPrimaryKey(McTt800 record);
}