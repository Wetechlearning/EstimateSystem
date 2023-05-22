package com.we.estimate.Service;

import com.we.estimate.Entity.McTm270;
public interface McTm270Service{


    int deleteByPrimaryKey(Integer cdClientKari,Long idFileClientShisei);

    int insert(McTm270 record);

    int insertSelective(McTm270 record);

    McTm270 selectByPrimaryKey(Integer cdClientKari,Long idFileClientShisei);

    int updateByPrimaryKeySelective(McTm270 record);

    int updateByPrimaryKey(McTm270 record);

}
