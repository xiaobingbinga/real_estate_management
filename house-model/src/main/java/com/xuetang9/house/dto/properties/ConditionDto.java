package com.xuetang9.house.dto.properties;

import lombok.Data;

/**
 * @author Lucky
 */
@Data
public class ConditionDto{

    private Integer rentType;
    private Integer houseType;
    private String province;
    private String city;
    private Integer roomNumber;
    private Integer bathroomNumber;
    private Integer minPrice;
    private Integer maxPrice;
    private Integer pageNum;
    private Integer pageSize;

}
