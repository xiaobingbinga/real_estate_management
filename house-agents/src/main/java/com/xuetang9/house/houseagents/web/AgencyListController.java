package com.xuetang9.house.houseagents.web;

import com.xuetang9.house.domain.Agency;
import com.xuetang9.house.dto.properties.PageTo;
import com.xuetang9.house.houseagents.domain.vo.AgencyListVo;
import com.xuetang9.house.houseagents.service.AgencyService;
import com.xuetang9.house.vo.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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

    @Autowired
    private AgencyService agencyService;

    /**
     * 代理商列表
     * @param pageTo
     * @return
     */
    @RequestMapping("/agency-list")
    public JsonResult angecyListByPage(PageTo pageTo){
        JsonResult jsonResult = new JsonResult();

        try{
            List<AgencyListVo> agencyListVos =  agencyService.listAgencyVoByPage(pageTo.getPageNum(),pageTo.getPageSize());
            if(agencyListVos != null && agencyListVos.size() > 0){
                jsonResult.setData(agencyListVos);
                jsonResult.setCode(200);
            }else{
                jsonResult.setCode(1001);
                jsonResult.setMessage("未查找到代理商数据");
            }
        }catch (Exception e){
            jsonResult.setCode(1000);
            jsonResult.setMessage("代理商列表信息查询错误");
            e.printStackTrace();
        }


        return jsonResult;
    }




}
