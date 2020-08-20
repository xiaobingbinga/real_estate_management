package com.xuetang9.house.service;

import com.xuetang9.house.domain.Agency;

import java.util.List;

/**
 * @USER: 柳宇
 * @DATETIME: 2020/8/19 - 11:28
 **/
public interface AgencySerivce {
    /**
     * 查询代理机构编号
     * @param id
     * @return
     */
    List<Agency> listById(Integer id);
}
