package com.xuetang9.house.househosues2.web;

import com.github.pagehelper.PageInfo;
import com.xuetang9.house.domain.Properties;
import com.xuetang9.house.dto.properties.ConditionDto;
import com.xuetang9.house.dto.properties.PropertiesSimpleDto;
import com.xuetang9.house.househosues2.service.PropertiesService;
import com.xuetang9.house.vo.JsonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Lucky
 * @version 1.0.0
 * @date 2020/8/15 20:08
 * @copyright 老九学堂
 */
@RestController
@RequestMapping("/properties")
@Api(tags = "房产数据访问接口")
public class HouseController {

    @Autowired
    private PropertiesService propertiesService;

    @GetMapping("/list")
    @ApiOperation(value = "房产列表数据接口",tags = "房产数据访问接口")
    public JsonResult getList(@RequestParam(defaultValue = "1") int pageNumber,
                              @RequestParam(defaultValue = "5") int pageSize){
        JsonResult jsonResult = new JsonResult();
        List<PropertiesSimpleDto> list = propertiesService.listAllSimpleByPage(pageNumber, pageSize);
        if (list.size() != 0){
            jsonResult.setCode(200);
            jsonResult.setData(new PageInfo<>(list));
        }else{
            jsonResult.setCode(4004);
            jsonResult.setMessage("no data");
        }
        return jsonResult;
    }

    @PostMapping("/condition")
    @ApiOperation(value = "房产信息搜索接口",tags = "房产数据访问接口")
    public JsonResult search(@RequestBody @ApiParam(value = "查询对象",required = true) ConditionDto condition){
        JsonResult jsonResult = new JsonResult();
        List<PropertiesSimpleDto> list = propertiesService.listByCondition(condition);
        if (list.size() != 0){
            jsonResult.setCode(200);
            jsonResult.setData(new PageInfo<>(list));
        }else{
            jsonResult.setCode(4004);
            jsonResult.setMessage("no data");
        }
        return jsonResult;
    }

    @GetMapping("/condition-features")
    @ApiOperation(value = "特色房产列表接口",tags = "房产数据访问接口")
    public JsonResult getFeatures(){
        JsonResult jsonResult = new JsonResult();
        List<PropertiesSimpleDto> list = propertiesService.listFeatures();
        if (list.size() != 0){
            jsonResult.setCode(200);
            jsonResult.setData(list.subList(0,3));
        }else{
            jsonResult.setCode(4004);
            jsonResult.setMessage("no data");
        }
        return jsonResult;
    }

    @GetMapping("/properties-add")
    @ApiOperation(value = "新增房产列表接口",tags = "房产数据访问接口")
    public JsonResult getNewProperties(){
        JsonResult jsonResult = new JsonResult();
        List<PropertiesSimpleDto> list = propertiesService.listNewProperties();
        if (list.size() != 0){
            jsonResult.setCode(200);
            jsonResult.setData(list);
        }else{
            jsonResult.setCode(4004);
            jsonResult.setMessage("no data");
        }
        return jsonResult;
    }

    @GetMapping("/properties-info")
    @ApiOperation(value = "获取房产详情接口",tags = "房产数据访问接口")
    public JsonResult getDetails(@RequestParam @ApiParam(value = "房产id",required = true) Integer id){
        JsonResult jsonResult = new JsonResult();
        Properties properties = propertiesService.getById(id);
        if (properties != null){
            jsonResult.setCode(200);
            jsonResult.setData(properties);
        }else{
            jsonResult.setCode(4004);
            jsonResult.setMessage("no data");
        }
        return jsonResult;
    }

    @GetMapping("/advertising")
    @ApiOperation(value = "广告位房产列表接口",tags = "房产数据访问接口")
    public JsonResult getAdProperties(){
        JsonResult jsonResult = new JsonResult();
        List<PropertiesSimpleDto> list = propertiesService.listAdProperties();
        if (list.size() != 0){
            jsonResult.setCode(200);
            jsonResult.setData(list);
        }else{
            jsonResult.setCode(4004);
            jsonResult.setMessage("no data");
        }
        return jsonResult;
    }

    @GetMapping("/hot")
    @ApiOperation(value = "热门房产列表接口",tags = "房产数据访问接口")
    public JsonResult getHotProperties(){
        JsonResult jsonResult = new JsonResult();
        List<PropertiesSimpleDto> list = propertiesService.listHotProperties();
        if (list.size() != 0){
            jsonResult.setCode(200);
            jsonResult.setData(list);
        }else{
            jsonResult.setCode(4004);
            jsonResult.setMessage("no data");
        }
        return jsonResult;
    }

    @PostMapping("/add-properties")
    @ApiOperation(value = "新增房产接口",tags = "房产数据访问接口")
    public JsonResult addProperties(@RequestBody @ApiParam(value = "新增房产数据对象",required = true) Properties properties){
        JsonResult jsonResult = new JsonResult();
        boolean success = propertiesService.save(properties) > 0;
        if (success){
            jsonResult.setCode(200);
        }else {
            jsonResult.setCode(4005);
            jsonResult.setMessage("save failed");
        }
        return jsonResult;
    }

}
