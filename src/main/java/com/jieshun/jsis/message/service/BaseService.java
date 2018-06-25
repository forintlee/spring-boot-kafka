package com.jieshun.jsis.message.service;

import java.util.List;
import java.util.Set;

/**
 * 
 * 通用业务接口
 * 
 * @author sz_jht224
 * @since 2018年5月29日
 * @param <T>
 */
public interface BaseService<T> {
  /**
   * 查询
   *
   * @param entity
   * @return
   */
  T selectOne(T entity);

  /**
   * 通过Id查询
   *
   * @param id
   * @return
   */
  T selectById(Object id);


  /**
   * 查询列表
   *
   * @param entity
   * @return
   */
  List<T> selectList(T entity);


  /**
   * 获取所有对象
   *
   * @return
   */
  List<T> selectListAll();


  /**
   * 查询总记录数
   *
   * @param entity
   * @return
   */
  Long selectCount(T entity);

  /**
   * 添加
   *
   * @param entity
   */
  void insert(T entity);


  /**
   * 添加
   *
   * @param entity
   */
  void insertSelective(T entity);

  /**
   * 删除
   *
   * @param entity
   */
  void delete(T entity);

  /**
   * 根据Id删除
   *
   * @param id
   */
  void deleteById(Object id);


  /**
   * 根据id更新
   *
   * @param entity
   */
  void updateById(T entity);

  /**
   * 批量更新出场数据
   * @param lsit void
   */
  void updateBatch(List<T> list,String controlUnit);
  
  /**
   * 批量插入出场数据
   * @param lsit void
   */
  void insertBatch(List<T> list);
  /**
   * 根据控制单元和多个id查询是分片的数据 
   * @param lsit
   * @param controlUnit
   * @return List<ParkOut>
   */
  Set<String> selectByIds(List<T> list,String controlUnit);
}
