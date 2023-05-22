package com.we.estimate.Mapper;

import com.we.estimate.Entity.Gyosyu;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface GyosyuMapper {
    int deleteByPrimaryKey(Integer cdGyoshu);

    int insert(Gyosyu record);

    int insertSelective(Gyosyu record);

    Gyosyu selectByPrimaryKey(Integer cdGyoshu);

    int updateByPrimaryKeySelective(Gyosyu record);

    int updateByPrimaryKey(Gyosyu record);
}