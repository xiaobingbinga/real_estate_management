package com.xuetang9.househouses;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;
import tk.mybatis.spring.annotation.MapperScan;

@EnableCaching
@EnableEurekaClient
@EnableCircuitBreaker
@SpringBootApplication(excludeName = {"com.xuetang9.househouses.web"})
//@SpringCloudApplication
@MapperScan({"com.xuetang9.house.mapper","com.xuetang9.househouses.mapper"})
@ComponentScan("com.xuetang9.househouses.web")
@ComponentScan("com.xuetang9.house.config")
public class HouseHousesApplication {

    public static void main(String[] args) {
        SpringApplication.run(HouseHousesApplication.class, args);
    }

    @Bean
    @LoadBalanced

    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
