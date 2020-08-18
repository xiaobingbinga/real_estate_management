package com.xuetang9.house.mapper;

import com.xuetang9.house.domain.Agent;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface AgentMapper extends Mapper<Agent> {

    /**
     * 查询数据
     * @param agent
     * @return
     */
    List<Agent> selectAgentListInfo(Agent agent);
}