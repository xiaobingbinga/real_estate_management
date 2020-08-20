package com.xuetang9.house.config;

import feign.Logger;
import org.apache.logging.slf4j.SLF4JLoggerContextFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @USER: 柳宇
 * @DATETIME: 2020/8/17 - 13:55
 **/
@Configuration
public class FeignConfig {

    /**
     * open日志
     * @return
     */
    @Bean
    Logger.Level feinLoggerLevel(){
        return  Logger.Level.FULL;
    }
}
