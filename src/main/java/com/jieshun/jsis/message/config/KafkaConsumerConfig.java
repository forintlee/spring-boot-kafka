
 /**
 * Copyright 2018-2025 JSST All Rights Reserved.
 */
 
package com.jieshun.jsis.message.config;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.config.KafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.listener.AbstractMessageListenerContainer.AckMode;
import org.springframework.kafka.listener.ConcurrentMessageListenerContainer;

/** kafka 消费者配置
 * @author sz_jht224
 * @since 2018年6月14日
 */
@Configuration
public class KafkaConsumerConfig {
  
  @Value("${kafka.consumer.bootstrap.servers}")
  private String bootstrapServers;
  @Value("${kafka.consumer.enable.auto.commit}")
  private boolean enableAutoCommit;
  @Value("${kafka.consumer.auto.commit.interval.ms}")
  private String autoCommitInterval;
  @Value("${kafka.consumer.auto.offset.reset}")
  private String autoOffsetReset;
  @Value("${kafka.consumer.session.timeout.ms}")
  private String sessionTimeout;
  @Value("${kafka.consumer.heartbeat.interval.ms}")
  private String heartbeat;
  @Value("${kafka.consumer.max.poll.records}")
  private String maxPollRecords;
  @Value("${kafka.consumer.group.id}")
  private String groupId;
  
  @Bean
  KafkaListenerContainerFactory<ConcurrentMessageListenerContainer<String, String>> batchFactory() {
      ConcurrentKafkaListenerContainerFactory<String, String> factory = new ConcurrentKafkaListenerContainerFactory<>();
      factory.setConsumerFactory(consumerFactory());
      factory.setBatchListener(true);
      factory.getContainerProperties().setAckMode(AckMode.MANUAL_IMMEDIATE);
      factory.getContainerProperties().setPollTimeout(3000);//默认轮询超时时间
      return factory;
  }

  public ConsumerFactory<String, String> consumerFactory() {
      return new DefaultKafkaConsumerFactory<>(consumerConfigs());
  }

  public Map<String, Object> consumerConfigs() {
      Map<String, Object> props = new HashMap<>();
      props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG,bootstrapServers);
      props.put(ConsumerConfig.ENABLE_AUTO_COMMIT_CONFIG, enableAutoCommit);
      props.put(ConsumerConfig.AUTO_COMMIT_INTERVAL_MS_CONFIG, autoCommitInterval);
      props.put(ConsumerConfig.SESSION_TIMEOUT_MS_CONFIG, sessionTimeout);
      props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
      props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
      props.put(ConsumerConfig.GROUP_ID_CONFIG,groupId);
      props.put(ConsumerConfig.MAX_POLL_RECORDS_CONFIG, maxPollRecords);
      props.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG,autoOffsetReset);
      props.put(ConsumerConfig.HEARTBEAT_INTERVAL_MS_CONFIG, heartbeat);
      return props;
  }
}
