package com.we.estimate.Service;

import com.we.estimate.Entity.McTm010;
public interface McTm010Service{


    int deleteByPrimaryKey(Integer cdClientKari);

    int insert(McTm010 record);

    int insertSelective(McTm010 record);

    McTm010 selectByPrimaryKey(Integer cdClientKari);

    int updateByPrimaryKeySelective(McTm010 record);

    int updateByPrimaryKey(McTm010 record);

    McTm010 selectByClientCode(Integer cdClient);
}
