package com.xuetang9.house.houseagents.mapper;

import com.xuetang9.house.domain.Agency;
import com.xuetang9.house.houseagents.domain.vo.AgencyListVo;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @version 1.0
 * @desc:
 * @author: 纪锦浩
 * @data: 2020年08月23日13:49
 * @address：成都市锦江区西部金融中心
 */
public interface AgencyListVoMapper extends Mapper<AgencyListVo> {

    /**
     * 根据条件查询代理商列表信息
     * @return
     */
    List<AgencyListVo> selectAgencyListInfo( );

}
