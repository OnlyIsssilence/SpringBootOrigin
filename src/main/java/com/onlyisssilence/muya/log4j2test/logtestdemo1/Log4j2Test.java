package com.onlyisssilence.muya.log4j2test.logtestdemo1;


import com.onlyisssilence.muya.log4j2test.logtestdemo2.Log4j2Test2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;

/**
 * Author: MuYa
 * Date  : 2017/8/22
 * Description:
 */
public class Log4j2Test {

//    static Logger logger = LogManager.getLogger( Log4j2Test.class.getName());
    public final static Logger logger = LoggerFactory.getLogger(Log4j2Test.class);

    public static void main(String[] args) {

        System.out.println("1111111111111");
        logger.info("This is an info log.");
        logger.warn("This is a warn log.");
        Log4j2Test2 lt2 = new Log4j2Test2();

        lt2.printLog();
    }
}
