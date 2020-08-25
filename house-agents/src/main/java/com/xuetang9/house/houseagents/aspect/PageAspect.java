package com.xuetang9.house.houseagents.aspect;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.xuetang9.house.dto.properties.PageTo;
import com.xuetang9.house.vo.JsonResult;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
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
    // 定义web包下所有的方法
    @Pointcut("execution(public *com.xuetang9.house.vo.JsonResult com.xuetang9.house.houseagents.web..*.*(com.xuetang9.house.dto.properties.PageTo))")
    public void aspect(){};

    /**
     * 判断分页参数是否完整
     * @param joinPoint
     * @return
     * @throws Throwable
     */
    @Around("aspect()")
    public Object before(ProceedingJoinPoint joinPoint) throws Throwable {

        Object[] objects = joinPoint.getArgs();
        for(Object object: objects){
            if(object instanceof PageTo){
                PageTo pageTo = (PageTo) object;
                if(pageTo.getPageNum() <= 0 || pageTo.getPageSize() <= 0){
                    JsonResult jsonResult = new JsonResult();
                    jsonResult.setMessage("分页参数校验失败");
                    jsonResult.setCode(1001);
                    return jsonResult;
                }
            }
        }
        return joinPoint.proceed(joinPoint.getArgs());
    }







}
