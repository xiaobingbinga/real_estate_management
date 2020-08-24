package com.xuetang9.house.househosues2.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.xuetang9.house.domain.Properties;
import com.xuetang9.house.dto.properties.ConditionDto;
import com.xuetang9.house.dto.properties.ConditionTo;
import com.xuetang9.house.dto.properties.ListConditionDto;
import com.xuetang9.house.dto.properties.PropertiesSimpleDto;
import com.xuetang9.house.househosues2.service.PropertiesService;
import com.xuetang9.house.mapper.PropertiesMapper;
import com.xuetang9.house.service.impl.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Lucky
 * @version 1.0.0
 * @date 2020/8/15 21:32
 * @copyright 老九学堂
 */
@Service
@Transactional(propagation = Propagation.REQUIRED,timeout = 5,readOnly = true,rollbackFor = {Exception.class})
public class PropertiesServiceImpl extends BaseServiceImpl<Properties,Integer, PropertiesMapper> implements PropertiesService {

    @Autowired
    private PropertiesMapper propertiesMapper;

    @Override
    public List<PropertiesSimpleDto> listAllSimpleByPage(int pageNumber, int pageSize) {
        Page<PropertiesSimpleDto> page = PageHelper.startPage(pageNumber,pageSize);
        propertiesMapper.selectAllSimple();
        return page;
    }

    @Override
    public List<PropertiesSimpleDto> listByCondition(ConditionDto condition) {
        Page<PropertiesSimpleDto> page = PageHelper.startPage(condition.getPageNum(), condition.getPageSize());
        propertiesMapper.selectDtoByCondition(condition);
        return page;
    }

    @Override
    public List<PropertiesSimpleDto> listFeatures() {
        return propertiesMapper.selectSimpleListByCondition(new ListConditionDto().setIsSpecial(1));
    }

    @Override
    public List<PropertiesSimpleDto> listNewProperties() {
        return propertiesMapper.selectSimpleListByCondition(new ListConditionDto().setIsNew(1));
    }

    @Override
    public List<PropertiesSimpleDto> listAdProperties() {
        return propertiesMapper.selectSimpleListByCondition(new ListConditionDto().setIsAd(1));
    }

    @Override
    public List<PropertiesSimpleDto> listHotProperties() {
        return propertiesMapper.selectSimpleListByCondition(new ListConditionDto().setIsHot(1));
    }
}
