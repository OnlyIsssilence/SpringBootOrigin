package com.onlyisssilence.muya.controller;

import com.fasterxml.jackson.annotation.JsonView;
import com.onlyisssilence.muya.domain.db1.UserInfoRepository;
import com.onlyisssilence.muya.domain.entity.MuyaProperties;
import com.onlyisssilence.muya.domain.db1.UserInfo;
import com.onlyisssilence.muya.domain.view.BasicView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.UUID;


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
    @JsonView(BasicView.class)
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

    @RequestMapping("/uid")
    String uid(HttpSession session) {
        UUID uid = (UUID) session.getAttribute("uid");
        if (uid == null) {
            uid = UUID.randomUUID();
        }
        session.setAttribute("uid", uid);
        return session.getId();
    }

    /*
    @Cacheable: 插入缓存
    value: 缓存名称
    key: 缓存键，一般包含被缓存对象的主键，支持Spring EL表达式
    unless: 只有当查询结果不为空时，才放入缓存
    @CacheEvict: 失效缓存
    */
    @RequestMapping("/findCache")
    @Cacheable(value="userInfoCache", key="'muya:userInfo:'+#username", unless="#result==null")
    public UserInfo findByName(String username) {
        return userInfoRepository.findByUserName(username);
    }

    @RequestMapping("/deleteCache")
    @CacheEvict(value="userInfoCache", key="'muya:userInfo:'+#userInfo.username")
    public void delete(long id) {
        userInfoRepository.delete(id);
    }
}
