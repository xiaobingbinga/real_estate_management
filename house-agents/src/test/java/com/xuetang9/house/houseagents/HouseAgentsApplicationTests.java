package com.xuetang9.house.houseagents;

import com.xuetang9.house.domain.Agent;
import com.xuetang9.house.dto.properties.PageTo;
import com.xuetang9.house.houseagents.service.AgencyService;
import com.xuetang9.house.houseagents.service.AgentService;
import com.xuetang9.house.houseagents.service.Impl.AgentServiceImpl;
import com.xuetang9.house.houseagents.web.AgencyListController;
import com.xuetang9.house.houseagents.web.AgentListController;
import com.xuetang9.house.vo.JsonResult;
import org.junit.jupiter.api.Test;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import sun.management.resources.agent;

import java.util.List;

@SpringBootTest
class HouseAgentsApplicationTests {


    @Autowired
    private AgentService agentService;

    @Autowired
    private AgentListController agentListController;

    @Autowired
    private AgencyListController agencyListController;

    @Autowired
    private AgencyService agencyService;

    @Test
    void contextLoads() {

        // System.out.println(agentListController.agentListByStar());
        // System.out.println(agentListController.agentListByAnency(1));
        PageTo pageTo = new PageTo();
        pageTo.setPageSize(5);
        pageTo.setPageNum(2);
        System.out.println(agentListController.agentListByPage(pageTo));
        System.out.println(agentListController.agentListByStar());
    }

}
