package com.xuetang9.house.web;

import com.xuetang9.house.domain.User;
import com.xuetang9.house.dto.user.LoginTo;
import com.xuetang9.house.service.UserService;
import com.xuetang9.house.vo.JsonResult;
import com.xuetang9.to.UserCache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


import javax.servlet.http.HttpSession;
import java.time.Duration;

/**
 * @USER: 柳宇
 * @DATETIME: 2020/8/19 - 16:10
 **/
public class UserController {

    /**
     * 登陆过期时间
     */
    private final long EXPIRE_TIME = 30 * 1000;

    @Autowired
    RedisTemplate redisTemplate;

    @Autowired
    private UserService userService;

    @PostMapping("/user/login")
    public JsonResult login(@RequestParam LoginTo loginTo, HttpSession session){
        JsonResult jsonResult = new JsonResult();
        User user = userService.oneLogin(loginTo);
        if(user == null){
            jsonResult.setCode(1000);
            jsonResult.setMessage("账号密码错误");
        }else{
            //获取登陆凭证
            String token = session.getId();
            jsonResult.setCode(200);
            jsonResult.setToken(token);

            //记录用户数据
            UserCache userCache = new UserCache();
            userCache.setId(user.getId());
            userCache.setExpireTime(System.currentTimeMillis()+EXPIRE_TIME);
            userCache.setRole(user.getUtId());

            //将数据缓存到redis中
            redisTemplate.opsForValue().set(token,userCache);
            //设置过期时间
            redisTemplate.expire(token, Duration.ofMillis(EXPIRE_TIME));
        }
        return jsonResult;
    }
}
