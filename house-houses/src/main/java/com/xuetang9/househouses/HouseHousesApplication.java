package com.xuetang9.househouses;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class HouseHousesApplication {

    public static void main(String[] args) {
        SpringApplication.run(HouseHousesApplication.class, args);
    }

}
