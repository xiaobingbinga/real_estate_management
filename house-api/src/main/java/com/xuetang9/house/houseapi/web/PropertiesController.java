package com.xuetang9.house.houseapi.web;

import com.xuetang9.house.houseapi.dto.properties.ConditionTo;
import com.xuetang9.house.houseapi.domain.properties.Properties;
import com.xuetang9.house.houseapi.dto.JsonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName: PropertiesController
 * @Description: TODO
 * @Author: 天冬
 * @Date: 2020-08-03 18:55
 * @Address: 成都市锦江区西部国际金融中心老九学堂
 * @Version: v1.0
 */
@RestController
@RequestMapping("/properties")
@Api(tags = "房产数据访问接口")
public class PropertiesController {

    @PostMapping("condition")
    @ApiOperation(value = "房产信息搜索接口",tags = "房产数据访问接口")
    public JsonResult condition(@RequestBody @ApiParam(value = "查询对象",required = true) ConditionTo conditionTo){
        JsonResult jsonResult = new JsonResult();
        Properties properties = new Properties();
        properties.setId(1);
        properties.setOwnerId(1);
        properties.setTitle("依澜雅居");
        properties.setCity(conditionTo.getCity());
        properties.setAddress("双流区电子科技工业园");
        properties.setStatusId(conditionTo.getStatusId());
        properties.setType(conditionTo.getType());
        properties.setRentType(1);
        properties.setPrice(650.00);
        properties.setSquare(15.00);
        properties.setPictureUrl("w=640&h=480&crop=1");
        properties.setRoomNumber(conditionTo.getRoomNumber());
        properties.setBathroomNumber(conditionTo.getBathroomNumber());

        try {
            jsonResult.setCode(200);
            jsonResult.setData(properties);
        } catch (Exception e) {
            e.printStackTrace();
            jsonResult.setCode(3000);
            jsonResult.setMessage("数据库查询失败");
        }
        return jsonResult;
    }

    @PostMapping("properties-add")
    @ApiOperation(value = "房产信息新增接口",tags = "房产数据增加接口")
    public JsonResult propertiesAdd(@RequestBody @ApiParam(value = "查询对象",required = true)Properties properties){
        JsonResult jsonResult = new JsonResult();
        try {
            jsonResult.setCode(200);
            jsonResult.setData(properties);
        } catch (Exception e) {
            e.printStackTrace();
            jsonResult.setCode(3000);
            jsonResult.setMessage("数据库新增失败");
        }
        return jsonResult;
    }

    @GetMapping("condition-features")
    @ApiOperation(value = "推荐特色房产接口",tags = "房产数据访问接口")
    public JsonResult conditionFeatures(@RequestBody @ApiParam(value = "测试对象",required = true)Properties properties){
        JsonResult jsonResult = new JsonResult();
        properties.setSpecial(1);
        try {
            jsonResult.setCode(200);
            jsonResult.setData(properties);
        } catch (Exception e) {
            e.printStackTrace();
            jsonResult.setCode(3000);
            jsonResult.setMessage("数据库查询失败");
        }
        return jsonResult;
    }

    @GetMapping("condition-info")
    @ApiOperation(value = "房产列表接口",tags = "房产数据访问接口")
    public JsonResult conditionInfo(@RequestBody @ApiParam(value = "测试对象",required = true)Properties properties){
        JsonResult jsonResult = new JsonResult();
        try {
            jsonResult.setCode(200);
            jsonResult.setData(properties);
        } catch (Exception e) {
            e.printStackTrace();
            jsonResult.setCode(3000);
            jsonResult.setMessage("数据库查询失败");
        }
        return jsonResult;
    }

    @PostMapping("properties-info")
    @ApiOperation(value = "房产信息搜索接口",tags = "房产数据访问接口")
    public JsonResult propertiesInfo(@RequestBody @ApiParam(value = "查询对象",required = true)ConditionTo conditionTo){
        JsonResult jsonResult = new JsonResult();
        Properties properties = new Properties();
        properties.setId(1);
        properties.setOwnerId(1);
        properties.setTitle("依澜雅居");
        properties.setCity(conditionTo.getCity());
        properties.setAddress("双流区电子科技工业园");
        properties.setStatusId(conditionTo.getStatusId());
        properties.setType(conditionTo.getType());
        properties.setRentType(1);
        properties.setPrice(650.00);
        properties.setSquare(15.00);
        properties.setPictureUrl("w=640&h=480&crop=1");
        properties.setRoomNumber(conditionTo.getRoomNumber());
        properties.setBathroomNumber(conditionTo.getBathroomNumber());

        try {
            jsonResult.setCode(200);
            jsonResult.setData(properties);
        } catch (Exception e) {
            e.printStackTrace();
            jsonResult.setCode(3000);
            jsonResult.setMessage("数据库查询失败");
        }
        return jsonResult;
    }

    @GetMapping("advertising")
    @ApiOperation(value = "广告位房产接口",tags = "房产数据访问接口")
    public JsonResult advertising(@RequestBody @ApiParam(value = "测试对象",required = true)Properties properties){
        JsonResult jsonResult = new JsonResult();
        properties.setAd(1);
        try {
            jsonResult.setCode(200);
            jsonResult.setData(properties);
        } catch (Exception e) {
            e.printStackTrace();
            jsonResult.setCode(3000);
            jsonResult.setMessage("数据库查询失败");
        }
        return jsonResult;
    }

    @GetMapping("condition-add")
    @ApiOperation(value = "推荐新增房产接口",tags = "房产数据访问接口")
    public JsonResult conditionAdd(@RequestBody @ApiParam(value = "测试对象",required = true)Properties properties){
        JsonResult jsonResult = new JsonResult();
        properties.setNews(1);
        try {
            jsonResult.setCode(200);
            jsonResult.setData(properties);
        } catch (Exception e) {
            e.printStackTrace();
            jsonResult.setCode(3000);
            jsonResult.setMessage("数据库查询失败");
        }
        return jsonResult;
    }
}
