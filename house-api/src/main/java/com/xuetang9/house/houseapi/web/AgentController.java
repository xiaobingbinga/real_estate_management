package com.xuetang9.house.houseapi.web;

import com.xuetang9.house.houseapi.domain.user.Agent;
import com.xuetang9.house.houseapi.dto.user.LoginTo;
import com.xuetang9.house.houseapi.dto.JsonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName: AgentController
 * @Description: TODO
 * @Author: 天冬
 * @Date: 2020-08-03 21:11
 * @Address: 成都市锦江区西部国际金融中心老九学堂
 * @Version: v1.0
 */
@RestController
@RequestMapping("/agent")
@Api(tags = "代理人数据访问接口")
public class AgentController {

    @GetMapping("recommend")
    @ApiOperation(value = "顶级代理人推荐接口",tags = "代理人数据访问接口")
    public JsonResult recommend(@RequestBody @ApiParam(value = "测试对象",required = true) Agent agent){
        JsonResult jsonResult = new JsonResult();
        try {
            jsonResult.setCode(200);
            jsonResult.setData(agent);
        } catch (Exception e) {
            e.printStackTrace();
            jsonResult.setCode(3000);
            jsonResult.setMessage("查询数据库失败");
        }

        return jsonResult;
    }

    @PostMapping("my-agent")
    @ApiOperation(value = "我的代理人接口",tags = "代理人数据访问接口")
    public JsonResult myAgent(@RequestBody @ApiParam(value = "查询对象",required = true) LoginTo loginTo){
        JsonResult jsonResult = new JsonResult();
        Agent agent = new Agent();
        agent.setId(1);
        agent.setUserId(3);
        agent.setEmail("157851453@qq.com");
        agent.setCertification("45673215421545");
        try {
            jsonResult.setCode(200);
            jsonResult.setData(agent);
        } catch (Exception e) {
            e.printStackTrace();
            jsonResult.setCode(3000);
            jsonResult.setMessage("查询数据库失败");
        }

        return jsonResult;
    }

    @GetMapping("agent-list")
    @ApiOperation(value = "代理人列表接口",tags = "代理人数据访问接口")
    public JsonResult agentList(@RequestBody @ApiParam(value = "测试对象",required = true)Agent agent){
        JsonResult jsonResult = new JsonResult();
        try {
            jsonResult.setCode(200);
            jsonResult.setData(agent);
        } catch (Exception e) {
            e.printStackTrace();
            jsonResult.setCode(3000);
            jsonResult.setMessage("查询数据库失败");
        }

        return jsonResult;
    }

    @PostMapping("agent-info")
    @ApiOperation(value = "代理人详情接口",tags = "代理人数据访问接口")
    public JsonResult agentInfo(@RequestBody @ApiParam(value = "查询对象",required = true)Agent agent){
        JsonResult jsonResult = new JsonResult();
        try {
            jsonResult.setCode(200);
            jsonResult.setData(agent);
        } catch (Exception e) {
            e.printStackTrace();
            jsonResult.setCode(3000);
            jsonResult.setMessage("查询数据库失败");
        }

        return jsonResult;
    }

}
