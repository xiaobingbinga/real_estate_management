package com.xuetang9.house.houseagents;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import tk.mybatis.spring.annotation.MapperScan;

@SpringCloudApplication
@MapperScan("com.xuetang9.house.mapper")
@EnableSwagger2
public class HouseAgentsApplication {

    public static void main(String[] args) {
        SpringApplication.run(HouseAgentsApplication.class, args);
    }

    @Bean
    // @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

}
