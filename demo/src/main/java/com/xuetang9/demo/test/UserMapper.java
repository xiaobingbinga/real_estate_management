package com.xuetang9.demo.test;

import com.xuetang9.demo.domain.User;

import java.util.List;

/**
 * @ClassName: UserMapper
 * @Description: TODO
 * @Author: 天冬
 * @Date: 2020-08-12 21:06
 * @Address: 成都市锦江区西部国际金融中心老九学堂
 * @Version: v1.0
 */
public interface UserMapper {
    List<User> selectAll();
}
