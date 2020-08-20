//package com.xuetang9.house.Filter;

//import com.xuetang9.house.MyConst.Role;
//import com.xuetang9.to.UserCache;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.cloud.gateway.filter.GatewayFilterChain;
//import org.springframework.cloud.gateway.filter.GlobalFilter;
//import org.springframework.core.Ordered;
//import org.springframework.data.redis.core.RedisTemplate;
//import org.springframework.http.HttpStatus;
//import org.springframework.stereotype.Component;
//import org.springframework.web.server.ServerWebExchange;
//import reactor.core.publisher.Mono;
//
//import java.util.*;

/**
 * @USER: 柳宇
 * @DATETIME: 2020/8/19 - 17:01
 **/
//@Component
//public class AuthFilter implements GlobalFilter, Ordered {
//
//    @Autowired
//    RedisTemplate redisTemplate;
//
//    /**
//     * 权限列表
//     */
//    private static Map<String, List<Integer>> authPath;
//
//    public AuthFilter(){
//        authPath = new HashMap<>();
//        authPath.put("/user/forget-password",new ArrayList<>(Arrays.asList(Role.ROLE_USER, Role.ROLE_AGENT, Role.ROLE_AGENCY)));
//        authPath.put("/user/update-user-info",new ArrayList<>(Arrays.asList(Role.ROLE_USER)));
//        authPath.put("/user/update-agent-info",new ArrayList<>(Arrays.asList(Role.ROLE_AGENT)));
//        authPath.put("/user/update-agency-info",new ArrayList<>(Arrays.asList(Role.ROLE_AGENCY)));
//        authPath.put("/properties/add-properties",new ArrayList<>(Arrays.asList(Role.ROLE_USER)));
//    }
//
//    @Override
//    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
//        //获取请求的地址
//        String path = exchange.getRequest().getPath().value();
//        //将地址存入集合中
//        List<Integer> roles = authPath.get(path);
//        //如果地址不等于空
//        if(roles != null){
//         //获取登陆凭证
//         String authorization = exchange.getRequest().getHeaders().getFirst("Authorization");
//         //如果没有登陆
//         if(authorization == null){
//             //直接返回404
//             exchange.getResponse().setStatusCode(HttpStatus.UNAUTHORIZED);
//             return exchange.getResponse().setComplete();
//         }
//
//         //从reids中获取登陆凭证
//          Object o = redisTemplate.opsForValue().get(authorization);
//         if(o == null){
//             //返回404
//             exchange.getResponse().setStatusCode(HttpStatus.UNAUTHORIZED);
//             return exchange.getResponse().setComplete();
//         }
//         //对比权限
//            UserCache userCache = (UserCache) o;
//         if(roles.contains(userCache.getRole())){
//             //返回404
//             exchange.getResponse().setStatusCode(HttpStatus.UNAUTHORIZED);
//             return exchange.getResponse().setComplete();
//         }
//        }
//        //返回当前请求
//        return chain.filter(exchange);
//    }


//    @Override
//    public int getOrder() {
//        return 0;
//    }
//}
