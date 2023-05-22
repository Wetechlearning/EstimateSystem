package com.we.estimate.Service;

import com.we.estimate.Entity.Gyosyu;
public interface GyosyuService{


    int deleteByPrimaryKey(Integer cdGyoshu);

    int insert(Gyosyu record);

    int insertSelective(Gyosyu record);

    Gyosyu selectByPrimaryKey(Integer cdGyoshu);

    int updateByPrimaryKeySelective(Gyosyu record);

    int updateByPrimaryKey(Gyosyu record);

}
