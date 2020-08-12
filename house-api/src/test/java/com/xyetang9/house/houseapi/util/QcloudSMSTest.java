package com.xyetang9.house.houseapi.util;

import com.xyetang9.house.houseapi.dto.sdk.SMSDto;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QcloudSMSTest {
    QcloudSMS qcloudSMS = new QcloudSMS();
    @Test
    void sendLogin() {
       SMSDto dto= qcloudSMS.sendLogin("13762805593");
        System.out.println(dto);
    }
}