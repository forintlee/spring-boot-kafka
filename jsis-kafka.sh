#!/bin/sh

APP_NAME=jsis-kafka
JAR_FILE=$APP_NAME-2.0.0.jar

pid=0
start(){
  checkpid
  if [ ! "$pid" ]; then
  	echo "$JAR_FILE"
  	echo "$APP_NAME service is starting...."
    nohup java -jar $JAR_FILE > info.log 2>&1 &
    sleep 5s
    checkpid
    echo "$pid"
    if [ "$pid" ]; then
    	echo "$APP_NAME Service was started successfully"
    else
     	echo "Failed to start $APP_NAME Service,please see the info.log file"
    fi
  else
      echo "$APP_NAME is runing PID: $pid"   
  fi
}

stop(){
    checkpid
    if [ ! "$pid" ]; then
     echo "$APP_NAME is not runing"
    else
      kill -9 $pid
      echo "$APP_NAME has been stopped"
    fi 
}

restart(){
    stop 
    sleep 1s
    start
}

checkpid(){
    pid=`ps -ef |grep $JAR_FILE |grep -v grep |awk '{print $2}'`
}

case $1 in  
start) 
	start;;  
stop)  
	stop;; 
restart)  
	restart;;  
*) 
	echo "require start|stop|restart";;
esac 
