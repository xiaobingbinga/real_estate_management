package com.xuetang9.house.mapper;

import com.xuetang9.house.domain.Owner;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface OwnerMapper extends Mapper<Owner> {

    /**
     * 查询代理Id
     * @param agentId
     * @return
     */
    List<Long> selectOwnerIdByAgentId(long agentId);
}