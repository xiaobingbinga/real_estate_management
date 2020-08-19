package com.xuetang9.househouses.mapper;


import com.xuetang9.house.dto.properties.ConditionTo;
import com.xuetang9.househouses.domain.vo.DisplayVo;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @ClassName: DisplayVoMapper
 * @Description: TODO
 * @Author: 天冬
 * @Date: 2020-08-18 19:33
 * @Address: 成都市锦江区西部国际金融中心老九学堂
 * @Version: v1.0
 */
public interface DisplayVoMapper extends Mapper<DisplayVo> {

    List<DisplayVo> selectDisplayNew(int num);

    List<DisplayVo> selectCondition(ConditionTo conditionTo);

    List<DisplayVo> selectDisplaySpecial(int i);

    List<DisplayVo> selectDisplayAd(int i);

    List<DisplayVo> selectAllPage();
}
