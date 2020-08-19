package com.xuetang9.house.housegateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class HouseGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(HouseGatewayApplication.class, args);
    }

}
