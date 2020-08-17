package com.xuetang9.house.houseagents.web;

import com.xuetang9.house.dto.agent.AgentTo;
import com.xuetang9.house.dto.properties.PageTo;
import com.xuetang9.house.dto.user.LoginTo;
import com.xuetang9.house.houseagents.domain.vo.AgentListVo;
import com.xuetang9.house.houseagents.service.AgentService;
import com.xuetang9.house.vo.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @version 1.0
 * @desc:  代理人列表控制器
 * @author: 纪锦浩
 * @data: 2020年08月15日20:23
 * @address：成都市锦江区西部金融中心
 */
@CacheConfig
@RestController
@RequestMapping("/agent")
public class AgentListController {

    @Autowired
    private AgentService agentService;


    /**
     * 推荐顶级代理人
     * @return
     */
    @GetMapping("recommend")
    public JsonResult agentListByStar(){
        JsonResult jsonResult = new JsonResult();
        try{
            List<AgentListVo> agentVos = agentService.selectByStar();
            if(agentVos != null && agentVos.size() > 0){
                jsonResult.setCode(200);
                jsonResult.setData(agentVos);

            }else{
                jsonResult.setCode(1001);
                jsonResult.setMessage("未查询到数据");
            }
        }catch (Exception e){
            jsonResult.setCode(500);
            jsonResult.setMessage("推荐代理人查询错误");
            e.printStackTrace();
        }
        return jsonResult;
    }


    /**
     * 我的代理人
     * @param loginTo
     * @return
     */
    @PostMapping("/my-agent")
    public JsonResult agentListByUserId(LoginTo loginTo){
        JsonResult jsonResult = new JsonResult();


        return jsonResult;
    }



    /**
     * 代理人列表
     * @return
     */
    @PostMapping("/list")
    public JsonResult agentListByPage(PageTo pageTo){
        JsonResult jsonResult = new JsonResult();
        try {
            List<AgentListVo> agentVos = agentService.listAgentVoByPage(pageTo.getPageNum(),pageTo.getPageSize());
            if(agentVos != null && agentVos.size() > 0){
                jsonResult.setData(agentVos);
                jsonResult.setCode(200);
            }else{
                jsonResult.setCode(1001);
                jsonResult.setMessage("为查找到数据");
            }
        }catch (Exception e) {
            jsonResult.setCode(1000);
            jsonResult.setMessage("代理人列表查询错误");
            e.printStackTrace();
        }
        return jsonResult;
    }

    /**
     * 代理商旗下代理人列表
     * @param agencyId
     * @return
     */
    @PostMapping("/condition")
    public JsonResult agentListByAnency(int agencyId){
        JsonResult jsonResult = new JsonResult();
        try {
            List<AgentListVo> agentVos = agentService.listAgentVoByAgency(agencyId);
            if(agentVos != null && agentVos.size() > 0){
                jsonResult.setData(agentVos);
                jsonResult.setCode(200);
            }else{
                jsonResult.setCode(1001);
                jsonResult.setMessage("为查找到数据");
            }
        }catch (Exception e) {
            jsonResult.setCode(1000);
            jsonResult.setMessage("代理商旗下代理人列表查询错误");
            e.printStackTrace();
        }
        return jsonResult;
    }



}
