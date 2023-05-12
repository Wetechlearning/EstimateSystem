package com.we.estimate.Service;

import com.we.estimate.Entity.ShaIn;
import com.we.estimate.Entity.Syain;
public interface SyainService{


    int deleteByPrimaryKey(String cdShain);

    int insert(Syain record);

    int insertSelective(Syain record);

    Syain selectByPrimaryKey(String cdShain);

    int updateByPrimaryKeySelective(Syain record);

    int updateByPrimaryKey(Syain record);

}
