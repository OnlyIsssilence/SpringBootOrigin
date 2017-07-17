package com.onlyisssilence.muya.controller;

import com.onlyisssilence.muya.domain.UserInfoRepository;
import com.onlyisssilence.muya.domain.entity.UserInfo;
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
public class UserRepositoryTests {
    @Autowired
    private UserInfoRepository userInfoRepository;

    @Test
    public void test() throws Exception {
        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
        String formattedDate = dateFormat.format(date);

        userInfoRepository.save(new UserInfo("aa1", "aa@126.com", "aa", "aa123456",formattedDate));
        userInfoRepository.save(new UserInfo("bb2", "bb@126.com", "bb", "bb123456",formattedDate));
        userInfoRepository.save(new UserInfo("cc3", "cc@126.com", "cc", "cc123456",formattedDate));

        Assert.assertEquals(3, userInfoRepository.findAll().size());
        Assert.assertEquals("cc123456", userInfoRepository.findByUserNameOrEmail("cc3", "cc@126.com").getNickName());
        userInfoRepository.delete(userInfoRepository.findByUserName("aa1"));
    }
}
