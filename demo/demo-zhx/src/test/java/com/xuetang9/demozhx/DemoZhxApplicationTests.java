package com.xuetang9.demozhx;

import com.xuetang9.demo.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

@SpringBootTest
class DemoZhxApplicationTests {

    @Autowired
    private RestTemplate restTemplate;

    @Test
    void contextLoads() {
        String url = "http://192.168.3.48:10080/user/5";
        User user = restTemplate.getForObject(url, User.class);
        System.out.println(user);
    }

}
