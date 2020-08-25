// package com.xuetang9.house.houseagents.config;
//
// import com.xuetang9.house.houseagents.interceptor.ParamInterceptor;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.web.servlet.HandlerInterceptor;
// import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
// import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
// import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
// import java.util.ArrayList;
// import java.util.List;
//
// /**
//  * @version 1.0
//  * @desc:
//  * @author: 纪锦浩
//  * @data: 2020年08月18日19:26
//  * @address：成都市锦江区西部金融中心
//  */
// @Configuration
// public class MyWebConfig implements WebMvcConfigurer {
//
//     @Autowired
//     private ParamInterceptor paramInterceptor;
//
//
//     @Override
//     public void addInterceptors(InterceptorRegistry registry) {
//         ArrayList<String> path = new ArrayList<>();
//         path.add("/agent/list");
//         path.add("/agency/agency-list");
//         registry.addInterceptor(paramInterceptor).addPathPatterns(path);
//     }
//
//     @Override
//     public void addViewControllers(ViewControllerRegistry registry) {
//
//     }
// }
