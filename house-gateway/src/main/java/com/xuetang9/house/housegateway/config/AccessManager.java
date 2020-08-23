package com.xuetang9.house.housegateway.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.authorization.AuthorizationDecision;
import org.springframework.security.authorization.ReactiveAuthorizationManager;
import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.web.server.authorization.AuthorizationContext;
import org.springframework.stereotype.Component;
import org.springframework.util.AntPathMatcher;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @ClassName AccessManager
 * @Description: TODO
 * @Author Mr_W
 * @Date 2020/8/20 16:18
 * @Version V1.0
 */
@Slf4j
@Component
public class AccessManager implements ReactiveAuthorizationManager<AuthorizationContext> {
    private Set<String> permitAll;
    private final AntPathMatcher antPathMatcher = new AntPathMatcher();


    public AccessManager (){
        permitAll = ConcurrentHashMap.newKeySet();
        permitAll.add("/");
        permitAll.add("/error");
        permitAll.add("/favicon.ico");
        permitAll.add("/**/v2/api-docs/**");
        permitAll.add("/**/swagger-resources/**");
        permitAll.add("/webjars/**");
        permitAll.add("/doc.html");
        permitAll.add("/swagger-ui.html");
        permitAll.add("/**/agent/**");
        permitAll.add("/**/agency/**");
        permitAll.add("/**/un_page");
        permitAll.add("/**/properties/**");
        permitAll.add("/**/user/login");
        permitAll.add("/**/user/quest-verification");
        permitAll.add("/**/user/register-by-phone");
        permitAll.add("/**/user/register-by-account");
    }

    @Override
    public Mono<AuthorizationDecision> check(Mono<Authentication> authenticationMono, AuthorizationContext authorizationContext) {
        ServerWebExchange exchange = authorizationContext.getExchange();
        String requestPath = exchange.getRequest().getURI().getPath();
        if (permitAll(requestPath)) {
            return Mono.just(new AuthorizationDecision(true));
        }

        return authenticationMono.map(auth -> {
            return new AuthorizationDecision(checkAuthorities(exchange, auth, requestPath));
        }).defaultIfEmpty(new AuthorizationDecision(false));

    }

    private boolean permitAll(String requestPath) {
        return permitAll.stream()
                .anyMatch(r -> antPathMatcher.match(r, requestPath));
    }

    private boolean checkAuthorities(ServerWebExchange exchange, Authentication auth, String requestPath) {
        if(auth instanceof OAuth2Authentication){
            OAuth2Authentication athentication = (OAuth2Authentication) auth;
            String clientId = athentication.getOAuth2Request().getClientId();
            log.info("clientId 为 {}",clientId);
        }

        Object principal = auth.getPrincipal();
        log.info("用户信息:{}",principal.toString());
        return true;
    }
}
