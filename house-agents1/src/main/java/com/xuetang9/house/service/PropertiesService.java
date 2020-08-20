package com.xuetang9.house.service;

import com.xuetang9.house.domain.Properties;

import java.util.List;

/**
 * @USER: 柳宇
 * @DATETIME: 2020/8/19 - 11:40
 **/
public interface PropertiesService {
    List<Properties> listByOwnerId(Integer id);
}
