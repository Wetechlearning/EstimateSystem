package com.we.estimate.Service.Impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.we.estimate.Entity.ZzTm050;
import com.we.estimate.Mapper.ZzTm050Mapper;
import com.we.estimate.Service.ZzTm050Service;
@Service
public class ZzTm050ServiceImpl implements ZzTm050Service{

    @Resource
    private ZzTm050Mapper zzTm050Mapper;

    @Override
    public int deleteByPrimaryKey(String idSystem,String cdKbn,String kb) {
        return zzTm050Mapper.deleteByPrimaryKey(idSystem,cdKbn,kb);
    }

    @Override
    public int insert(ZzTm050 record) {
        return zzTm050Mapper.insert(record);
    }

    @Override
    public int insertSelective(ZzTm050 record) {
        return zzTm050Mapper.insertSelective(record);
    }

    @Override
    public ZzTm050 selectByPrimaryKey(String idSystem,String cdKbn,String kb) {
        return zzTm050Mapper.selectByPrimaryKey(idSystem,cdKbn,kb);
    }

    @Override
    public int updateByPrimaryKeySelective(ZzTm050 record) {
        return zzTm050Mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(ZzTm050 record) {
        return zzTm050Mapper.updateByPrimaryKey(record);
    }

}
