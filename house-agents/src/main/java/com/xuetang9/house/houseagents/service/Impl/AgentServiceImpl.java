package com.xuetang9.house.houseagents.service.Impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.xuetang9.house.domain.Agency;
import com.xuetang9.house.domain.Agent;
import com.xuetang9.house.domain.Owner;
import com.xuetang9.house.domain.User;
import com.xuetang9.house.houseagents.domain.vo.AgentInfoVo;
import com.xuetang9.house.houseagents.domain.vo.AgentListVo;
import com.xuetang9.house.houseagents.service.AgentService;
import com.xuetang9.house.mapper.AgencyMapper;
import com.xuetang9.house.mapper.AgentMapper;
import com.xuetang9.house.mapper.OwnerMapper;
import com.xuetang9.house.mapper.UserMapper;
import com.xuetang9.house.service.impl.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.ArrayList;
import java.util.List;

/**
 * @version 1.0
 * @desc:
 * @author: 纪锦浩
 * @data: 2020年08月16日12:50
 * @address：成都市锦江区西部金融中心
 */
@Service
public class AgentServiceImpl extends BaseServiceImpl<Agent,Long, AgentMapper> implements AgentService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private OwnerMapper ownerMapper;

    @Autowired
    private AgencyMapper agencyMapper;

    @Autowired
    private AgentMapper agentMapper;


    /**
     * 通过查询出的代理人列表直接返回前端数据
     * @param agents
     * @return
     */
    private List<AgentListVo> getAgentVo(List<Agent> agents){
        List<AgentListVo> agentVos = new ArrayList<>();
        for(Agent agent : agents){

            AgentListVo agentVo = new AgentListVo();
            agentVo.setUserId(agent.getUserId());
            agentVo.setEmail(agent.getEmail());
            agentVo.setPhoto(agent.getPhoto());
            // 查询该代理人的电话和真实名称
            User user = userMapper.selectByPrimaryKey(agentVo.getUserId());
            agentVo.setName(user.getName());
            agentVo.setPhone(user.getPhone());
            // 封装代理的房产数量
            Example example = new Example(Owner.class);
            Example.Criteria criteria = example.createCriteria();
            criteria.andEqualTo("agentId",agentVo.getUserId());
            int propertiesCount = ownerMapper.selectCountByExample(example);
            agentVo.setCount(propertiesCount);
            agentVos.add(agentVo);
        }

        return agentVos;
    }

    /**
     * 返回星级代理人
     * @return
     */
    @Override
    public List<AgentListVo> selectByStar(){
        // 查找数据库代理人表返回所有星级为5星的代理人信息（代理人用户编号，代理人电子邮箱）
        Agent agentExample = new Agent();
        agentExample.setCommendStar(5);
        // List<Agent> agents =  super.list(agentExample);
        List<Agent> agents = agentMapper.selectAgentListInfo(agentExample);
        // 封装信息
        return getAgentVo(agents);
    }

    /**
     * 分页查询数据
     *
     * @param pageIndex
     * @param pageSize
     * @return
     */
    @Override
    public List<AgentListVo> listAgentVoByPage(int pageIndex, int pageSize) {
        // List<Agent> agents = super.listByPage(pageIndex,pageSize);
        Page<Agent> page = PageHelper.startPage(pageIndex, pageSize);
        agentMapper.selectAgentListInfo(new Agent());
        return getAgentVo(page);
    }

    /**
     * 代理商旗下代理人
     * @param agencyId
     * @return
     */
    @Override
    public List<AgentListVo> listAgentVoByAgency(long agencyId) {
        Agent agent = new Agent();
        agent.setAgencyId(agencyId);
        // List<Agent> agents = super.list(agent);
        List<Agent> agents = agentMapper.selectAgentListInfo(agent);
        return getAgentVo(agents);
    }


    /**
     * 代理人个人信息
     * @param userId
     * @return
     */
    @Override
    public AgentInfoVo agentInfoById(Long userId) {
        AgentInfoVo agentInfoVo = new AgentInfoVo();
        // 通过用户Id查找代理人信息
        Agent agentExample = new Agent();
        agentExample.setUserId(userId);
        System.out.println(agentExample);
        Agent agent = super.getOne(agentExample);
        if( agent == null ){
            return null;
        }

        // 代理人用户信息
        User agentUser = userMapper.selectByPrimaryKey(agent.getUserId());
        // 根据返回的agent查询代理商信息
        Agency agencyExample = new Agency();
        agencyExample.setId(agent.getAgencyId());
        Agency agency =  agencyMapper.selectOne(agencyExample);
        // 查询代理商所属用户的信息
        User agencyUser = userMapper.selectByPrimaryKey(agency.getUserId());
        // 获取代理人房产数量
        Example example = new Example(Owner.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("agentId",agent.getUserId());
        int propertiesCount = ownerMapper.selectCountByExample(example);

        // 进行数据封装
        // 代理人用户信息
        agentInfoVo.setUserId(agent.getUserId()); // 用户编号
        agentInfoVo.setEmail(agent.getEmail());  // 代理人邮箱
        agentInfoVo.setUserAddress(agencyUser.getAddress()); //代理人地址
        agentInfoVo.setUserName(agentUser.getName()); // 代理人真实姓名
        agentInfoVo.setUserPhone(agentUser.getPhone());    // 代理人座机
        agentInfoVo.setPhoto(agent.getPhoto());     // 代理人照片
        agentInfoVo.setBrief(agentUser.getBrief()); // 代理人说明
        agentInfoVo.setWebSite(agent.getWebSite()); // 代理人个人网站
        agentInfoVo.setPropertiesCount(propertiesCount); // 代理人代理房产数量
        // 代理商信息
        agentInfoVo.setAgencyId(agency.getId()); // 代理商ID
        agentInfoVo.setLicense(agency.getLicense()); //执照编号
        agentInfoVo.setAgencyPhone(agencyUser.getPhone()); // 代理商座机
        agentInfoVo.setAgencyAddress(agencyUser.getAddress()); // 代理商地址

        return agentInfoVo;
    }


}
