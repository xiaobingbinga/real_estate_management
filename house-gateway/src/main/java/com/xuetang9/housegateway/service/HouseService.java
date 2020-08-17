package com.xuetang9.housegateway.service;

import com.xuetang9.house.vo.JsonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @ClassName: HouseService
 * @Description: TODO
 * @Author: 天冬
 * @Date: 2020-08-17 20:39
 * @Address: 成都市锦江区西部国际金融中心老九学堂
 * @Version: v1.0
 */
@FeignClient("HOUSE-HOUSES")
public interface HouseService {

    @GetMapping("/properties/properties-info/{id}")
    JsonResult houseInfoByCondition(@PathVariable("id") Integer id);
}
