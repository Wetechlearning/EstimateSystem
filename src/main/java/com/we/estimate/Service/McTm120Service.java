package com.we.estimate.Service;

import com.we.estimate.Entity.McTm120;
public interface McTm120Service{


    int deleteByPrimaryKey(String cdFurikomiKoza);

    int insert(McTm120 record);

    int insertSelective(McTm120 record);

    McTm120 selectByPrimaryKey(String cdFurikomiKoza);

    int updateByPrimaryKeySelective(McTm120 record);

    int updateByPrimaryKey(McTm120 record);

}
