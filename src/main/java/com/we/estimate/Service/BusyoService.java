package com.we.estimate.Service;

import com.we.estimate.Entity.Busyo;
public interface BusyoService{


    int deleteByPrimaryKey(String cdKaisha,String cdBusho);

    int insert(Busyo record);

    int insertSelective(Busyo record);

    Busyo selectByPrimaryKey(String cdKaisha,String cdBusho);

    int updateByPrimaryKeySelective(Busyo record);

    int updateByPrimaryKey(Busyo record);

    Busyo selectByBusyoCode(String busyoCode);
}
