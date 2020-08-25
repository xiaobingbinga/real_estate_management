package com.xuetang9.house.houseagents;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.web.client.RestTemplate;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import tk.mybatis.spring.annotation.MapperScan;

import java.util.HashMap;


// @EnableAspectJAutoProxy // 开启切面


@EnableEurekaClient
@EnableCaching
@EnableCircuitBreaker
@SpringBootApplication(excludeName = {"com.xuetang9.house.houseagents.web"})
@ComponentScan("com.xuetang9.house.houseagents.web")
@ComponentScan("com.xuetang9.house.config")
@MapperScan({"com.xuetang9.house.houseagents.mapper","com.xuetang9.house.mapper"})
@EnableSwagger2
public class HouseAgentsApplication {

    public static void main(String[] args) {
        SpringApplication.run(HouseAgentsApplication.class, args);
    }

    @Bean
    // @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }


}
