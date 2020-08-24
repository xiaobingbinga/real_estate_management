package com.xuetang9.house.househosues2.service;

import com.xuetang9.house.domain.Properties;
import com.xuetang9.house.dto.properties.ConditionDto;
import com.xuetang9.house.dto.properties.PropertiesSimpleDto;
import com.xuetang9.house.service.BaseService;

import java.util.List;

/**
 * @author Lucky
 * @version 1.0.0
 * @date 2020/8/15 21:28
 * @copyright 老九学堂
 */
public interface PropertiesService extends BaseService<Properties,Integer> {
    List<PropertiesSimpleDto> listAllSimpleByPage(int pageNumber, int pageSize);

    List<PropertiesSimpleDto> listByCondition(ConditionDto condition);

    List<PropertiesSimpleDto> listFeatures();

    List<PropertiesSimpleDto> listNewProperties();

    List<PropertiesSimpleDto> listAdProperties();

    List<PropertiesSimpleDto> listHotProperties();
}
