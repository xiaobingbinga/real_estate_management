package com.xuetang9.house.househosues2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import tk.mybatis.spring.annotation.MapperScan;

@EnableDiscoveryClient
@SpringBootApplication(excludeName = {"com.xuetang9.house.househouses2.web"})
@MapperScan("com.xuetang9.house.mapper")
@ComponentScan("com.xuetang9.house.househosues2.web")
@ComponentScan("com.xuetang9.house.config")
public class HouseHosues2Application {

    public static void main(String[] args) {
        SpringApplication.run(HouseHosues2Application.class, args);
    }

}
