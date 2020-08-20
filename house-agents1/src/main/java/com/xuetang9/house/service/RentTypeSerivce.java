package com.xuetang9.house.service;

import com.xuetang9.house.domain.RentType;

import java.util.List;

/**
 * @USER: 柳宇
 * @DATETIME: 2020/8/19 - 11:49
 **/
public interface RentTypeSerivce {
    List<RentType> listByRentType(int id);
}
