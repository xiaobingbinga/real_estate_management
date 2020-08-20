package com.xuetang9.MySelfRule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @USER: 柳宇
 * @DATETIME: 2020/8/17 - 14:06
 **/
@Configuration
public class MySelfRuleConfig {

    /**
     * 随机负责均衡算法
     * @return
     */
    @Bean
    public IRule myRule(){
        return new RandomRule();
    }
}
