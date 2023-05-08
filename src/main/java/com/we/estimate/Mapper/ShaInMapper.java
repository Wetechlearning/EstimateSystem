package com.we.estimate.Mapper;

import com.we.estimate.Entity.ShaIn;
import com.we.estimate.Entity.ShaInDataBase;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface ShaInMapper {

    int searchCount(ShaIn shaIn);
    List<ShaInDataBase> getShaIns(Map<String, Object> paramMap);

    void saveShaIn(List<ShaIn> shaInList);

}
