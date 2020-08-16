package com.xuetang9.househouses.web;

import com.xuetang9.house.dto.properties.AddTo;
import com.xuetang9.house.dto.properties.ConditionTo;
import com.xuetang9.house.vo.JsonResult;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @version 1.0
 * @desc: 房产信息控制器
 * @author: 纪锦浩
 * @data: 2020年08月15日19:32
 * @address：成都市锦江区西部金融中心
 */
@CacheConfig
@RestController
@RequestMapping("/properties")
public class HouseInfoController {


    /**
     * 查看房产详细信息
     * @param conditionTo
     * @return
     */
    @PostMapping("/properties-info")
    public JsonResult houseInfoByCondition(ConditionTo conditionTo){
        JsonResult jsonResult = new JsonResult();

        return jsonResult;
    }


    /**
     * 新增房产信息
     * @param addInfo
     * @return
     */
    public JsonResult newHouseInfo(AddTo addInfo){
        JsonResult jsonResult = new JsonResult();

        return jsonResult;
    }





}
