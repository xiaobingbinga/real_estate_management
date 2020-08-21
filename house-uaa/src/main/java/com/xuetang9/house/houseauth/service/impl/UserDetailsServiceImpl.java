package com.xuetang9.house.houseauth.service.impl;

import com.xuetang9.house.houseauth.domain.User;
import com.xuetang9.house.houseauth.domain.UserExample;
import com.xuetang9.house.houseauth.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * @ClassName UserDetailServiceImpl
 * @Description: TODO
 * @Author Mr_W
 * @Date 2020/8/19 10:16
 * @Version V1.0
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        //获取本地用户
        UserExample example = new UserExample();
        example.or().andAccountEqualTo(s);
        User user = userMapper.selectOneByExample(example);
        if(user != null){
            //返回oauth2的用户
            return new org.springframework.security.core.userdetails.User(
                    user.getAccount(),
                    user.getPassword(),
                    AuthorityUtils.createAuthorityList(String.valueOf(new GrantedAuthority() {
                        @Override
                        public String getAuthority() {
                            return "ROLE_USER";
                        }
                    })));
        }else{
            throw new UsernameNotFoundException("用户["+s+"]不存在");
        }
    }
}
