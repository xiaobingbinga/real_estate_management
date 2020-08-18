package com.xuetang9.househouses.web;

import com.xuetang9.house.domain.Properties;
import com.xuetang9.house.domain.PropertiesComment;
import com.xuetang9.house.dto.properties.AddTo;
import com.xuetang9.house.dto.properties.ConditionTo;
import com.xuetang9.house.vo.JsonResult;
import com.xuetang9.househouses.service.HouseInfoService;
import com.xuetang9.househouses.service.PropertiesCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.web.bind.annotation.*;

import java.util.List;


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

    @Autowired
    private HouseInfoService houseInfoService;

    @Autowired
    private PropertiesCommentService propertiesCommentService;


    /**
     * 查看房产详细信息
     * @param id
     * @return
     */
    @GetMapping("/properties-info/{id}")
    public JsonResult houseInfoByCondition(@PathVariable("id") Integer id){
        JsonResult jsonResult = new JsonResult();
        Properties properties = houseInfoService.getById(id);
        try {
            jsonResult.setCode(200);
            jsonResult.setData(properties);
        } catch (Exception e) {
            e.printStackTrace();
            jsonResult.setCode(1000);
            jsonResult.setMessage("数据库查询失败");
        }

        return jsonResult;
    }


    /**
     * @Description: houseInfoByReply 根据房产id查询用户回复
     * @param: [id]
     * @return: com.xuetang9.house.vo.JsonResult
     * @auther: 天冬
     * @date: 2020-08-16 17:11
     */
    @GetMapping("/reply")
    public JsonResult houseInfoByReply(Integer id){
        JsonResult jsonResult = new JsonResult();
        List<PropertiesComment> propertiesComments = propertiesCommentService.select(id);
        try {
            jsonResult.setCode(200);
            jsonResult.setData(propertiesComments);
        } catch (Exception e) {
            e.printStackTrace();
            jsonResult.setCode(1000);
            jsonResult.setMessage("数据库查询失败");
        }
        return jsonResult;
    }


    /**
     * 新增房产信息
     * @param addInfo
     * @return
     */
    @PostMapping("/add-properties")
    public JsonResult newHouseInfo(@RequestBody AddTo addInfo){
        JsonResult jsonResult = new JsonResult();
        int num = houseInfoService.add(addInfo);
        if (num == 1){
            try {
                jsonResult.setCode(200);
                jsonResult.setMessage("新增成功");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }else {
            jsonResult.setCode(1000);
            jsonResult.setMessage("数据库增加失败");
        }
        return jsonResult;
    }

}
