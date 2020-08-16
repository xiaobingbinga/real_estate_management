package com.xuetang9.house.houseagents;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.xuetang9.house.mapper")
public class HouseAgentsApplication {

    public static void main(String[] args) {
        SpringApplication.run(HouseAgentsApplication.class, args);
    }

}
