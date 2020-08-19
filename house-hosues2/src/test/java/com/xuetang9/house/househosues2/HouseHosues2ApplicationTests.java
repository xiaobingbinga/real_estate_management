package com.xuetang9.house.househosues2;

import com.xuetang9.house.househosues2.web.HouseController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HouseHosues2ApplicationTests {

    @Autowired
    private HouseController houseController;

    @Test
    void contextLoads() {
        System.out.println(houseController.getAdProperties());

    }

}
