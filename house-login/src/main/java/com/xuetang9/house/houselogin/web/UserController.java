package com.xuetang9.house.houselogin.web;

import com.xuetang9.house.dto.user.LoginTo;
import com.xuetang9.house.houselogin.domain.User;
import com.xuetang9.house.houselogin.exception.FailLoginException;
import com.xuetang9.house.houselogin.service.LoginService;
import com.xuetang9.house.vo.JsonResult;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
