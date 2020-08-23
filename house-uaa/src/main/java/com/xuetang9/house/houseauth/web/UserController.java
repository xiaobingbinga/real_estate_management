package com.xuetang9.house.houseauth.web;

import com.xuetang9.house.houseauth.domain.User;
import com.xuetang9.house.houseauth.domain.UserExample;
import com.xuetang9.house.houseauth.mapper.UserMapper;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.common.util.OAuth2Utils;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.provider.*;
import org.springframework.security.oauth2.provider.endpoint.TokenEndpoint;
import org.springframework.security.oauth2.provider.password.ResourceOwnerPasswordTokenGranter;
import org.springframework.security.oauth2.provider.token.AuthorizationServerTokenServices;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.Map;

/**
 * @ClassName UserController
 * @Description: TODO
 * @Author Mr_W
 * @Date 2020/8/19 10:39
 * @Version V1.0
 */
@RestController
@RequestMapping("user")
@AllArgsConstructor
public class UserController {

    private final UserMapper userMapper;
    private final AuthorizationServerTokenServices tokenService;
    private final ClientDetailsService clientDetailsService;

    @PostMapping("token")
    public String readToken(@RequestBody Map<String, String> parameters){
        TokenRequest tokenRequest = new TokenRequest(parameters, parameters.get(OAuth2Utils.CLIENT_ID), OAuth2Utils.parseParameterList(parameters.get(OAuth2Utils.SCOPE)), "password");
        ClientDetails clientDetails = clientDetailsService.loadClientByClientId(parameters.get(OAuth2Utils.CLIENT_ID));
        OAuth2Request oAuth2Request = tokenRequest.createOAuth2Request(clientDetails);
        OAuth2AccessToken token = tokenService.createAccessToken(new OAuth2Authentication(oAuth2Request, null));
        return token.getValue();
    }

    @GetMapping("getByName")
    public User getByName(){
        UserExample example = new UserExample();
        example.or().andAccountEqualTo("test08");
        return userMapper.selectOneByExample(example);
    }

    @GetMapping("current/get")
    public Principal user(Principal principal){
        return principal;
    }
}
