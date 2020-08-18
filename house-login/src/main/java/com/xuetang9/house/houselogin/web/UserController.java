package com.xuetang9.house.houselogin.web;

import com.aliyuncs.exceptions.ClientException;
import com.xuetang9.house.dto.user.LoginTo;
import com.xuetang9.house.houselogin.domain.User;
import com.xuetang9.house.houselogin.dto.RegisterByAccountTo;
import com.xuetang9.house.houselogin.dto.RegisterByPhoneTo;
import com.xuetang9.house.houselogin.exception.FailLoginException;
import com.xuetang9.house.houselogin.service.LoginService;
import com.xuetang9.house.houselogin.service.RegisterService;
import com.xuetang9.house.houselogin.util.RedisUtil;
import com.xuetang9.house.houselogin.util.SmsUtil;
import com.xuetang9.house.vo.JsonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.spring.web.json.Json;

import javax.annotation.Resource;
import java.time.LocalTime;
import java.util.regex.Pattern;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName LoginController
 * @Description: TODO
 * @Author Mr_W
 * @Date 2020/8/16 17:56
 * @Version V1.0
 */
@RestController
@RequestMapping("/user")
@Api(tags = "用户注册和登录接口")
public class UserController {

    public UserController(LoginService loginService){
        this.loginService = loginService;
    }

    private final LoginService loginService;

    @PostMapping("/login")
    public JsonResult<Map> login(@RequestBody LoginTo login) throws FailLoginException {
        Map<String, String> result = new HashMap<>();
        User user = loginService.Login(login.getAccount(), login.getPassword());
        result.put("nickName", user.getNikename());
        result.put("utId", user.getUtId().toString());
        return new JsonResult<Map>().setCode(200).setMessage("登录成功").setData(result);
    }

    @Resource
    private RegisterService registerService;

    /**
     * 发送验证码功能
     * @param phone
     * @return
     */
    @PostMapping("/quest-verification")
    @ApiOperation(value = "请求验证码接口", tags = "用户注册和登录接口")
    public JsonResult sendSms(@RequestBody String phone) {
        if (!Pattern.compile("^1[3-9][0-9]{9}").matcher(phone).matches()) {
            return new JsonResult().setCode(601).setMessage("手机号不正确");
        }
        if (registerService.checkIsExistingPhone(phone)) {
            return new JsonResult().setCode(608).setMessage("手机号已注册");
        }
        try {
            String sms = SmsUtil.sendSms(phone);
            RedisUtil.set(phone, sms);
            RedisUtil.expire(phone, 300);
        } catch (ClientException e) {
            return new JsonResult().setCode(602).setMessage("验证码申请失败");
        }
        return new JsonResult().setCode(200).setMessage("验证码申请成功");
    }

    /**
     * 手机注册功能
     * @param registerByPhoneTo
     * @return
     */
    @PostMapping("/register-by-phone")
    @ApiOperation(value = "手机注册接口", tags = "用户注册和登录接口")
    public JsonResult registerByPhone(@RequestBody @Validated RegisterByPhoneTo registerByPhoneTo) {
        if (RedisUtil.get(registerByPhoneTo.getMobile()) == null) {
            return new JsonResult().setCode(603).setMessage("验证码失效");
        }
        if (!RedisUtil.get(registerByPhoneTo.getMobile()).equals(registerByPhoneTo.getAuthCode())) {
            return new JsonResult().setCode(604).setMessage("申请验证码的手机与注册手机不一致");
        }
        if (!registerByPhoneTo.getPassword().equals(registerByPhoneTo.getConfirmPassword())) {
            return new JsonResult().setCode(607).setMessage("密码与确认密码不一致");
        }
        int code = registerService.registerByPhone(registerByPhoneTo);
        if (code == 200) {
            return new JsonResult().setCode(code).setMessage("注册成功");
        }else {
            return new JsonResult().setCode(code).setMessage("注册失败");
        }
    }

    /**
     * 根据账号注册
     * @param registerByAccountTo
     * @return
     */
    @PostMapping("/register-by-account")
    @ApiOperation(value = "账号注册接口", tags = "用户注册和登录接口")
    public JsonResult registerByAccount(@RequestBody @Validated RegisterByAccountTo registerByAccountTo) {
        if (registerService.checkIsExistingAccount(registerByAccountTo.getAccount())) {
            return new JsonResult().setCode(609).setMessage("账号已存在");
        }
        if (!registerByAccountTo.getPassword().equals(registerByAccountTo.getConfirmPassword())) {
            return new JsonResult().setCode(607).setMessage("密码与确认密码不一致");
        }
        int code = registerService.registerByAccount(registerByAccountTo);
        if (code == 200) {
            return new JsonResult().setCode(code).setMessage("注册成功");
        }else {
            return new JsonResult().setCode(code).setMessage("注册失败");
        }
    }
}
