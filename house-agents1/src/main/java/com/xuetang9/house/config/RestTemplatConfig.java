package com.xuetang9.house.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @USER: 柳宇
 * @DATETIME: 2020/8/17 - 14:04
 **/
@Configuration
public class RestTemplatConfig {

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return  new RestTemplate();
    }
}
