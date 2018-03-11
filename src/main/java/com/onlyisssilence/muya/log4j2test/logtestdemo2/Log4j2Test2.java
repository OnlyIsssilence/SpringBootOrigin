package com.onlyisssilence.muya.log4j2test.logtestdemo2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Author: MuYa
 * Date  : 2017/8/22
 * Description:
 */
public class Log4j2Test2 {
    static Logger log = LogManager.getLogger(Log4j2Test2.class.getName());

    public void printLog() {
        log.info("This is an info log from Log4jTest2.");

        log.debug("This is a warn log from Log4jTest2.");

    }
}
