package com.xuetang9.house.househosues2.web;

import com.github.pagehelper.PageInfo;
import com.xuetang9.house.domain.Properties;
import com.xuetang9.house.dto.properties.ConditionTo;
import com.xuetang9.house.dto.properties.PropertiesSimpleDto;
import com.xuetang9.house.househosues2.service.PropertiesService;
import com.xuetang9.house.vo.JsonResult;
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
public class HouseController {

    @Autowired
    private PropertiesService propertiesService;

    @GetMapping("/list")
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
    public JsonResult search(ConditionTo condition, int pageNum, int pageSize){
        JsonResult jsonResult = new JsonResult();
        List<PropertiesSimpleDto> list = propertiesService.listByCondition(condition, pageNum, pageSize);
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
    public JsonResult getFeatures(){
        JsonResult jsonResult = new JsonResult();
        List<PropertiesSimpleDto> list = propertiesService.listFeatures();
        if (list.size() != 0){
            jsonResult.setCode(200);
            jsonResult.setData(list);
        }else{
            jsonResult.setCode(4004);
            jsonResult.setMessage("no data");
        }
        return jsonResult;
    }

    @GetMapping("/properties-add")
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
    public JsonResult getDetails(@RequestParam Integer id){
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
    public JsonResult addProperties(@RequestBody Properties properties){
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
