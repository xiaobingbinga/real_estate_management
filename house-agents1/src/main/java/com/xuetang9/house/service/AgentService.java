package com.xuetang9.house.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.xuetang9.house.domain.Agent;
import com.xuetang9.house.dto.properties.PageTo;
import com.xuetang9.house.vo.AgentConditionVo;
import org.springframework.cloud.openfeign.FeignClient;

import java.util.List;

/**
 * @USER: 柳宇
 * @DATETIME: 2020/8/17 - 17:19
 **/
public interface AgentService {

    List<Agent> listByPage(PageTo pageTo);

    Integer selectByCount(Long id);

    List<AgentConditionVo> listById(Integer id);

}
