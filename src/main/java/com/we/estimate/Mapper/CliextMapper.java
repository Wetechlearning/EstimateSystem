package com.we.estimate.Mapper;

import com.we.estimate.Entity.Cliext;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CliextMapper {
    int deleteByPrimaryKey(Integer cdClient);

    int insert(Cliext record);

    int insertSelective(Cliext record);

    Cliext selectByPrimaryKey(Integer cdClient);

    int updateByPrimaryKeySelective(Cliext record);

    int updateByPrimaryKey(Cliext record);
}