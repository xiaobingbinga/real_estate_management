package com.xuetang9.house.houseagents.filter;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.xuetang9.house.vo.JsonResult;
import org.springframework.web.server.ServerWebExchange;
import org.springframework.web.server.WebFilterChain;
import reactor.core.publisher.Mono;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
import java.util.logging.LogRecord;

/**
 * @version 1.0
 * @desc:
 * @author: 纪锦浩
 * @data: 2020年08月19日9:13
 * @address：成都市锦江区西部金融中心
 */
@WebFilter(filterName = "pageFilter", urlPatterns = "/agent/list")
public class PageFilter implements Filter {



    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("=======================这是初始化执行参数");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        int pageNum = Integer.parseInt(servletRequest.getParameter("pageNum"));
        int pageSize = Integer.parseInt(servletRequest.getParameter("pageSize"));
        if(pageNum <= 0 || pageSize <= 0){
            JsonResult jsonResult = new JsonResult();
            jsonResult.setData(1001);
            jsonResult.setMessage("分页参数不完整");
            ObjectMapper objectMapper = new ObjectMapper();
            servletResponse.setCharacterEncoding("UTF-8");
            servletResponse.getWriter().write(objectMapper.writer().writeValueAsString(jsonResult));
            return ;
        }
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {

    }
}
