package com.onlyisssilence.muya.controller;

import com.onlyisssilence.muya.domain.UserInfoRepository;
import com.onlyisssilence.muya.domain.entity.MuyaProperties;
import com.onlyisssilence.muya.domain.entity.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: MuYa
 * Date: 2017-06-27
 * Time: 下午 11:43
 */
@RestController
public class HelloWorldController {
    @Autowired
    private MuyaProperties muyaProperties;

    @Autowired
    private UserInfoRepository userInfoRepository;

    @RequestMapping("/hello")
    public String index() {
        return muyaProperties.toString();
    }

    @RequestMapping("/getUser")
    @Cacheable(value="userInfo-key")
    public UserInfo getUser() {
        UserInfo user=userInfoRepository.findByUserName("bb2");
        System.out.println("no cache");
        return user;
    }
}
