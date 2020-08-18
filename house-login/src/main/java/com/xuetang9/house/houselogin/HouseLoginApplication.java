package com.xuetang9.house.houselogin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

@SpringCloudApplication
@MapperScan("com.xuetang9.house.houselogin.mapper")
public class HouseLoginApplication {

    public static void main(String[] args) {
        SpringApplication.run(HouseLoginApplication.class, args);
    }

}
