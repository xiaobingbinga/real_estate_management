package com.xuetang9.house.houseagents;

import com.github.pagehelper.PageInfo;
import com.xuetang9.house.domain.Agent;
import com.xuetang9.house.dto.properties.PageTo;
import com.xuetang9.house.houseagents.service.AgencyService;
import com.xuetang9.house.houseagents.service.AgentService;
import com.xuetang9.house.houseagents.service.Impl.AgencyServiceImpl;
import com.xuetang9.house.houseagents.service.Impl.AgentServiceImpl;
import com.xuetang9.house.houseagents.web.AgencyListController;
import com.xuetang9.house.houseagents.web.AgentListController;
import com.xuetang9.house.vo.JsonResult;
import org.apache.commons.lang.StringUtils;
import org.junit.jupiter.api.Test;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import sun.management.resources.agent;

import java.util.HashMap;
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
        System.out.println(agencyService.agencyInfoById(2L));
        // System.out.println(agencyService.listAgencyVoByPage(1, 3));

    }

}
