package com.jieshun.jsis.message.mapper.park;

import java.util.List;
import java.util.Set;

import org.apache.ibatis.annotations.Param;

import com.jieshun.jsis.message.entity.park.DoorInOut;

import tk.mybatis.mapper.common.Mapper;

public interface DoorInOutMapper extends Mapper<DoorInOut> {
  void insertBatch(@Param("list") List<DoorInOut> list);

  Set<String> selectByIds(@Param("list") List<DoorInOut> list, @Param("controlUnit") String controlUnit);

  void updateBatch(@Param("list") List<DoorInOut> list, @Param("controlUnit") String controlUnit);

}
