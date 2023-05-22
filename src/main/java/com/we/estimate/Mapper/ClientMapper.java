package com.we.estimate.Mapper;

import com.we.estimate.Entity.Client;
import com.we.estimate.Search.ClientVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface ClientMapper {
    int deleteByPrimaryKey(Integer cdClient);

    int insert(Client record);

    int insertSelective(Client record);

    Client selectByPrimaryKey(Integer cdClient);

    int updateByPrimaryKeySelective(Client record);

    int updateByPrimaryKey(Client record);

    //List<Client> getClients(Map<String, Object> paramMap);
    List<Client> getClients(ClientVo clientVo);

}