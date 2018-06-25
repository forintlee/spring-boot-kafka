kafka 消息接收服务

-- 新增功能如下所示
    1）重构消息接收服务
	
-- 是否需要执行脚本 
  	否

-- 配置说明 
    1）修改数据库链接 config/application.yml
              示例：
	url: jdbc:mysql://10.10.203.132:3306/dev_test?useUnicode=true&characterEncoding=UTF8
          username: dev_test
          password: dev_test
  
    2) 修改日志文件位置 config/application.yml
              示例：
	logging:
	  config: config/log4j2-spring.xml

    3）修改kafka配置 config/application-kafka.yml
            示例：
    kafka:
	  consumer:
	    bootstrap:
	      servers: 119.23.42.209:9092 #kafka 服务器地址
	  topic:
      door: mb.door.inout1  #门禁队列
      park:
        out: mb.park.out1  #出场队列
        in: mb.park.in1  #入场队列
      producer: 
	    bootstrap: 
	      servers: 119.23.42.209:9092
	      
    4）修改日志路径 config/log4j2-spring.xml
               示例：<Property name="filepath">/home/jht/logs</Property>
 
 -- 启动说明
启动 ./jsis-kafka.sh start
停止 ./jsis-kafka.sh stop
重启 ./jsis-kafka.sh restart

 
 