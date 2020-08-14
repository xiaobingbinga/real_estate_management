package com.xuetang9.house.houseapi.util;

import com.github.qcloudsms.SmsSingleSender;
import com.github.qcloudsms.SmsSingleSenderResult;
import com.github.qcloudsms.httpclient.HTTPException;
import com.xuetang9.house.houseapi.dto.sdk.SMSDto;

import java.io.IOException;
import java.util.Random;

/**
 * 腾讯云短信发放工具
 * @USER: 柳宇
 * @DATETIME: 2020/8/11 - 13:54
 **/
public class QcloudSMS {

    /**
     *  短信应用 SDK AppID
     */
    private final int appid = 1400412789; // SDK AppID 以1400开头
    /**
     * 短信应用 SDK AppKey
     */
    private final String appkey = "00b800268e0de73a8c2f72d44be0ba43";
    /**
     * 需要发送短信的手机号码
     */
    private final  String[] phoneNumbers = {"21212313123", "12345678902", "12345678903"};
    /**
     * 短信模板 ID，需要在短信应用中申请
     */
    private final int SMS_LOGIN= 687660;
    /**
     * 签名
     */
    private final String smsSign = "老九学堂线下班";
    /**
     * 随机生成器
     */
    private static Random random = new Random();

    /**
     * 生成验证码
     * @param number
     * @return
     */
    private String  productCode(int number){
       StringBuffer code = new StringBuffer();
       for(int i=0;i<number;i++){
           code.append(random.nextInt(10));
       }
        return code.toString();
    };
    public SMSDto sendLogin(String phone){
        String code = productCode(6);
        String codes = "250250";
        String params[] = {codes,"5"};
        SmsSingleSender singleSender = new SmsSingleSender(appid,appkey);
        SMSDto smsDto = new SMSDto();
        try {
            SmsSingleSenderResult result=  singleSender.sendWithParam("86",phone,SMS_LOGIN,params,smsSign,"","");
            smsDto.setCode(code);
            smsDto.setPhone(phone);
            smsDto.setSendResultCode(result.result);
            smsDto.setErrMsg(result.errMsg);
        } catch (HTTPException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return smsDto;
    };
}
