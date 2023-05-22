package com.we.estimate.Service.Impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.we.estimate.Mapper.GyosyuMapper;
import com.we.estimate.Entity.Gyosyu;
import com.we.estimate.Service.GyosyuService;
@Service
public class GyosyuServiceImpl implements GyosyuService{

    @Resource
    private GyosyuMapper gyosyuMapper;

    @Override
    public int deleteByPrimaryKey(Integer cdGyoshu) {
        return gyosyuMapper.deleteByPrimaryKey(cdGyoshu);
    }

    @Override
    public int insert(Gyosyu record) {
        return gyosyuMapper.insert(record);
    }

    @Override
    public int insertSelective(Gyosyu record) {
        return gyosyuMapper.insertSelective(record);
    }

    @Override
    public Gyosyu selectByPrimaryKey(Integer cdGyoshu) {
        return gyosyuMapper.selectByPrimaryKey(cdGyoshu);
    }

    @Override
    public int updateByPrimaryKeySelective(Gyosyu record) {
        return gyosyuMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Gyosyu record) {
        return gyosyuMapper.updateByPrimaryKey(record);
    }

}
