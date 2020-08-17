package com.xuetang9.househouses;

import com.xuetang9.house.domain.Properties;
import com.xuetang9.house.dto.properties.ConditionTo;
import com.xuetang9.house.vo.JsonResult;
import com.xuetang9.househouses.domain.vo.DisplayVo;
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
       conditionTo.setCity("合肥");
       List<DisplayVo> displayVos = houseListService.selectCondition(conditionTo);
        for (DisplayVo d: displayVos) {
            System.out.println(d);
        }
    }

}
