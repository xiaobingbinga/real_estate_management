package com.xuetang9.house.houselogin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.xuetang9.house.houselogin.mapper")
public class HouseLoginApplication {

    public static void main(String[] args) {
        SpringApplication.run(HouseLoginApplication.class, args);
    }

}
