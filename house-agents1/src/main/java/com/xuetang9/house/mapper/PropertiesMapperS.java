package com.xuetang9.house.mapper;

import com.xuetang9.house.domain.Properties;

import java.util.List;

/**
 * @USER: 柳宇
 * @DATETIME: 2020/8/19 - 11:38
 **/
public interface PropertiesMapperS {
     Properties selectByOwnerId(Long id);
}
