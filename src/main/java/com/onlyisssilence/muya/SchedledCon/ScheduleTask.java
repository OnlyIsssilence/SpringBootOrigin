package com.onlyisssilence.muya.SchedledCon;

import org.quartz.JobExecutionException;
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

    public void timeNow() throws JobExecutionException{
        System.out.println ("非spring自带定时任务启动，定时任务1：The time is now "
                + dateFormat ().format (new Date()));
    }

    private SimpleDateFormat dateFormat(){
        return new SimpleDateFormat ("HH:mm:ss");
    }
}
