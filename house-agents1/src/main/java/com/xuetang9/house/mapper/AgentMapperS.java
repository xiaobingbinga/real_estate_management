package com.xuetang9.house.mapper;

import com.xuetang9.house.domain.Agent;

import java.util.List;

/**
 * @USER: 柳宇
 * @DATETIME: 2020/8/18 - 10:25
 **/
public interface AgentMapperS {
    /**
     * 查询代理人数量
     * @param id
     * @return
     */
    Integer selectByCount(Long id);

    List<Agent> selectByPage(Integer pageNum, Integer pageSize);

    List<Agent> selectById(Integer id);
}
