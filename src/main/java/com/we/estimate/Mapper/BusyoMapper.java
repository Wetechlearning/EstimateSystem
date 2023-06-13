package com.we.estimate.Mapper;

import com.we.estimate.Entity.Busyo;
import com.we.estimate.Search.BusyoVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface BusyoMapper {
    int deleteByPrimaryKey(@Param("cdKaisha") String cdKaisha, @Param("cdBusho") String cdBusho);

    int insert(Busyo record);

    int insertSelective(Busyo record);

    Busyo selectByPrimaryKey(@Param("cdKaisha") String cdKaisha, @Param("cdBusho") String cdBusho);

    int updateByPrimaryKeySelective(Busyo record);

    int updateByPrimaryKey(Busyo record);

    Busyo selectByBusyoCode(String busyoCode);

    List<Busyo> getBusyos(BusyoVo busyoVo);

    List<Busyo> selectByIds(List cdBushoList);
}