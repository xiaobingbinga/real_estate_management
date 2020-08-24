package com.xuetang9.house.houselogin.service;

import com.xuetang9.house.houselogin.domain.User;
import com.xuetang9.house.houselogin.exception.FailLoginException;

import java.util.Map;

/**
 * @ClassName LoginService
 * @Description: TODO
 * @Author Mr_W
 * @Date 2020/8/16 18:11
 * @Version V1.0
 */
public interface LoginService {

    User login(String username, String password) throws FailLoginException;

}
