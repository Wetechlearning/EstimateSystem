package com.we.estimate.Service.Impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.we.estimate.Entity.Busyo;
import com.we.estimate.Mapper.BusyoMapper;
import com.we.estimate.Service.BusyoService;
@Service
public class BusyoServiceImpl implements BusyoService{

    @Resource
    private BusyoMapper busyoMapper;

    @Override
    public int deleteByPrimaryKey(String cdKaisha,String cdBusho) {
        return busyoMapper.deleteByPrimaryKey(cdKaisha,cdBusho);
    }

    @Override
    public int insert(Busyo record) {
        return busyoMapper.insert(record);
    }

    @Override
    public int insertSelective(Busyo record) {
        return busyoMapper.insertSelective(record);
    }

    @Override
    public Busyo selectByPrimaryKey(String cdKaisha,String cdBusho) {
        return busyoMapper.selectByPrimaryKey(cdKaisha,cdBusho);
    }

    @Override
    public int updateByPrimaryKeySelective(Busyo record) {
        return busyoMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Busyo record) {
        return busyoMapper.updateByPrimaryKey(record);
    }

    @Override
    public Busyo selectByBusyoCode(String busyoCode) {
        return busyoMapper.selectByBusyoCode(busyoCode);
    }

}
