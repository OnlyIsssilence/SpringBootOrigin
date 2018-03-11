package com.onlyisssilence.muya.controller;

import com.onlyisssilence.muya.domain.db1.UserInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.TimeUnit;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: MuYa
 * Date: 2017-07-19
 * Time: 上午 12:11
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestRedis {
    public final static Logger logger = LoggerFactory.getLogger(TestRedis.class);

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void test() throws Exception {
        stringRedisTemplate.opsForValue().set("bbb", "111");
        Assert.assertEquals("121", stringRedisTemplate.opsForValue().get("bbb"));
    }

    @Test
    public void testObj() throws Exception {
        UserInfo user=new UserInfo("aa@126.com", "aa", "aa123456", "aa","123");
        ValueOperations<String, UserInfo> operations=redisTemplate.opsForValue();
        operations.set("com.neox", user);
        operations.set("com.neo.f", user,1, TimeUnit.SECONDS);
        Thread.sleep(1000);
        //redisTemplate.delete("com.neo.f");
        boolean exists=redisTemplate.hasKey("com.neo.f");
        if(exists){
            logger.info("exists is trueyoyoyoyoyooy");
        }else{
            logger.info("exists is falsehahhahahah");
        }
        // Assert.assertEquals("aa", operations.get("com.neo.f").getUserName());
    }
}
