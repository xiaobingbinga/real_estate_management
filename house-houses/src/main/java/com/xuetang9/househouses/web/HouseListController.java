package com.xuetang9.househouses.web;


import com.xuetang9.house.domain.Properties;
import com.xuetang9.house.dto.properties.ConditionTo;
import com.xuetang9.house.dto.properties.PageTo;
import com.xuetang9.house.vo.JsonResult;
import com.xuetang9.househouses.domain.vo.DisplayVo;
import com.xuetang9.househouses.service.HouseListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @ClassName: HouseInfoController
 * @Description: 房产列表控制器
 * @Author: 天冬
 * @Date: 2020-08-13 16:04
 * @Address: 成都市锦江区西部国际金融中心老九学堂
 * @Version: v1.0
 */
@CacheConfig
@RestController
@RequestMapping("/properties")
public class HouseListController {

    @Autowired
    private HouseListService houseListService;

    /**
     * 根据条件返回房产信息
     * @return
     */
    @PostMapping("/condition")
    public JsonResult houseListByCondition(@RequestBody ConditionTo conditionTo){
        JsonResult jsonResult = new JsonResult();
        List<DisplayVo> displayVos = houseListService.selectCondition(conditionTo);
        try {
            jsonResult.setCode(200);
            jsonResult.setData(displayVos);
        } catch (Exception e) {
            e.printStackTrace();
            jsonResult.setCode(1000);
            jsonResult.setMessage("数据库查询失败");
        }
        return jsonResult;
    }


    /**
     * 推荐新增房产
     * @return
     */
    @GetMapping("/properties-add")
    public JsonResult houseListByAdd(){
        JsonResult jsonResult = new JsonResult();
        List<DisplayVo> displayVos = houseListService.selectNew(6);
        try {
            jsonResult.setCode(200);
            jsonResult.setData(displayVos);
        } catch (Exception e) {
            e.printStackTrace();
            jsonResult.setCode(1000);
            jsonResult.setMessage("数据库查询失败");
        }
        return jsonResult;
    }

    /**
     * 推荐特色房产
     * @return
     */
    @GetMapping("/condition-features")
    public JsonResult houseListByFeatures(Integer num){
        JsonResult jsonResult = new JsonResult();
        List<DisplayVo> displayVos = houseListService.selectSpecial(num);
        try {
            jsonResult.setCode(200);
            jsonResult.setData(displayVos);
        } catch (Exception e) {
            e.printStackTrace();
            jsonResult.setCode(1000);
            jsonResult.setMessage("数据库查询失败");
        }
        return jsonResult;
    }

    /**
     * 推荐指定数量的广告位房产
     * @param num
     * @return
     */
    @GetMapping("/advertising")
    public JsonResult houseListByAdvert(Integer num){
        JsonResult jsonResult = new JsonResult();
        List<DisplayVo> displayVos = houseListService.selectAd(num);
        try {
            jsonResult.setCode(200);
            jsonResult.setData(displayVos);
        } catch (Exception e) {
            e.printStackTrace();
            jsonResult.setCode(1000);
            jsonResult.setMessage("数据库查询失败");
        }
        return jsonResult;
    }

    /**
     * 推荐热门房产
     * @return
     */
    @GetMapping("/hot")
    public JsonResult houseListByHot(){
        JsonResult jsonResult = new JsonResult();

        return jsonResult;
    }

    /**
     * 房产列表
     * @param pageTo
     * @return
     */
    @PostMapping("/list")
    public JsonResult houseListByPage(@RequestBody PageTo pageTo) {
        JsonResult jsonResult = new JsonResult();
        List<DisplayVo> displayVos = houseListService.selectAll(pageTo.getPageNum(),pageTo.getPageSize());
        try {
            jsonResult.setCode(200);
            jsonResult.setData(displayVos);
        } catch (Exception e) {
            e.printStackTrace();
            jsonResult.setCode(1000);
            jsonResult.setMessage("数据库查询失败");
        }
        return jsonResult;
    }




}
