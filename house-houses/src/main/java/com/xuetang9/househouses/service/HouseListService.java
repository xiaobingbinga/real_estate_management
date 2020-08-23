package com.xuetang9.househouses.service;

import com.github.pagehelper.PageInfo;
import com.xuetang9.house.domain.Properties;
import com.xuetang9.house.dto.properties.ConditionTo;
import com.xuetang9.house.service.BaseService;
import com.xuetang9.househouses.domain.vo.DisplayVo;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName: HouseListService
 * @Description: TODO
 * @Author: 天冬
 * @Date: 2020-08-16 15:20
 * @Address: 成都市锦江区西部国际金融中心老九学堂
 * @Version: v1.0
 */
public interface HouseListService extends BaseService<Properties,Integer> {
    List<DisplayVo> selectCondition(ConditionTo conditionTo);

    List<DisplayVo> selectNew(int i);

    List<DisplayVo> selectAd(int number);

    List<DisplayVo> selectSpecial(int i);

    List<DisplayVo> selectAll(Integer pageNum, Integer pageSize);
}
