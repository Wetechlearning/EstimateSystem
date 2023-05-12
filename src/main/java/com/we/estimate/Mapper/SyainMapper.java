package com.we.estimate.Mapper;

import com.we.estimate.Entity.Syain;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SyainMapper {
    int deleteByPrimaryKey(String cdShain);

    int insert(Syain record);

    int insertSelective(Syain record);

    Syain selectByPrimaryKey(String cdShain);

    int updateByPrimaryKeySelective(Syain record);

    int updateByPrimaryKey(Syain record);

}