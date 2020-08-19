package com.xuetang9.house.houseagents.web;

import com.xuetang9.house.vo.JsonResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version 1.0
 * @desc:
 * @author: 纪锦浩
 * @data: 2020年08月18日19:56
 * @address：成都市锦江区西部金融中心
 */
@RestController
public class CommonController {

    @RequestMapping("/un_page")
    public JsonResult missingPage(){
        JsonResult jsonResult = new JsonResult();
        jsonResult.setMessage("缺少分页数据");
        jsonResult.setCode(10002);
        return jsonResult;
    }

}
