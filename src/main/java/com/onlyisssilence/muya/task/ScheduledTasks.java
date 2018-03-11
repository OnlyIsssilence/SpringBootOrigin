package com.onlyisssilence.muya.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Author: MuYa
 * Date  : 2017/7/24
 * Description:spring自带支持定时器的任务实现，直接启动包即可
 */
/*@Component
@Configurable
@EnableScheduling*/
public class ScheduledTasks{
    public final static Logger logger = LoggerFactory.getLogger(ScheduledTasks.class);


    public final static long SECOND = 1 * 1000;
    /**
     * 固定等待时间 @Scheduled(fixedDelay = 时间间隔 )
     */
    @Scheduled(fixedRate = SECOND * 30)
    public void fixedDelayJob(){
        logger.info ("fixedDelayJob Tasks Examples: The time is now " + dateFormat ().format (new Date()));
    }

    /**
     * 固定间隔时间 @Scheduled(fixedRate = 时间间隔 )
     */
    @Scheduled(fixedRate = SECOND * 3)
    public void fixedRateJob (){
        logger.info ("fixedRateJob Tasks Examples: The time is now " + dateFormat ().format (new Date()));
    }

    //每1分钟执行一次

    /**
     * cron表达式，每秒执行一次
     */
    @Scheduled(cron = "0/1 * *  * * * ")
    public void cronJob(){
        logger.info ("cronJob Tasks Examples By Cron: The time is now " + dateFormat ().format (new Date ()));
    }

    private SimpleDateFormat dateFormat(){
        return new SimpleDateFormat ("HH:mm:ss");
    }
}
