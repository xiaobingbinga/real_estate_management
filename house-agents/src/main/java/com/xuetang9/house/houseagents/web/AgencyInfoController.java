package com.xuetang9.house.houseagents.web;

import com.xuetang9.house.dto.agency.AgencyTo;
import com.xuetang9.house.vo.JsonResult;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version 1.0
 * @desc:
 * @author: 纪锦浩
 * @data: 2020年08月15日21:00
 * @address：成都市锦江区西部金融中心
 */
@CacheConfig
@RequestMapping("/agency")
@RestController
public class AgencyInfoController {

    /**
     * 代理商详细信息
     * @param agencyTo
     * @return
     */
    @PostMapping("/agency-info")
    public JsonResult agencyInfo(AgencyTo agencyTo){
        JsonResult jsonResult = new JsonResult();

        return jsonResult;
    }
}
