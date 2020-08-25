package com.xuetang9.house.houseagents.service;

import com.github.pagehelper.PageInfo;
import com.xuetang9.house.domain.Agent;
import com.xuetang9.house.houseagents.domain.vo.AgentInfoVo;
import com.xuetang9.house.houseagents.domain.vo.AgentListVo;
import com.xuetang9.house.service.BaseService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @version 1.0
 * @desc:
 * @author: 纪锦浩
 * @data: 2020年08月16日12:49
 * @address：成都市锦江区西部金融中心
 */
public interface AgentService extends BaseService<Agent,Long> {

    /**
     * 返回推荐代理人
     * @return
     */
     List<AgentListVo> selectByStar();

    /**
     * 分页查询数据
     * @param pageIndex
     * @param pageSize
     * @return
     */
    List<AgentListVo> listAgentVoByPage(int pageIndex, int pageSize);

    /**
     * 代理商旗下代理人
     * @param agencyId
     * @return
     */
    List<AgentListVo> listAgentVoByAgency(long agencyId);

    /**
     * 代理人详细信息
     * @param userId
     * @return
     */
    AgentInfoVo agentInfoById(Long userId);



}
