package com.xuetang9.house.houseagents.mapper;

import com.xuetang9.house.domain.Agent;
import com.xuetang9.house.houseagents.domain.vo.AgentListVo;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @version 1.0
 * @desc:
 * @author: 纪锦浩
 * @data: 2020年08月22日21:49
 * @address：成都市锦江区西部金融中心
 */
public interface AgentListVoMapper extends Mapper<Agent> {

    /**
     * 根据条件查询数据
     * @param agent
     * @return
     */
    List<AgentListVo> selectAgentListInfo(Agent agent);

    /**
     * 查询六条星级代理人数据
     * @param agentExample
     * @return
     */
    List<AgentListVo> selectRecommendAgent(Agent agentExample);
}
