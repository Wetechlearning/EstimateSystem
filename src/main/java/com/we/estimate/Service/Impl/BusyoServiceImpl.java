package com.we.estimate.Service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.we.estimate.Search.BusyoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.we.estimate.Entity.Busyo;
import com.we.estimate.Mapper.BusyoMapper;
import com.we.estimate.Service.BusyoService;

import java.util.List;

@Service
public class BusyoServiceImpl implements BusyoService{

    @Autowired
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

    @Override
    public PageInfo<Busyo> selectByConditions(Integer pageIndex, Integer pageSize, BusyoVo busyoVo) {
        PageHelper.startPage(pageIndex,pageSize);
        List<Busyo> busyos = busyoMapper.getBusyos(busyoVo);
        PageInfo<Busyo> pageInfo = new PageInfo<>(busyos);
        return pageInfo;
    }

    @Override
    public List<Busyo> selectByConditionsList(BusyoVo busyoVo) {
        return busyoMapper.getBusyos(busyoVo);
    }

    @Override
    public PageInfo<Busyo> selectByIds(Integer pageIndex, Integer pageSize, List cdBushoList) {
        PageHelper.startPage(pageIndex, pageSize);
        List<Busyo> busyos = busyoMapper.selectByIds(cdBushoList);
        PageInfo<Busyo> pageInfo = new PageInfo<>(busyos);
        return pageInfo;
    }




}
