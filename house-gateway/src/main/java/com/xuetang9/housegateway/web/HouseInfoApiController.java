package com.xuetang9.housegateway.web;

import com.xuetang9.house.vo.JsonResult;
import com.xuetang9.housegateway.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName: HouseInfoApiController
 * @Description: TODO
 * @Author: 天冬
 * @Date: 2020-08-17 16:55
 * @Address: 成都市锦江区西部国际金融中心老九学堂
 * @Version: v1.0
 */
@RestController
@RequestMapping("/")
public class HouseInfoApiController {

    @Autowired
    private HouseService houseService;

//    private final String URL = "http://HOUSE-HOUSES/properties/";
//
//    @Autowired
//    RestTemplate restTemplate;

    @GetMapping("/properties-info/{id}")
    public JsonResult houseInfoByCondition(@PathVariable("id") Integer id){
//        return restTemplate.getForObject(URL + "properties-info?id={0}",JsonResult.class,id);
        JsonResult jsonResult = houseService.houseInfoByCondition(id);
        return jsonResult;
    }
}
