package com.xuetang9.house.houselogin.service.impl;

import com.xuetang9.house.houselogin.domain.User;
import com.xuetang9.house.houselogin.domain.UserExample;
import com.xuetang9.house.houselogin.exception.FailLoginException;
import com.xuetang9.house.houselogin.mapper.UserMapper;
import com.xuetang9.house.houselogin.service.LoginService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName LoginServiceImpl
 * @Description: TODO
 * @Author Mr_W
 * @Date 2020/8/16 18:12
 * @Version V1.0
 */
@Service
public class LoginServiceImpl implements LoginService {

    public LoginServiceImpl(UserMapper userMapper){
        this.userMapper = userMapper;
    }

    private final UserMapper userMapper;

    @Override
    public User login(String username, String password) throws FailLoginException {
        UserExample example = new UserExample();
        example.or().andAccountEqualTo(username);
        User user = userMapper.selectOneByExampleSelective(example, User.Column.password, User.Column.nikename,
                User.Column.utId);
        if (!new BCryptPasswordEncoder().matches(password, user.getPassword())){
            throw new FailLoginException("用户名或密码错误");
        }
        return user;
    }
}
