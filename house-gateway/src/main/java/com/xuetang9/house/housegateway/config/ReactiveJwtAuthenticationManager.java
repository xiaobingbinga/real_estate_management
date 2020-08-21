package com.xuetang9.house.housegateway.config;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.authentication.ReactiveAuthenticationManager;
import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.common.exceptions.InvalidTokenException;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.server.resource.BearerTokenAuthenticationToken;
import reactor.core.publisher.Mono;

/**
 * @ClassName ReactiveJdbcAuthenticationManager
 * @Description: TODO
 * @Author Mr_W
 * @Date 2020/8/20 16:12
 * @Version V1.0
 */
@Slf4j
@AllArgsConstructor
public class ReactiveJwtAuthenticationManager implements ReactiveAuthenticationManager {

    private final TokenStore tokenStore;

    @Override
    public Mono<Authentication> authenticate(Authentication authentication) {
        return Mono.justOrEmpty(authentication)
                .filter(a -> a instanceof BearerTokenAuthenticationToken)
                .cast(BearerTokenAuthenticationToken.class)
                .map(BearerTokenAuthenticationToken::getToken)
                .flatMap((accessToken ->{
                    log.info("accessToken: {}",accessToken);
                    OAuth2AccessToken oAuth2AccessToken = this.tokenStore.readAccessToken(accessToken);
                    if(oAuth2AccessToken == null){
                        return Mono.error(new InvalidTokenException("无效的token"));
                    }else if(oAuth2AccessToken.isExpired()){
                        return Mono.error(new InvalidTokenException("过期的token"));
                    }

                    OAuth2Authentication oAuth2Authentication =this.tokenStore.readAuthentication(accessToken);
                    if(oAuth2Authentication == null){
                        return Mono.error(new InvalidTokenException("Access Token 无效!"));
                    }else {
                        return Mono.just(oAuth2Authentication);
                    }
                })).cast(Authentication.class);
    }
}
