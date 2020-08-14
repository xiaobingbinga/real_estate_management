package com.xuetang9.house.houseapi.web;

import com.xuetang9.house.houseapi.domain.user.User;
import com.xuetang9.house.houseapi.domain.user.UserStatus;
import com.xuetang9.house.houseapi.domain.user.UserType;
import com.xuetang9.house.houseapi.dto.user.LoginTo;
import com.xuetang9.house.houseapi.dto.user.RegisterTo;
import com.xuetang9.house.houseapi.dto.JsonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * @ClassName: UserController
 * @Description: TODO
 * @Author: 天冬
 * @Date: 2020-08-03 14:45
 * @Address: 成都市锦江区西部国际金融中心老九学堂
 * @Version: v1.0
 */
@RestController
@RequestMapping("/user")
@Api(tags = "用户数据访问接口")
public class UserController {

    @PostMapping("login")
    @ApiOperation(value = "用户登录接口",tags = "用户数据访问接口")
    public JsonResult<User> login(@RequestBody @ApiParam(value = "登录信息",required = true) LoginTo loginTo){
//        User user = new User(1,loginTo.getAccount(),"1999999901901","李四","没有名称");
        JsonResult<User> jsonResult = new JsonResult<>();

        User user = new User();
        user.setId(1);
        user.setAccount(loginTo.getAccount());
        user.setMobile("18351545968");
        user.setPassword(loginTo.getAccount());
        user.setName("张三");
        user.setNickName("小三");
        user.setRegTime(new Date());
        user.setStatus(new UserStatus(1,"正常"));
        user.setUtId(new UserType(1,"普通用户"));

        try {
            jsonResult.setCode(200);
            jsonResult.setData(user);
        } catch (Exception e) {
            e.printStackTrace();
            jsonResult.setCode(3000);
            jsonResult.setMessage("数据库查询错误");
        }
        return jsonResult;
    }

    @PostMapping("register")
    @ApiOperation(value = "用户注册接口",tags = "用户数据增加接口")
    public JsonResult register(@RequestBody @ApiParam(value = "注册用户信息",required = true) RegisterTo registerTo){
        JsonResult jsonResult = new JsonResult();
        if (registerTo.getAccount() != null){
            registerTo.setAccount(registerTo.getMobile());
        }
        try {
            jsonResult.setCode(200);
            jsonResult.setMessage("注册成功");
            jsonResult.setData(registerTo);
        } catch (Exception e) {
            e.printStackTrace();
            jsonResult.setCode(3000);
            jsonResult.setMessage("数据库操作失败");
        }
        return jsonResult;
    }

    @PostMapping("forget-password")
    @ApiOperation(value = "忘记密码接口",tags = "用户数据修改接口")
    public JsonResult forgetPassword(@RequestBody @ApiParam(value = "账号信息",required = true)LoginTo loginTo){
        JsonResult jsonResult = new JsonResult();
        try {
            jsonResult.setCode(200);
            jsonResult.setMessage("修改密码成功！");
            jsonResult.setData(loginTo);
        } catch (Exception e) {
            e.printStackTrace();
            jsonResult.setCode(3000);
            jsonResult.setMessage("数据库操作失败！");
        }
        return jsonResult;
    }

    @PostMapping("logout")
    @ApiOperation(value = "退出登录接口",tags = "用户数据访问接口")
    public JsonResult logout(@RequestBody @ApiParam(value = "账号信息",required = true)LoginTo loginTo){
        JsonResult jsonResult = new JsonResult();
        try {
            jsonResult.setCode(200);
            jsonResult.setMessage("账号退出成功");
            jsonResult.setData(loginTo);
        } catch (Exception e) {
            e.printStackTrace();
            jsonResult.setCode(3000);
            jsonResult.setMessage("数据库操作失败");
        }

        return jsonResult;

    }

    @PostMapping("base-info")
    @ApiOperation(value = "查看信息接口",tags = "用户数据访问接口")
    public JsonResult baseInfo(@RequestBody @ApiParam(value = "账号信息",required = true)LoginTo loginTo){
        JsonResult jsonResult = new JsonResult();

        User user = new User();
        user.setId(1);
        user.setAccount(loginTo.getAccount());
        user.setMobile("18945154615");
        user.setPassword(loginTo.getAccount());
        user.setName("张三");
        user.setNickName("小三");
        user.setRegTime(new Date());
        user.setStatus(new UserStatus(1,"正常"));
        user.setUtId(new UserType(1,"普通用户"));

        try {
            jsonResult.setCode(200);
            jsonResult.setData(loginTo);
        } catch (Exception e) {
            e.printStackTrace();
            jsonResult.setCode(3000);
            jsonResult.setMessage("数据库操作失败");
        }

        return jsonResult;

    }

    @PostMapping("change-password")
    @ApiOperation(value = "修改密码接口",tags = "用户数据修改接口")
    public JsonResult changePassword(@RequestBody @ApiParam(value = "账号信息",required = true)LoginTo loginTo){
        JsonResult jsonResult = new JsonResult();
        try {
            jsonResult.setCode(200);
            jsonResult.setMessage("账号密码修改成功");
            jsonResult.setData(loginTo);
        } catch (Exception e) {
            e.printStackTrace();
            jsonResult.setCode(3000);
            jsonResult.setMessage("数据库操作失败");
        }

        return jsonResult;

    }

}
