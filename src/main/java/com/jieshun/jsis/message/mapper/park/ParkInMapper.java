package com.jieshun.jsis.message.mapper.park;

import java.util.List;
import java.util.Set;

import org.apache.ibatis.annotations.Param;

import com.jieshun.jsis.message.entity.park.ParkIn;

import tk.mybatis.mapper.common.Mapper;

public interface ParkInMapper extends Mapper<ParkIn> {
  void insertBatch(@Param("list") List<ParkIn> list);

  Set<String> selectByIds(@Param("list") List<ParkIn> list, @Param("controlUnit") String controlUnit);

  void updateBatch(@Param("list") List<ParkIn> list, @Param("controlUnit") String controlUnit);

}