package com.we.estimate.Service;

import com.we.estimate.Entity.McTm130;
public interface McTm130Service{


    int deleteByPrimaryKey(String cdGinkoVirtual,String cdShitenVirtual,String kbJigyo);

    int insert(McTm130 record);

    int insertSelective(McTm130 record);

    McTm130 selectByPrimaryKey(String cdGinkoVirtual,String cdShitenVirtual,String kbJigyo);

    int updateByPrimaryKeySelective(McTm130 record);

    int updateByPrimaryKey(McTm130 record);

    McTm130 selectByNmKoza(String nmKozaVirtual);
}
