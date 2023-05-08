package com.we.estimate.Service;

import com.we.estimate.Entity.ShaIn;
import com.we.estimate.Entity.ShaInDataBase;
import com.we.estimate.Search.ShaInSearchModel;

import java.util.List;
import java.util.Map;


public interface ShaInService {

    int searchCount(ShaIn shaIn);
    List<ShaInDataBase> getShaIns(Map<String, Object> paramMap);

    void saveShaIn(List<ShaIn> shaInList);

}
