package com.we.estimate.Mapper;

import com.we.estimate.Entity.ZzTm050;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ZzTm050Mapper {
    int deleteByPrimaryKey(@Param("idSystem") String idSystem, @Param("cdKbn") String cdKbn, @Param("kb") String kb);

    int insert(ZzTm050 record);

    int insertSelective(ZzTm050 record);

    ZzTm050 selectByPrimaryKey(@Param("idSystem") String idSystem, @Param("cdKbn") String cdKbn, @Param("kb") String kb);

    int updateByPrimaryKeySelective(ZzTm050 record);

    int updateByPrimaryKey(ZzTm050 record);
}