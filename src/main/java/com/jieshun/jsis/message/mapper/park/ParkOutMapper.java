package com.jieshun.jsis.message.mapper.park;

import java.util.List;
import java.util.Set;

import org.apache.ibatis.annotations.Param;

import com.jieshun.jsis.message.entity.park.ParkOut;

import tk.mybatis.mapper.common.Mapper;

public interface ParkOutMapper extends Mapper<ParkOut> {
  void insertBatch(@Param("list") List<ParkOut> list);

  Set<String> selectByIds(@Param("list") List<ParkOut> lsit, @Param("controlUnit") String controlUnit);

  void updateBatch(@Param("list") List<ParkOut> list, @Param("controlUnit") String controlUnit);
}
