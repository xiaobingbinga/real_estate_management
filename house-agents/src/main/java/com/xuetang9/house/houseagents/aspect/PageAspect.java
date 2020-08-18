package com.xuetang9.house.houseagents.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @version 1.0
 * @desc:
 * @author: 纪锦浩
 * @data: 2020年08月17日21:40
 * @address：成都市锦江区西部金融中心
 */
@Component
@Aspect
public class PageAspect  {
    @Pointcut("execution(*com.xuetang9.house.vo.JsonResult com.xuetang9.house.houseagents.web.*.*(*)throws * )")
    public void aspect(){};

    @Before("aspect()")
    public void before(){
        System.out.println("这是前置建议");
    }

}
