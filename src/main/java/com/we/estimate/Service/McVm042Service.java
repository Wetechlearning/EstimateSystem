package com.we.estimate.Service;

import com.we.estimate.Entity.McVm042;
public interface McVm042Service{


    int insert(McVm042 record);

    int insertSelective(McVm042 record);

    McVm042 selectByNmGinkoShitenVirtual(String cdGinkoVirtual, String cdShitenVirtual);
}
