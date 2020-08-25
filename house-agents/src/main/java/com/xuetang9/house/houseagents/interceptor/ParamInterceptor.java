package com.xuetang9.house.houseagents.interceptor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @version 1.0
 * @desc:
 * @author: 纪锦浩
 * @data: 2020年08月18日19:24
 * @address：成都市锦江区西部金融中心
 */
@Slf4j
@Component
public class ParamInterceptor implements HandlerInterceptor {


    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        int pageNum =  Integer.parseInt(request.getParameter("pageNum"));
        int pageSize = Integer.parseInt(request.getParameter("pageSize"));


        if(pageNum <= 0 || pageSize <= 0){
            request.getRequestDispatcher("/un_page").forward(request,response);
        }
        return true;
    }
}
