package com.xuetang9.house.houseagents;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.web.client.RestTemplate;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import tk.mybatis.spring.annotation.MapperScan;

// @EnableAspectJAutoProxy // 开启切面

@EnableEurekaClient
@EnableCircuitBreaker
@SpringBootApplication(excludeName = {"com.xuetang9.house.houseagents.web"})
@ComponentScan("com.xuetang9.house.houseagents.web")
@ComponentScan("com.xuetang9.house.config")
@MapperScan("com.xuetang9.house.mapper")
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
