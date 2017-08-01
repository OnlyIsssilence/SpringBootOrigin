package com.onlyisssilence.muya.controller;

import com.onlyisssilence.muya.rabbitmq.HelloSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Author: MuYa
 * Date  : 2017/7/21
 * Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RabbitMqHelloTest {
    @Autowired
    private HelloSender helloSender;

    @Test
    public void hello() throws Exception {
        helloSender.send();
    }



}
