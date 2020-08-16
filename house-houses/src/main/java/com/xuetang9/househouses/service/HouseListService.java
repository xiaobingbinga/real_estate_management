package com.xuetang9.househouses.service;

import com.xuetang9.house.domain.Properties;
import com.xuetang9.house.dto.properties.ConditionTo;
import com.xuetang9.house.service.BaseService;
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
@Service
public interface HouseListService extends BaseService<Properties,Integer> {
    List<Properties> selectCondition(ConditionTo conditionTo);

    List<Properties> selectNew(int i);

    List<Properties> selectAd(int number);

    List<Properties> selectSpecial(int i);
}
