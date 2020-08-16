package com.xuetang9.house.houseagents.web;

import com.netflix.discovery.converters.Auto;
import com.xuetang9.house.dto.agent.AgentTo;
import com.xuetang9.house.houseagents.domain.vo.AgentInfoVo;
import com.xuetang9.house.houseagents.service.AgentService;
import com.xuetang9.house.vo.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private AgentService agentService;

    /**
     * 代理人详细信息
     * @param agentTo
     * @return
     */
    @PostMapping("/agent-info")
    public JsonResult agentInfo(AgentTo agentTo){
        JsonResult jsonResult = new JsonResult();
        try{
            AgentInfoVo agentInfoVo =  agentService.agentInfoById((long)agentTo.getUserId());
            if(agentInfoVo != null){
                jsonResult.setCode(200);
                jsonResult.setData(agentInfoVo);
            }else{
                jsonResult.setCode(1001);
                jsonResult.setMessage("未查询到该代理人信息");
            }
        }catch (Exception e){
            jsonResult.setCode(1000);
            jsonResult.setMessage("代理人详细信息查询错误");
            e.printStackTrace();
        }
        return jsonResult;
    }

}
