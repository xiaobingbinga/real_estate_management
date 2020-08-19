package com.xuetang9.househouses.service;

import com.xuetang9.house.domain.User;
import com.xuetang9.house.service.BaseService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @version 1.0
 * @desc:
 * @author: 纪锦浩
 * @data: 2020年08月16日13:38
 * @address：成都市锦江区西部金融中心
 */
@Service
public interface UserService extends BaseService<User,Integer> {

    /**
     * 查询全部
     *
     * @return
     */
    @Override
    List<User> listAll();
}
