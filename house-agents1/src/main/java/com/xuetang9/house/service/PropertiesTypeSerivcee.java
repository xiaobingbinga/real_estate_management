package com.xuetang9.house.service;

import com.xuetang9.house.domain.PropertiesType;

import java.util.List;

/**
 * @USER: 柳宇
 * @DATETIME: 2020/8/19 - 11:45
 **/
public interface PropertiesTypeSerivcee {
    List<PropertiesType> listByType(int id);
}
