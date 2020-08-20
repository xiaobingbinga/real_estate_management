package com.xuetang9.house.service.impl;

import com.xuetang9.house.domain.Owner;
import com.xuetang9.house.service.OwnerService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @USER: 柳宇
 * @DATETIME: 2020/8/19 - 11:36
 **/
@Service
@Transactional(propagation = Propagation.REQUIRED,rollbackFor = {Exception.class},readOnly = true,timeout = 5000)
public class OwnerServiceImpl implements OwnerService {
    @Override
    public List<Owner> listByAgentId(Integer id) {
        return null;
    }
}
