package com.we.estimate.Service.Impl;

import com.we.estimate.Entity.ShaIn;
import com.we.estimate.Entity.ShaInDataBase;
import com.we.estimate.Mapper.ShaInMapper;
import com.we.estimate.Search.ShaInSearchModel;
import com.we.estimate.Service.ShaInService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ShaInServiceImpl implements ShaInService {
    @Autowired
    private ShaInMapper shaInMapper;

    @Override
    public List<ShaInDataBase> getShaIns(Map<String, Object> paramMap) {
        return shaInMapper.getShaIns(paramMap);
    }

    @Override
    public int searchCount(ShaIn shaIn) {
        return shaInMapper.searchCount(shaIn);
    }

    @Override
    public void saveShaIn(List<ShaIn> shaInList) {
        shaInMapper.saveShaIn(shaInList);
    }


}
