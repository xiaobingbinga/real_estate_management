package com.xuetang9.house.mapper;

import com.xuetang9.house.domain.Owner;

import java.util.List;

/**
 * @USER: 柳宇
 * @DATETIME: 2020/8/19 - 11:34
 **/
public interface OwnerMapperS {
    Owner selectByAgentId(Long id);
}
