package com.xuetang9.house.houseagents.web;

import com.xuetang9.house.dto.agency.AgencyTo;
import com.xuetang9.house.houseagents.domain.vo.AgencyInfoVo;
import com.xuetang9.house.houseagents.service.AgencyService;
import com.xuetang9.house.vo.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.PrimitiveIterator;

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

    @Autowired
    private AgencyService agencyService;

    /**
     * 代理商详细信息
     * @param agencyTo
     * @return
     */
    @PostMapping("/agency-info")
    public JsonResult agencyInfo(AgencyTo agencyTo){
        JsonResult jsonResult = new JsonResult();
        try{
            AgencyInfoVo agencyInfoVo =  agencyService.agencyInfoById(agencyTo.getId());
            if(agencyInfoVo != null ){
                jsonResult.setData(agencyInfoVo);
                jsonResult.setCode(200);
            }else{
                jsonResult.setCode(1001);
                jsonResult.setMessage("未查找到该代理商");
            }
        }catch (Exception e){
            jsonResult.setCode(1000);
            jsonResult.setMessage("代理商详细信息查询错误");
            e.printStackTrace();
        }

        return jsonResult;
    }
}
