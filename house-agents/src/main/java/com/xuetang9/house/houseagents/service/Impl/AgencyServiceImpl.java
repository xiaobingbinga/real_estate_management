package com.xuetang9.house.houseagents.service.Impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.xuetang9.house.domain.*;
import com.xuetang9.house.houseagents.domain.vo.AgencyInfoVo;
import com.xuetang9.house.houseagents.domain.vo.AgencyListVo;
import com.xuetang9.house.houseagents.mapper.AgencyListVoMapper;
import com.xuetang9.house.houseagents.service.AgencyService;
import com.xuetang9.house.mapper.*;
import com.xuetang9.house.service.impl.BaseServiceImpl;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

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
@Transactional(propagation = Propagation.REQUIRED, readOnly = true, timeout = 10, rollbackFor = {Exception.class})
public class AgencyServiceImpl extends BaseServiceImpl<Agency, Long, AgencyMapper> implements AgencyService {

    @Autowired
    private AgentMapper agentMapper;

    @Autowired
    private PropertiesMapper propertiesMapper;

    @Autowired
    private OwnerMapper ownerMapper;

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private AgencyListVoMapper agencyListVoMapper;

    /**
     * 代理商列表分页查询
     *
     * @param pageIndex
     * @param pageSize
     * @return
     */
    @Override
    // @Cacheable(value = {"agnecyListByPage"}, condition = "#pageIndex=1")
    public List<AgencyListVo> listAgencyVoByPage(int pageIndex, int pageSize) {

        Page<AgencyListVo> page = PageHelper.startPage(pageIndex, pageSize);
        // 查询代理商列表信息
        List<AgencyListVo> agencyListVos = agencyListVoMapper.selectAgencyListInfo();

        // 数据封装
        for (AgencyListVo agencyListVo : agencyListVos) {
            // 根据该用户名Id查找用户名称
            User user = userMapper.selectByPrimaryKey(agencyListVo.getUserId());
            if (user != null) {
                agencyListVo.setName(user.getName());
            }
            System.out.println("=======================>第" + pageIndex + "页的代理商ID" + agencyListVo.getId());
            HashMap<String, Object> hashMap = calculateCount(agencyListVo.getId());

            agencyListVo.setAgentCount((Integer) hashMap.get("agentCount"));
            agencyListVo.setPropertiesCount((Integer) hashMap.get("propertiesCount"));

        }
        System.out.println(page);
        return page;

    }

    /**
     * 代理商详细信息
     * - 该方法缺少代理商描述和代理商姓名
     *
     * @param id
     * @return
     */
    @Override
    public AgencyInfoVo agencyInfoById(long id) {

        AgencyInfoVo agencyInfoVo = new AgencyInfoVo();

        Agency agency = super.getById(id);
        if (agency == null) {
            return null;
        }
        // 查询该代理商的所属用户
        User user = userMapper.selectByPrimaryKey(agency.getUserId());

        BeanUtils.copyProperties(user, agencyInfoVo);
        BeanUtils.copyProperties(agency, agencyInfoVo);

        HashMap<String, Object> hashMap = calculateCount(id);
        agencyInfoVo.setAgentCount((Integer) hashMap.get("agentCount"));
        agencyInfoVo.setPropertiesCount((Integer) hashMap.get("propertiesCount"));
        agencyInfoVo.setOwnerIds((List<Long>) hashMap.get("ownerIds"));
        // 获取代理商的所有代理编号

        return agencyInfoVo;
    }




    /**
     * 根据代理商ID 查询代理商名下代理人数量和房产数量
     *
     * @param agencyId
     * @return
     */
    public HashMap<String, Object> calculateCount(long agencyId) {
        HashMap<String, Object> hashMap = new HashMap<>();

        // 查询名下代理人数量
        Agent agentExample = new Agent();
        agentExample.setAgencyId(agencyId);

        List<Agent> agents = agentMapper.select(agentExample);

        hashMap.put("agentCount", agents.size());

        if (agents.size() == 0) {
            hashMap.put("propertiesCount", 0);
            return hashMap;
        }
        List<Long> ownerIds = new ArrayList<>();
        // 计算该企业下的员工共有代理多少房产
        int propertiesCount = 0;
        for (Agent agent : agents) {
            //查询一个代理人的编号
            // Owner ownerExample = new Owner();
            // ownerExample.setAgentId(agent.getId());
            // List<Owner> owners = ownerMapper.select(ownerExample);
            //
            // List<Long> longs = ownerMapper.selectOwnerIdByAgentId(agent.getId());
            // System.out.println(longs.toString());
            //
            // if (owners.size() == 0) {
            //     continue;
            // }

            List<Long> ownerIdsTemple = ownerMapper.selectOwnerIdByAgentId(agent.getId());
            if(ownerIdsTemple.size() == 0) {
                continue;
            }
            // for (Owner owner : owners) {
            //     ownerIdsTemple.add(owner.getId());
            // }
            ownerIds.addAll(ownerIdsTemple);
            // 根据代理编号查询该用户代理的房产数量
            Example example = new Example(Properties.class);
            Example.Criteria criteria = example.createCriteria();
            criteria.andIn("ownerId", ownerIdsTemple);
            int propertiesCountTemple = propertiesMapper.selectCountByExample(example);
            if (propertiesCountTemple > 0) {
                propertiesCount += propertiesCountTemple;
            }

        }
        hashMap.put("propertiesCount", propertiesCount);
        hashMap.put("ownerIds",ownerIds);
        return hashMap;
    }
}
