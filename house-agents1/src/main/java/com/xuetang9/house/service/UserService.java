package com.xuetang9.house.service;

import com.xuetang9.house.domain.User;
import com.xuetang9.house.dto.properties.PageTo;
import com.xuetang9.house.dto.user.LoginTo;
import com.xuetang9.house.vo.AgentConditionVo;
import com.xuetang9.house.vo.PageAgentListVo;

import java.util.List;

/**
 * @USER: 柳宇
 * @DATETIME: 2020/8/17 - 19:34
 **/
public interface UserService {
    /**
     * 分页查询代理人
     * @param pageTo
     * @return
     */
    List<User> listByPage(PageTo pageTo);


    List<AgentConditionVo> listById(Integer id);

    /**
     * 登陆
     * @param to
     * @return
     */
    User oneLogin(LoginTo to);
}
