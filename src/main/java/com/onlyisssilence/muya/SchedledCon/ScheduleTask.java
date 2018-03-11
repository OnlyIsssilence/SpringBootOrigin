package com.onlyisssilence.muya.SchedledCon;

import com.onlyisssilence.muya.log4j2test.logtestdemo2.Log4j2Test2;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Author: MuYa
 * Date  : 2017/7/24
 * Description:
 */
@Component
@Configurable
@EnableScheduling
public class ScheduleTask {

    public final static Logger logger = LoggerFactory.getLogger(ScheduleTask.class);

    public static Log4j2Test2 log4j2Test2 = new Log4j2Test2();


    public void timeNow() throws JobExecutionException{
        logger.info ("非spring自带定时任务启动，定时任务1：The time is now "
                + dateFormat ().format (new Date()));
        logger.debug("**********************我是debug日志*****************************");
        logger.error("**********************我是error日志******************************");
        logger.info("**********************我是info日志********************************");
        logger.warn("**********************我是warn日志********************************");

        log4j2Test2.printLog();

    }

    private SimpleDateFormat dateFormat(){
        return new SimpleDateFormat ("HH:mm:ss");
    }
}
