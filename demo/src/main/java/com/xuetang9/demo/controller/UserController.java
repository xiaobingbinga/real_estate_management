package com.xuetang9.demo.controller;

import com.xuetang9.demo.domain.User;
import com.xuetang9.demo.test.UserTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: UserController
 * @Description: TODO
 * @Author: 天冬
 * @Date: 2020-08-12 21:39
 * @Address: 成都市锦江区西部国际金融中心老九学堂
 * @Version: v1.0
 */
@RestController
public class UserController {

    @Autowired
    private UserTest userTest;

    @GetMapping("user/{id}")
    public User addUser(@PathVariable Integer id){
        return userTest.addUser(id);
    }
}
