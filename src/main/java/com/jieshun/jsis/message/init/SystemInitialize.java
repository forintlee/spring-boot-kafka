
 /**
 * Copyright 2018-2025 JSST All Rights Reserved.
 */
 
package com.jieshun.jsis.message.init;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

/**
 * 系统初始化时调用
 * @author sz_jht224
 * @since 2018年5月31日
 */
@Component
@Slf4j
public class SystemInitialize implements CommandLineRunner {


  @Override
  public void run(String... args) throws Exception {
    log.info("---消息同步系统初始化开始---");
    
    log.info("---消息同步系统初始化结束---");
  }

}
