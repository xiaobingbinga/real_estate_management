package com.xuetang9.house.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import com.xuetang9.house.domain.User;
import com.xuetang9.house.dto.properties.PageTo;
import com.xuetang9.house.vo.AgentConditionVo;
import com.xuetang9.house.vo.PageAgentListVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * @USER: 柳宇
 * @DATETIME: 2020/8/19 - 9:27
 **/
@FeignClient( value = "HOUSE-AGENTS1")
public interface AgentServiceTwo {

    /**
     * 推荐顶级代理人
     * @param id
     * @return
     */
    @HystrixCommand(fallbackMethod = "",commandProperties = {
            @HystrixProperty(name="circuitBreaker.enable",value = "true"),//是否开启断路器
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold",value = "10"),//请求峰值
            @HystrixProperty(name = "circuitBreaker.sleepWindowMilliseconds",value="10000"),//时间窗口期
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage",value = "10")//请求失败达到多少次
    })
    @GetMapping("/agent/recommend")
    List<PageAgentListVo> listByUserIdGrade(Long id);


    /**
     * 代理人列表
     * @param pageTo
     * @return
     */
    @HystrixCommand(fallbackMethod = "",commandProperties = {
            @HystrixProperty(name="circuitBreaker.enable",value = "true"),//是否开启路断器
            @HystrixProperty(name="circuitBreaker.requestVolumeThreshold",value = "10"),//请求峰值
            @HystrixProperty(name="execution.isolation.semaphore.maxConcurrentRequests",value = "10"),//允许达到HystrixCommand。run的最大值
            @HystrixProperty(name = "circuitBreaker.sleepWindowMilliseconds",value = "10000"),//时间窗口期
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage",value = "10")//请求失败达到多少次
    })
    @PostMapping("/agent/list")
    List<PageAgentListVo> PostList(@RequestBody PageTo pageTo);


    /**
     * 代理人详情
     * @return
     */
    @HystrixCommand(fallbackMethod = "",commandProperties = {
            @HystrixProperty(name="circuitBreaker.enable",value = "true"),//是否开启路断器
            @HystrixProperty(name="circuitBreaker.requestVolumeThreshold",value = "10"),//请求峰值
            @HystrixProperty(name="execution.isolation.semaphore.maxConcurrentRequests",value = "10"),//允许达到HystrixCommand。run的最大值
            @HystrixProperty(name = "circuitBreaker.sleepWindowMilliseconds",value = "10000"),//时间窗口期
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage",value = "10")//请求失败达到多少次
    })
    @PostMapping("/agent/agent-info")
    List<AgentConditionVo> PostAgentInfo();


    /**
     * 我的代理人
     * @return
     */
    @HystrixCommand(fallbackMethod = "",commandProperties = {
            @HystrixProperty(name="circuitBreaker.enable",value = "true"),//是否开启路断器
            @HystrixProperty(name="circuitBreaker.requestVolumeThreshold",value = "10"),//请求峰值
            @HystrixProperty(name="execution.isolation.semaphore.maxConcurrentRequests",value = "10"),//允许达到HystrixCommand。run的最大值
            @HystrixProperty(name = "circuitBreaker.sleepWindowMilliseconds",value = "10000"),//时间窗口期
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage",value = "10")//请求失败达到多少次
    })
    @PostMapping("/agent/my-agent")
    List<PageAgentListVo> PostMyAgent();

    @PostMapping("/user/login")
    User loginToken();
}
