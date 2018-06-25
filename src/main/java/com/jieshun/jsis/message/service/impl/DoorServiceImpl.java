
/**
 * Copyright 2018-2025 JSST All Rights Reserved.
 */

package com.jieshun.jsis.message.service.impl;

import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.jieshun.jsis.message.entity.park.DoorInOut;
import com.jieshun.jsis.message.mapper.park.DoorInOutMapper;
import com.jieshun.jsis.message.service.IDoorService;

/**
 * 门禁业务逻辑
 * 
 * @author sz_jht224
 * @since 2018年6月19日
 */
@Service
public class DoorServiceImpl extends AbstractBaseService<DoorInOutMapper, DoorInOut> implements IDoorService {

  @Override
  public void updateBatch(List<DoorInOut> list, String controlUnit) {
    this.mapper.updateBatch(list, controlUnit);
  }

  @Override
  public void insertBatch(List<DoorInOut> list) {
    this.mapper.insertBatch(list);
  }

  @Override
  public Set<String> selectByIds(List<DoorInOut> list, String controlUnit) {
    return this.mapper.selectByIds(list, controlUnit);
  }

}
