package com.onlyisssilence.muya.controller;

import com.onlyisssilence.muya.domain.db1.Config;
import com.onlyisssilence.muya.domain.db1.ConfigRepository;
import com.onlyisssilence.muya.domain.db1.UserInfo;
import com.onlyisssilence.muya.domain.db1.UserInfoRepository;
import com.onlyisssilence.muya.domain.db2.Message;
import com.onlyisssilence.muya.domain.db2.MessageRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.DateFormat;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: MuYa
 * Date: 2017-07-18
 * Time: 上午 12:16
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ConfigTests {

    @Autowired
    private ConfigRepository configRepository;

    @Test
    public void test() throws Exception {
        configRepository.save(new Config("0/3 * * * * ?"));

       }



}













