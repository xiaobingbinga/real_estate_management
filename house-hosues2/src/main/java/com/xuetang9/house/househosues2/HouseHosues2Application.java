package com.xuetang9.house.househosues2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class HouseHosues2Application {

    public static void main(String[] args) {
        SpringApplication.run(HouseHosues2Application.class, args);
    }

}
