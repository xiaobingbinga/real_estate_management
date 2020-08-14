package com.xuetang9.house.houseeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class HouseEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(HouseEurekaApplication.class, args);
    }

}
