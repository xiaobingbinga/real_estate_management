package com.xuetang9.house.houseapi.util;

import com.xuetang9.house.houseapi.dto.sdk.SMSDto;
import org.junit.jupiter.api.Test;

class QcloudSMSTest {
    QcloudSMS qcloudSMS = new QcloudSMS();
    @Test
    void sendLogin() {
       SMSDto dto= qcloudSMS.sendLogin("13762805593");
        System.out.println(dto);
    }
}