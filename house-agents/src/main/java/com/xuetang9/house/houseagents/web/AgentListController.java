package com.xuetang9.house.houseagents.web;

import com.xuetang9.house.dto.properties.PageTo;
import com.xuetang9.house.dto.user.LoginTo;
import com.xuetang9.house.vo.JsonResult;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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


    /**
     * 推荐顶级代理人
     * @return
     */
    @GetMapping("recommend")
    public JsonResult agentListByStar(){
        JsonResult jsonResult = new JsonResult();

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
        return jsonResult;
    }

    /**
     * 代理商旗下代理人列表
     * @param agencyId
     * @return
     */
    @PostMapping("/condition")
    public JsonResult angentListByCondition(int agencyId){
        JsonResult jsonResult = new JsonResult();
        return jsonResult;
    }



}
