package com.xuetang9.house.mapper;

import com.xuetang9.house.domain.User;

import java.util.List;

/**
 * @USER: 柳宇
 * @DATETIME: 2020/8/18 - 10:26
 **/
public interface UserMapperS {

    List<User> selectByPageUser(Integer pageNum, Integer pageSize);

    User selectByLogin(String account, String password);

    List<User> selectById(Integer id);
}
