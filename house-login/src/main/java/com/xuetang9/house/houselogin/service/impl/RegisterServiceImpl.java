package com.xuetang9.house.houselogin.service.impl;

import com.xuetang9.house.houselogin.domain.User;
import com.xuetang9.house.houselogin.domain.UserExample;
import com.xuetang9.house.houselogin.dto.RegisterByAccountTo;
import com.xuetang9.house.houselogin.dto.RegisterByPhoneTo;
import com.xuetang9.house.houselogin.mapper.UserMapper;
import com.xuetang9.house.houselogin.service.RegisterService;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * @Author lyt
 * @Date 2020/8/17
 * @Copyright lyt
 * @Describe
 */
@Service
@Transactional
public class RegisterServiceImpl implements RegisterService {

    @Resource
    private UserMapper userMapper;

    @Override
    public int registerByPhone(RegisterByPhoneTo registerByPhoneTo) {
        User user = new User();
        user.setAccount(registerByPhoneTo.getAccount());
        user.setMobile(registerByPhoneTo.getMobile());
        user.setPassword(registerByPhoneTo.getPassword());
        user.setName(registerByPhoneTo.getName());
        user.setNikename(registerByPhoneTo.getNickName());
        user.setUtId(registerByPhoneTo.getUtId());
        user.setRegTime(LocalDateTime.now());
        user.setStatusId(1);
        int result = userMapper.insert(user);
        return result == 1 ? 200 : 500;
    }

    @Override
    public int registerByAccount(RegisterByAccountTo registerByAccountTo) {
        User user = new User();
        user.setAccount(registerByAccountTo.getAccount());
        user.setName(registerByAccountTo.getName());
        user.setNikename(registerByAccountTo.getNickName());
        user.setPassword(registerByAccountTo.getPassword());
        user.setUtId(registerByAccountTo.getUtId());
        user.setStatusId(1);
        int result = userMapper.insert(user);
        return result == 1 ? 200 : 500;
    }

    @Override
    public boolean checkIsExistingPhone(String phone) {
        UserExample example = new UserExample();
        example.or().andMobileEqualTo(phone);
        return userMapper.countByExample(example) == 1;
    }

    @Override
    public boolean checkIsExistingAccount(String account) {
        UserExample example = new UserExample();
        example.or().andAccountEqualTo(account);
        return userMapper.countByExample(example) == 1;
    }
}
