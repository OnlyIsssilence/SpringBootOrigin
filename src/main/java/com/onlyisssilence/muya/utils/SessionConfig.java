package com.onlyisssilence.muya.utils;

import org.springframework.context.annotation.Configuration;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 * Created with IntelliJ IDEA.
 * Description:maxInactiveIntervalInSeconds: 设置Session失效时间，
 * 使用Redis Session之后，原Boot的server.session.timeout属性不再生效
 * User: MuYa
 * Date: 2017-07-19
 * Time: 上午 12:48
 */
@Configuration
@EnableRedisHttpSession(maxInactiveIntervalInSeconds = 86400 * 30)
public class SessionConfig {
}
