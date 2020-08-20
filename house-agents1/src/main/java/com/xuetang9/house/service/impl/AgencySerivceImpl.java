package com.xuetang9.house.service.impl;

import com.xuetang9.house.domain.Agency;
import com.xuetang9.house.service.AgencySerivce;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @USER: 柳宇
 * @DATETIME: 2020/8/19 - 11:30
 **/
@Service
@Transactional(propagation = Propagation.REQUIRED,timeout = 5000,readOnly = true,rollbackFor = {Exception.class})
public class AgencySerivceImpl implements AgencySerivce {


    @Override
    public List<Agency> listById(Integer id) {
        return null;
    }
}
