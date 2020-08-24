package com.xuetang9.house.mapper;

import com.xuetang9.house.domain.Properties;
import com.xuetang9.house.dto.properties.ConditionDto;
import com.xuetang9.house.dto.properties.ListConditionDto;
import com.xuetang9.house.dto.properties.PropertiesSimpleDto;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
public interface PropertiesMapper extends Mapper<Properties> {

    /**
     * 查询房产列表，简略信息
     * @return
     */
    List<PropertiesSimpleDto> selectAllSimple();

    List<PropertiesSimpleDto> selectDtoByCondition(ConditionDto condition);

    List<PropertiesSimpleDto> selectSimpleListByCondition(ListConditionDto condition);
}
