package com.we.estimate.Service;

import com.we.estimate.Entity.ZzTm050;
public interface ZzTm050Service{


    int deleteByPrimaryKey(String idSystem,String cdKbn,String kb);

    int insert(ZzTm050 record);

    int insertSelective(ZzTm050 record);

    ZzTm050 selectByPrimaryKey(String idSystem,String cdKbn,String kb);

    int updateByPrimaryKeySelective(ZzTm050 record);

    int updateByPrimaryKey(ZzTm050 record);

}
