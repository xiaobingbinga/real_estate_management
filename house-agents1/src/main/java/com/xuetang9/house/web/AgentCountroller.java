package com.xuetang9.house.web;

import com.xuetang9.house.domain.*;
import com.xuetang9.house.dto.agent.AgentTo;
import com.xuetang9.house.dto.properties.PageTo;
import com.xuetang9.house.service.AgentService;
import com.xuetang9.house.service.UserService;
import com.xuetang9.house.vo.AgentConditionVo;
import com.xuetang9.house.vo.JsonResult;
import com.xuetang9.house.vo.PageAgentListVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @USER: 柳宇
 * @DATETIME: 2020/8/17 - 13:37
 **/
@RestController
@Api(tags = "代理人访问接口")
public class AgentCountroller {

    @Autowired
    private AgentService agentService;

    @Autowired
    private UserService userService;

    /**
     * 推荐顶级代理人
     * @return
     */
    @GetMapping("/agent/recommend")
    public JsonResult getRecommend(){
        JsonResult jsonResult = new JsonResult();
        return jsonResult;
    }

    /**
     * 我的代理人
     * @return
     */
    @PostMapping("/agent/my-agent")
    public JsonResult PostMyAgent(){
        JsonResult jsonResult = new JsonResult();
        return jsonResult;
    }

    /**
     * 代理人列表
     * @return
     */
    @PostMapping("/agent/list")
    @ApiOperation(value = "分页查询代理人信息",tags = "代理人访问接口")
    public JsonResult PostList(@RequestBody PageTo pageTo){
        JsonResult jsonResult = new JsonResult();
        PageAgentListVo pageAgentListVos = new PageAgentListVo();
        List<Agent> listVos = agentService.listByPage(pageTo);
        List<User> userList =userService.listByPage(pageTo);
        pageAgentListVos.setPageAgent(listVos);
        pageAgentListVos.setPageUser(userList);
        for(User user :userList){
            pageAgentListVos.setCount(agentService.selectByCount(user.getId()));
        }
        if(pageAgentListVos==null){
            jsonResult.setCode(1000);
            jsonResult.setMessage("分页查询代理人失败");
        }else{
            jsonResult.setCode(200);
            jsonResult.setData(pageAgentListVos);
        }
        return jsonResult;
    }

    /**
     * 按条件查询代理人
     * @return
     */
    @PostMapping("/agent/condition")
    public JsonResult PostCondition(@RequestBody AgentTo agentTo){
        JsonResult jsonResult = new JsonResult();
        return jsonResult;
    }

    /**
     * 代理人详情
     * @return
     */
    @PostMapping("/agent/agent-info")
    public JsonResult PostAgentInfo(@RequestBody AgentTo agentTo){
        JsonResult jsonResult = new JsonResult();
        List<AgentConditionVo> agentConditionVo = agentService.listById(agentTo.getId());
        List<AgentConditionVo> userList = userService.listById(agentTo.getUserId());
         for(AgentConditionVo user :userList){
             BeanUtils.copyProperties(user,agentConditionVo);
         }

        if(agentConditionVo==null){
            jsonResult.setCode(1000);
            jsonResult.setMessage("查询失败");
        }else{
            jsonResult.setCode(200);
            jsonResult.setData(agentConditionVo);
        }
        return jsonResult;
    }

}
