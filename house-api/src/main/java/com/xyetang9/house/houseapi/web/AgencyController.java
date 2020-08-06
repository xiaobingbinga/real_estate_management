package com.xyetang9.house.houseapi.web;

import com.xyetang9.house.houseapi.domain.properties.Agency;
import com.xyetang9.house.houseapi.domain.user.Agent;
import com.xyetang9.house.houseapi.dto.JsonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName: AgencyController
 * @Description: TODO
 * @Author: 天冬
 * @Date: 2020-08-03 21:27
 * @Address: 成都市锦江区西部国际金融中心老九学堂
 * @Version: v1.0
 */
@RestController
@RequestMapping("/agency")
@Api(tags = "代理商数据访问接口")
public class AgencyController {

    @GetMapping("agency-list")
    @ApiOperation(value = "代理商列表接口",tags = "代理商数据访问接口")
    public JsonResult agencyList(@RequestBody @ApiParam(value = "测试对象",required = true)Agency agency){
        JsonResult jsonResult = new JsonResult();
        try {
            jsonResult.setCode(200);
            jsonResult.setData(agency);
        } catch (Exception e) {
            e.printStackTrace();
            jsonResult.setCode(3000);
            jsonResult.setMessage("查询数据库失败");
        }

        return jsonResult;
    }
    @PostMapping("agency-info")
    @ApiOperation(value = "代理商详情接口",tags = "代理商数据访问接口")
    public JsonResult agencyInfo(@RequestBody @ApiParam(value = "查询对象",required = true)Agency agency){
        JsonResult jsonResult = new JsonResult();
        try {
            jsonResult.setCode(200);
            jsonResult.setData(agency);
        } catch (Exception e) {
            e.printStackTrace();
            jsonResult.setCode(3000);
            jsonResult.setMessage("查询数据库失败");
        }

        return jsonResult;
    }

}
