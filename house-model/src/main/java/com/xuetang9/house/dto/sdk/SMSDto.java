package com.xuetang9.house.dto.sdk;

import lombok.Data;

/**
 * 短信数据结果对象
 * @USER: 柳宇
 * @DATETIME: 2020/8/11 - 14:07
 **/
@Data
public class SMSDto {
    /**
     * 验证码
     */
    private String code;
    /**
     * 手机号
     */
    private String phone;
    /**
     * 发送的结果
     */
    private int sendResultCode;
    /**
     * 错误信息
     */
    private String errMsg;
}
