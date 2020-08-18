package com.xuetang9.househouses.service.impl;

import com.xuetang9.house.domain.Properties;
import com.xuetang9.house.dto.properties.ConditionTo;
import com.xuetang9.house.mapper.PropertiesMapper;
import com.xuetang9.house.service.impl.BaseServiceImpl;
import com.xuetang9.househouses.domain.vo.DisplayVo;
import com.xuetang9.househouses.service.HouseListService;
import com.xuetang9.househouses.utils.HouseUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName: HouseListServiceImpl
 * @Description: TODO
 * @Author: 天冬
 * @Date: 2020-08-16 15:20
 * @Address: 成都市锦江区西部国际金融中心老九学堂
 * @Version: v1.0
 */
@Service
public class HouseListServiceImpl extends BaseServiceImpl<Properties,Integer,PropertiesMapper>
    implements HouseListService {



    @Override
    public List<DisplayVo> selectCondition(ConditionTo conditionTo) {
        Properties properties = new Properties();
        BeanUtils.copyProperties(conditionTo,properties);
        List<Properties> properties1 = super.list(properties);
        return HouseUtil.copyList(properties1);
    }

    @Override
    public List<DisplayVo> selectNew(int i) {
        Properties properties = new Properties();
        properties.setNews((byte) 1);
        List<Properties> properties1 = super.listByPage(1,i,properties);
        return HouseUtil.copyList(properties1);
    }

    @Override
    public List<DisplayVo> selectAd(int number) {
        Properties properties = new Properties();
        properties.setAd((byte) 1);
        List<Properties> properties1 = super.listByPage(1,number,properties);
        return HouseUtil.copyList(properties1);
    }

    @Override
    public List<DisplayVo> selectSpecial(int i) {
        Properties properties = new Properties();
        properties.setSpecial((byte) 1);
        List<Properties> properties1 = super.listByPage(1,i,properties);
        return HouseUtil.copyList(properties1);
    }

    @Override
    public List<DisplayVo> selectAll(Integer pageNum, Integer pageSize) {
        List<Properties> properties = super.listByPage(pageNum,pageSize);
        return HouseUtil.copyList(properties);
    }
}
