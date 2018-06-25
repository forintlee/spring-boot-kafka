
 /**
 * Copyright 2018-2025 JSST All Rights Reserved.
 */
 
package com.jieshun.jsis.message.service.impl;

import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.jieshun.jsis.message.entity.park.ParkOut;
import com.jieshun.jsis.message.mapper.park.ParkOutMapper;
import com.jieshun.jsis.message.service.IParkOutService;

/**
 * 车量出场业务逻辑
 * @author sz_jht224
 * @since 2018年6月15日
 */
@Service
public class ParkOutServiceImpl extends AbstractBaseService<ParkOutMapper, ParkOut> implements IParkOutService {

  @Override
  public void insertBatch(List<ParkOut> lsit) {
    this.mapper.insertBatch(lsit);
  }

  @Override
  public Set<String> selectByIds(List<ParkOut> lsit, String controlUnit) {
    return this.mapper.selectByIds(lsit, controlUnit);
  }

  @Override
  public void updateBatch(List<ParkOut> lsit,String controlUnit) {
    this.mapper.updateBatch(lsit,controlUnit);
  }

}
