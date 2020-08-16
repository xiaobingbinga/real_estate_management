package com.xuetang9.house.houseagents.web;

import com.xuetang9.house.dto.agent.AgentTo;
import com.xuetang9.house.vo.JsonResult;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version 1.0
 * @desc:
 * @author: 纪锦浩
 * @data: 2020年08月15日20:52
 * @address：成都市锦江区西部金融中心
 */
@CacheConfig
@RequestMapping("/agent")
@RestController
public class AgentInfoController {

    /**
     * 代理人详细信息
     * @param agentTo
     * @return
     */
    @PostMapping("/agent-info")
    public JsonResult agentInfo(AgentTo agentTo){
        JsonResult jsonResult = new JsonResult();
        return jsonResult;
    }

}
