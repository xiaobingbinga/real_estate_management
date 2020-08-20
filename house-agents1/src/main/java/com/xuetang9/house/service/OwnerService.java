package com.xuetang9.house.service;

import com.xuetang9.house.domain.Owner;

import java.util.List;

/**
 * @USER: 柳宇
 * @DATETIME: 2020/8/19 - 11:36
 **/
public interface OwnerService {
    List<Owner> listByAgentId(Integer id);
}
