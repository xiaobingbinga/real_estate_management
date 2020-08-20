package com.xuetang9.house.service.impl;

import com.netflix.discovery.converters.Auto;
import com.xuetang9.house.domain.*;
import com.xuetang9.house.dto.properties.PageTo;
import com.xuetang9.house.mapper.*;
import com.xuetang9.house.service.AgentService;
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
 * @DATETIME: 2020/8/17 - 17:19
 **/
@Component
@Service
@Transactional(readOnly = true,propagation = Propagation.REQUIRED,timeout = 5000,rollbackFor = {Exception.class})
public class AgentServiceImpl implements AgentService {

    @Autowired
    private RentTypeMapperS rentTypeMapperS;

    @Autowired
    private PropertiesTypeMapperS propertiesTypeMapperS;

    @Autowired
    private PropertiesMapperS propertiesMapperS;

    @Autowired
    private OwnerMapperS ownerMapperS;

    @Autowired
    private AgencyMapperS agencyMappers;

    @Autowired
    private AgentMapperS agentMapper;

    /**
     * 分页查询代理人
     * @param pageTo
     * @return
     */
    @Override
    public List<Agent> listByPage(PageTo pageTo) {
        List<Agent> agents = agentMapper.selectByPage(pageTo.getPageNum(),pageTo.getPageSize());
        return agents;
    };
    /**
     * 将查询的代理人
     * @param
     * @return
     */
    @Override
    public Integer selectByCount(Long id){
        return agentMapper.selectByCount(id);
    }

    /**
     * 代理人详情
     * @param id
     * @return
     */
    @Override
    public List<AgentConditionVo> listById(Integer id) {
        List<AgentConditionVo> agentConditionVos = new ArrayList<>();
        //查询代理人信息
        Agent agents = agentMapper.selectById(id);
        //代理商信息
        Agency count = agencyMappers.selectById(agents.getAgencyId());
        //代理人信息
        Owner owner = ownerMapperS.selectByAgentId(count.getId());
        //房产信息
        Properties properties = propertiesMapperS.selectByOwnerId(owner.getId());
        //房产类型
        PropertiesType propertiesType = propertiesTypeMapperS.selectByType(properties.getType());
        //租售类型
        RentType rentType = rentTypeMapperS.selectByRentType(properties.getRentType());
        AgentConditionVo agentConditionVo = new AgentConditionVo();
        //房子类型
        agentConditionVo.setHouseTitle(propertiesType.getTypeName());
        //代理商
        agentConditionVo.setLicense(count.getLicense());
        //代理人
        agentConditionVo.setCompany(owner.getCompany());
        //租售类型
        agentConditionVo.setRentType(rentType.getTypeName());
        //面积
        agentConditionVo.setSquare(properties.getSquare());
        //房间数量
        agentConditionVo.setRoomNumber(properties.getRoomNumber());
        //卫生间数量
        agentConditionVo.setBathroomNumber(properties.getBathroomNumber());
        //房子地址
        agentConditionVo.setHouseAddress(properties.getAddress());
        //车位个数
        agentConditionVo.setGarageNumber(properties.getGarageNumber());
        //邮箱
        agentConditionVo.setEmail(agents.getEmail());
        //个人网站
        agentConditionVo.setWebSite(agents.getWebSite());
        //从业证书许可证
        agentConditionVo.setCertification(agents.getCertification());
//
//        BeanUtils.copyProperties(properties,agentConditionVo);
//        BeanUtils.copyProperties(agents,agentConditionVo);

        agentConditionVos.add(agentConditionVo);
        return agentConditionVos;
    }

}
