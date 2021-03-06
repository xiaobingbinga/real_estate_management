package com.xuetang9.house.service.impl;

import com.xuetang9.house.domain.PropertiesType;
import com.xuetang9.house.service.PropertiesTypeSerivcee;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @USER: 柳宇
 * @DATETIME: 2020/8/19 - 11:46
 **/
@Service
@Transactional(propagation = Propagation.REQUIRED,readOnly = true,timeout = 5000,rollbackFor = {Exception.class})
public class PropertiesTypeSerivceImpl implements PropertiesTypeSerivcee {
    @Override
    public List<PropertiesType> listByType(int id) {
        return null;
    }
}
