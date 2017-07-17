package com.onlyisssilence.muya.controller;

import com.onlyisssilence.muya.domain.entity.MuyaProperties;
import org.springframework.beans.factory.annotation.Autowired;
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

    @RequestMapping("/hello")
    public String index() {
        return muyaProperties.toString();
    }
}
