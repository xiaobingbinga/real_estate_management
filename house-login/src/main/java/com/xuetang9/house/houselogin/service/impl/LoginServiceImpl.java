package com.xuetang9.house.houselogin.service.impl;

import com.xuetang9.house.houselogin.domain.User;
import com.xuetang9.house.houselogin.domain.UserExample;
import com.xuetang9.house.houselogin.mapper.UserMapper;
import com.xuetang9.house.houselogin.service.LoginService;

import java.util.List;

/**
 * @ClassName LoginServiceImpl
 * @Description: TODO
 * @Author Mr_W
 * @Date 2020/8/16 18:12
 * @Version V1.0
 */
public class LoginServiceImpl implements LoginService {

    public LoginServiceImpl(UserMapper userMapper){
        this.userMapper = userMapper;
    }

    private final UserMapper userMapper;

    @Override
    public boolean Login(String username, String password) {
        UserExample example = new UserExample();
        example.or().andAccountEqualTo(username);
        User user = userMapper.selectOneByExampleSelective(example, User.Column.password);
        return password.equals(user.getPassword());
    }
}
