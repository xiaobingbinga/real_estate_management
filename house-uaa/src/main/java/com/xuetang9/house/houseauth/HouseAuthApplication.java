package com.xuetang9.house.houseauth;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@SpringBootApplication
@EnableDiscoveryClient
@EnableResourceServer
@MapperScan("com.xuetang9.house.houseauth.mapper")
public class HouseAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(HouseAuthApplication.class, args);
    }

}
