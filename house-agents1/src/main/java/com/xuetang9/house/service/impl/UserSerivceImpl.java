package com.xuetang9.house.service.impl;

import com.xuetang9.house.domain.User;
import com.xuetang9.house.dto.properties.PageTo;
import com.xuetang9.house.dto.user.LoginTo;
import com.xuetang9.house.mapper.UserMapperS;
import com.xuetang9.house.service.UserService;
import com.xuetang9.house.vo.AgentConditionVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * @USER: 柳宇
 * @DATETIME: 2020/8/17 - 19:34
 **/
@Component
@Service
@Transactional(readOnly = true, propagation = Propagation.REQUIRED,timeout = 5000,rollbackFor = {Exception.class})
public class UserSerivceImpl implements UserService {



    @Autowired
    private UserMapperS userMapper;

    @Override
    public List<User> listByPage(PageTo pageTo) {
        List<User>  user = userMapper.selectByPageUser(pageTo.getPageNum(),pageTo.getPageSize());
        return user;
    }

    /**
     * 账号详情
     * @param id
     * @return
     */
    @Override
    public List<AgentConditionVo> listById(Integer id) {
        List<AgentConditionVo> agentConditionVos = new ArrayList<>();

        List<User> userList = userMapper.selectById(id);
        for(User user:userList){
            AgentConditionVo agentConditionVo = new AgentConditionVo();
            BeanUtils.copyProperties(user,agentConditionVo);
            agentConditionVos.add(agentConditionVo);
        }

        return  agentConditionVos;
    }

    /**
     * 登陆
     * @param to
     * @return
     */
    @Override
    public User oneLogin(LoginTo to) {
        return userMapper.selectByLogin(to.getAccount(),to.getPassword());
    }
//    /**
//     * 将查询的用户信息，转换为VO集合
//     * @param user
//     * @return
//     */
//    public List<PageAgentListVo> getTransformationUser(List<User> user){
//        List<PageAgentListVo> listVos = new ArrayList<>();
//        for(User user1 : user){
//            PageAgentListVo agentListVo = new PageAgentListVo();
//            agentListVo.setPhone(user1.getPhone());
//            agentListVo.setUrl(user1.getHead());
//            agentListVo.setUserName(user1.getNikename());
//            //查看代理人数量
//            int agent = agentMapper.selectByCount(user1.getId());
//            agentListVo.setCount(agent);
//            listVos.add(agentListVo);
//        }
//        return listVos;
//    };
}
