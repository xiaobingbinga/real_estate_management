package com.xuetang9.househouses.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xuetang9.house.domain.Properties;
import com.xuetang9.house.dto.properties.ConditionTo;
import com.xuetang9.house.mapper.PropertiesMapper;
import com.xuetang9.house.service.impl.BaseServiceImpl;
import com.xuetang9.househouses.domain.vo.DisplayVo;
import com.xuetang9.househouses.mapper.DisplayVoMapper;
import com.xuetang9.househouses.service.HouseListService;
import com.xuetang9.househouses.utils.HouseUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
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


    @Autowired
    private DisplayVoMapper displayVoMapper;


    @Override
    public List<DisplayVo> selectCondition(ConditionTo conditionTo) {
        Page<DisplayVo> page = PageHelper.startPage(conditionTo.getPageNum(),conditionTo.getPageSize());
        displayVoMapper.selectCondition(conditionTo);
        return page;
    }

    @Override
    public List<DisplayVo> selectNew(int i) {
        Page<DisplayVo> page = PageHelper.startPage(1,i);
        displayVoMapper.selectDisplayNew(1);
        return page;
    }

    @Override
    public List<DisplayVo> selectAd(int number) {
        Page<DisplayVo> page = PageHelper.startPage(1,number);
        displayVoMapper.selectDisplayAd(1);
        return page;
    }

    @Override
    public List<DisplayVo> selectSpecial(int i) {
        Page<DisplayVo> page = PageHelper.startPage(1,i);
        displayVoMapper.selectDisplaySpecial(1);
        return page;
    }

    @Override
    public List<DisplayVo> selectAll(Integer pageNum, Integer pageSize) {
        Page<DisplayVo> page = PageHelper.startPage(pageNum,pageSize);
        displayVoMapper.selectAllPage();
        return page;
    }

    @Override
    public List<DisplayVo> selectCondition(Long[] ids) {
        return displayVoMapper.selectIdCondition(ids);
    }
}
