package com.we.estimate.Service;

import com.we.estimate.Entity.Cliext;
public interface CliextService{


    int deleteByPrimaryKey(Integer cdClient);

    int insert(Cliext record);

    int insertSelective(Cliext record);

    Cliext selectByPrimaryKey(Integer cdClient);

    int updateByPrimaryKeySelective(Cliext record);

    int updateByPrimaryKey(Cliext record);

}
