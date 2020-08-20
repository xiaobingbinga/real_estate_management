package com.xuetang9.house.service.impl;

import com.xuetang9.house.domain.RentType;
import com.xuetang9.house.service.RentTypeSerivce;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @USER: 柳宇
 * @DATETIME: 2020/8/19 - 11:50
 **/
@Service
@Transactional(propagation = Propagation.REQUIRED,timeout = 5000,readOnly = true,rollbackFor = {Exception.class})
public class RentTypeSerivceImpl implements RentTypeSerivce {
    @Override
    public List<RentType> listByRentType(int id) {
        return null;
    }
}
