
/**
 * Copyright 2018-2025 JSST All Rights Reserved.
 */

package com.jieshun.jsis.message.service.impl;

import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.jieshun.jsis.message.entity.park.ParkIn;
import com.jieshun.jsis.message.mapper.park.ParkInMapper;
import com.jieshun.jsis.message.service.IParkInService;

/**
 * 车辆入场业务逻辑
 * 
 * @author sz_jht224
 * @since 2018年6月19日
 */
@Service
public class ParkInServiceImpl extends AbstractBaseService<ParkInMapper, ParkIn> implements IParkInService {


  @Override
  public void updateBatch(List<ParkIn> list, String controlUnit) {
    this.mapper.updateBatch(list, controlUnit);
  }

  @Override
  public void insertBatch(List<ParkIn> list) {
    this.mapper.insertBatch(list);
  }

  @Override
  public Set<String> selectByIds(List<ParkIn> list, String controlUnit) {
    return this.mapper.selectByIds(list, controlUnit);
  }

}
