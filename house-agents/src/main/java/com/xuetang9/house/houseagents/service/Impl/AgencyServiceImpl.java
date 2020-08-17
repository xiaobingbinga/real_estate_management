package com.xuetang9.house.houseagents.service.Impl;

import com.xuetang9.house.domain.Agency;
import com.xuetang9.house.domain.Agent;
import com.xuetang9.house.domain.Owner;
import com.xuetang9.house.domain.User;
import com.xuetang9.house.houseagents.domain.vo.AgencyInfoVo;
import com.xuetang9.house.houseagents.domain.vo.AgencyListVo;
import com.xuetang9.house.houseagents.service.AgencyService;
import com.xuetang9.house.mapper.AgencyMapper;
import com.xuetang9.house.mapper.AgentMapper;
import com.xuetang9.house.mapper.OwnerMapper;
import com.xuetang9.house.mapper.UserMapper;
import com.xuetang9.house.service.impl.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @version 1.0
 * @desc: 代理商服务层实现
 * @author: 纪锦浩
 * @data: 2020年08月16日20:18
 * @address：成都市锦江区西部金融中心
 */
@Service
public class AgencyServiceImpl extends BaseServiceImpl<Agency, Long, AgencyMapper> implements AgencyService {

    @Autowired
    private AgentMapper agentMapper;

    @Autowired
    private OwnerMapper ownerMapper;

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<AgencyListVo> listAgencyVoByPage(int pageSize, int pageIndex) {

        List<AgencyListVo> agencyListVos = new ArrayList<>();
        // 查询代理商列表信息
        List<Agency> agencies = super.listByPage(pageSize,pageIndex);
        // 数据封装
        for(Agency agency : agencies){
            AgencyListVo agencyListVo = new AgencyListVo();
            agencyListVo.setId(agency.getId());
            agencyListVo.setIcon(agency.getIcon());

            HashMap<String,Integer> hashMap = calculateCount(agency.getId());
            agencyListVo.setAgentCount(hashMap.get("agentCount"));
            agencyListVo.setPropertiesCount(hashMap.get("propertiesCount"));

            agencyListVos.add(agencyListVo);
        }

        return agencyListVos;
    }

    /**
     * 代理商详细信息
     *  - 该方法缺少代理商描述和代理商姓名
     * @param id
     * @return
     */
    @Override
    public AgencyInfoVo agencyInfoById(long id) {
        AgencyInfoVo agencyInfoVo = new AgencyInfoVo();


        Agency agency = super.getById(id);
        if(agency == null){
            return null;
        }
        HashMap<String, Integer> hashMap = calculateCount(id);
        // 查询该代理商的所属用户
        User user = userMapper.selectByPrimaryKey(agency.getUserId());

        agencyInfoVo.setId(agency.getId());

        agencyInfoVo.setEmail(agency.getEmail());
        agencyInfoVo.setIcon(agency.getIcon());
        agencyInfoVo.setLicense(agency.getLicense());
        agencyInfoVo.setAddress(user.getAddress());
        agencyInfoVo.setPhone(user.getPhone());

        agencyInfoVo.setName(null);
        agencyInfoVo.setBrief(null);

        agencyInfoVo.setAgentCount(hashMap.get("agentCount"));
        agencyInfoVo.setPropertiesCount(hashMap.get("propertiesCount"));

        return agencyInfoVo;
    }


    /**
     * 根据代理商ID 查询代理商名下代理人数量和房产数量
     * @param agencyId
     * @return
     */
    private HashMap<String,Integer> calculateCount(long agencyId){
        HashMap<String,Integer> hashMap = new HashMap<>(2);
        // 查询名下代理人数量
        Example agencyExample = new Example(Agent.class);
        Example.Criteria criteria = agencyExample.createCriteria();
        criteria.andEqualTo("agencyId",agencyId);
        List<Agent> agents = agentMapper.selectByExample(agencyExample);
        hashMap.put("agentCount",agents.size());
        // 根据代理人查询名下房产数量
        int propertiesCount =  0;
        // 计算该企业下的员工共有代理多少房产
        for( Agent agent : agents ){
            Owner owner = new Owner();
            owner.setAgentId(agent.getUserId());
            int propertiesTempCount = ownerMapper.selectCount(owner);
            if(propertiesTempCount > 0){
                propertiesCount += propertiesTempCount;
            }
        }
        hashMap.put("propertiesCount",propertiesCount);
        return hashMap;
    }
}
