package com.xuetang9.house;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @USER: 柳宇
 * @DATETIME: 2020/8/16 - 21:30
 **/
@SpringBootApplication(excludeName ="com.xuetang9.house.web")
@EnableEurekaClient
@MapperScan("com.xuetang9.house.mapper")
@ComponentScan("com.xuetang9.house")
@ComponentScan("com.xuetang9.house.config")
@EnableFeignClients
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
