package com.xuetang9.house.houseagents.web;

import com.xuetang9.house.dto.properties.PageTo;
import com.xuetang9.house.vo.JsonResult;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version 1.0
 * @desc: 代理商列表控制器
 * @author: 纪锦浩
 * @data: 2020年08月15日20:56
 * @address：成都市锦江区西部金融中心
 */
@CacheConfig
@RequestMapping("/agency")
@RestController
public class AgencyListController {

    /**
     * 代理商列表
     * @param pageTo
     * @return
     */
    @RequestMapping("/agency-list")
    public JsonResult angecyListByPage(PageTo pageTo){
        JsonResult jsonResult = new JsonResult();

        return jsonResult;
    }




}
