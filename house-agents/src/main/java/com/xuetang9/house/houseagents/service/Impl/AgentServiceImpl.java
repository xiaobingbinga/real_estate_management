package com.xuetang9.house.houseagents.service.Impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.xuetang9.house.domain.*;
import com.xuetang9.house.houseagents.domain.vo.AgentInfoVo;
import com.xuetang9.house.houseagents.domain.vo.AgentListVo;


import com.xuetang9.house.houseagents.mapper.AgentListVoMapper;
import com.xuetang9.house.houseagents.service.AgentService;
import com.xuetang9.house.mapper.*;

import com.xuetang9.house.service.impl.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import javax.xml.ws.spi.WebServiceFeatureAnnotation;
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
@Transactional(propagation = Propagation.REQUIRED, readOnly = true, timeout = 10, rollbackFor = {Exception.class})
public class AgentServiceImpl extends BaseServiceImpl<Agent, Long, AgentMapper> implements AgentService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private OwnerMapper ownerMapper;

    @Autowired
    private AgencyMapper agencyMapper;

    @Autowired
    private AgentListVoMapper agentListVoMapper;

    @Autowired
    private PropertiesMapper propertiesMapper;


    /**
     * 通过查询出的代理人列表直接返回前端数据
     *
     * @param agentListVos
     * @return
     */
    private List<AgentListVo> getAgentVo(List<AgentListVo> agentListVos) {
        for (AgentListVo agentListVo : agentListVos) {
            // 查询该代理人的电话和真实名称
            User user = userMapper.selectByPrimaryKey(agentListVo.getUserId());
            agentListVo.setName(user.getName());
            agentListVo.setMobile(user.getMobile());
            List<Long> ownerIds = getOwnerIdByAgencyId(agentListVo.getId());
            if( ownerIds != null && ownerIds.size() > 0 ){
                agentListVo.setCount(getPropertiesCountByAgencyId(ownerIds));
            }else{
                agentListVo.setCount(0);
            }

        }
        return agentListVos;
    }

    /**
     * 获取代理人的代理编号
     * @param AgentId
     * @return
     */
    private List<Long> getOwnerIdByAgencyId(Long AgentId){
        Owner ownerExample = new Owner();
        ownerExample.setAgentId(AgentId);
        List<Owner> owners = ownerMapper.select(ownerExample);
        if (owners.size() == 0) {
            return null;
        }
        List<Long> ownerIds = new ArrayList<>(owners.size());
        for (Owner owner : owners) {
            ownerIds.add(owner.getId());
        }
        return ownerIds;
    }

    /**
     * 获取代理人的代理的房产数量
     * @param ownerIds
     * @return
     */
    private int getPropertiesCountByAgencyId(List<Long> ownerIds) {
        // 2.通过onwerId列表查询房产表中该代理所代理的房产数量
        Example example = new Example(Properties.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andIn("ownerId", ownerIds);
        return propertiesMapper.selectCountByExample(example);
    }


    /**
     * 返回星级代理人
     *
     * @return
     */
    @Override
    // @Cacheable(value = {"agentByStart"}) // 添加缓存注解
    public List<AgentListVo> selectByStar() {
        // 查找数据库代理人表返回所有星级为5星的代理人信息（代理人用户编号，代理人电子邮箱）
        Agent agentExample = new Agent();
        agentExample.setCommendStar(5);
        List<AgentListVo> agentListVos = agentListVoMapper.selectRecommendAgent(agentExample);
        // 封装信息
        return getAgentVo(agentListVos);
    }

    /**
     * 分页查询数据
     *
     * @param pageIndex
     * @param pageSize
     * @return
     */
    @Override
    // @Cacheable(value = "agentVoListPage",condition = "#pageIndex=1") //只缓存第一页的数据
    public List<AgentListVo> listAgentVoByPage(int pageIndex, int pageSize) {

        Page<AgentListVo> page = PageHelper.startPage(pageIndex, pageSize);

        // 不带条件查询
        List<AgentListVo> agentListVos = agentListVoMapper.selectAgentListInfo(null);

        return getAgentVo(page);
    }

    /**
     * 代理商旗下代理人
     *
     * @param agencyId
     * @return
     */
    @Override
    public List<AgentListVo> listAgentVoByAgency(long agencyId) {
        Agent agent = new Agent();
        agent.setAgencyId(agencyId);
        List<AgentListVo> agentListVos = agentListVoMapper.selectAgentListInfo(agent);
        return getAgentVo(agentListVos);
    }


    /**
     * 代理人个人信息
     *
     * @param userId
     * @return
     */
    @Override
    public AgentInfoVo agentInfoById(Long userId) {
        AgentInfoVo agentInfoVo = new AgentInfoVo();
        // 通过用户Id查找代理人信息
        Agent agentExample = new Agent();
        agentExample.setUserId(userId);
        Agent agent = super.getOne(agentExample);

        if (agent == null) {
            return null;
        }

        // 代理人用户信息
        User agentUser = userMapper.selectByPrimaryKey(agent.getUserId());
        // 根据返回的agent查询代理商信息
        Agency agencyExample = new Agency();
        agencyExample.setId(agent.getAgencyId());
        Agency agency = agencyMapper.selectOne(agencyExample);
        // 查询代理商所属用户的信息
        User agencyUser = userMapper.selectByPrimaryKey(agency.getUserId());


        // 获取代理人的代理编号
        List<Long> ownerIds = getOwnerIdByAgencyId(agent.getId());

        // 获取代理人房产数量
        if(ownerIds != null && ownerIds.size() > 0){
            agentInfoVo.setOwnerIds(ownerIds);
            agentInfoVo.setPropertiesCount(getPropertiesCountByAgencyId(ownerIds));
        }else{
            agentInfoVo.setOwnerIds(null);
            agentInfoVo.setPropertiesCount(0);
        }
        // 进行数据封装
        // 代理人用户信息
        agentInfoVo.setUserId(agent.getUserId());
        agentInfoVo.setEmail(agent.getEmail());
        agentInfoVo.setUserAddress(agencyUser.getAddress());
        agentInfoVo.setUserName(agentUser.getName());
        agentInfoVo.setMobile(agentUser.getMobile());
        agentInfoVo.setPhoto(agent.getPhoto());
        agentInfoVo.setBrief(agentUser.getBrief());
        agentInfoVo.setWebSite(agent.getWebSite());
        agentInfoVo.setAgencyId(agency.getId());
        agentInfoVo.setLicense(agency.getLicense());
        agentInfoVo.setAgencyPhone(agencyUser.getMobile());
        agentInfoVo.setAgencyAddress(agencyUser.getAddress());
        agentInfoVo.setAgencyName(agencyUser.getName());

        return agentInfoVo;
    }


}
