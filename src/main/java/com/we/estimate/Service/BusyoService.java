package com.we.estimate.Service;

import com.github.pagehelper.PageInfo;
import com.we.estimate.Entity.Busyo;
import com.we.estimate.Search.BusyoVo;

import java.util.List;

public interface BusyoService{


    int deleteByPrimaryKey(String cdKaisha,String cdBusho);

    int insert(Busyo record);

    int insertSelective(Busyo record);

    Busyo selectByPrimaryKey(String cdKaisha,String cdBusho);

    int updateByPrimaryKeySelective(Busyo record);

    int updateByPrimaryKey(Busyo record);

    Busyo selectByBusyoCode(String busyoCode);

    PageInfo<Busyo> selectByConditions(Integer pageIndex, Integer pageSize, BusyoVo busyoVo);

    List<Busyo> selectByConditionsList(BusyoVo busyoVo);

    PageInfo<Busyo> selectByIds(Integer pageIndex, Integer pageSize, List cdBushoList);

}
