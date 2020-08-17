package com.xuetang9.housegateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;


@EnableDiscoveryClient
//@EnableCircuitBreaker
@EnableFeignClients
@SpringBootApplication(excludeName = {"com.xuetang9.housegateway.web"})
@ComponentScan("com.xuetang9.housegateway.web")
@ComponentScan("com.xuetang9.house.config")
public class HouseGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(HouseGatewayApplication.class, args);
    }


    @Bean
//    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
