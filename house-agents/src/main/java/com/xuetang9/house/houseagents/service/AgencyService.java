package com.xuetang9.house.houseagents.service;

import com.xuetang9.house.domain.Agency;
import com.xuetang9.house.houseagents.domain.vo.AgencyInfoVo;
import com.xuetang9.house.houseagents.domain.vo.AgencyListVo;
import com.xuetang9.house.service.BaseService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @version 1.0
 * @desc: 代理商服务层
 * @author: 纪锦浩
 * @data: 2020年08月16日20:17
 * @address：成都市锦江区西部金融中心
 */
@Service
public interface AgencyService extends BaseService<Agency, Long> {

    /**
     * 代理商列表
     * @param pageSize
     * @param pageIndex
     * @return
     */
    List<AgencyListVo> listAgencyVoByPage(int pageIndex,int pageSize);

    /**
     * 代理商详细信息
     * @param id
     * @return
     */
    AgencyInfoVo agencyInfoById(long id);

}
