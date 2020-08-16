package com.xuetang9.househouses;

import com.xuetang9.house.domain.Properties;
import com.xuetang9.house.dto.properties.ConditionTo;
import com.xuetang9.house.vo.JsonResult;
import com.xuetang9.househouses.service.HouseListService;
import com.xuetang9.househouses.service.impl.HouseListServiceImpl;
import com.xuetang9.househouses.web.HouseListController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class HouseHousesApplicationTests {

    @Autowired
    private HouseListService houseListService;

    @Test
    void contextLoads() {
       ConditionTo conditionTo = new ConditionTo();
       conditionTo.setId(1);
       Properties properties = houseListService.getById(1);
        System.out.println(properties);
    }

}
