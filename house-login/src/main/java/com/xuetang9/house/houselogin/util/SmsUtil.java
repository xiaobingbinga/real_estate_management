package com.xuetang9.house.houselogin.util;

import com.aliyuncs.CommonRequest;
import com.aliyuncs.CommonResponse;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.profile.DefaultProfile;

import static java.lang.Math.random;

/**
 * @Author lyt
 * @Date 2020/8/17
 * @Copyright lyt
 * @Describe
 */
public class SmsUtil {
    private static String Uid = "LTAI4FhnmBj778obyo48BQYA";

    private static String Key = "5yNJSfavsDwHLl1Wk7GF8OT6BTrdGY";

    public static String sendSms(String phoneNum) throws ClientException {

        DefaultProfile profile = DefaultProfile.getProfile("cn-hangzhou", "LTAI4FhnmBj778obyo48BQYA", "5yNJSfavsDwHLl1Wk7GF8OT6BTrdGY");
        IAcsClient client = new DefaultAcsClient(profile);

        CommonRequest request = new CommonRequest();
        request.setSysMethod(MethodType.POST);
        request.setSysDomain("dysmsapi.aliyuncs.com");
        request.setSysVersion("2017-05-25");
        request.setSysAction("SendSms");
        request.putQueryParameter("RegionId", "cn-hangzhou");
        request.putQueryParameter("PhoneNumbers", phoneNum);
        request.putQueryParameter("SignName", "VERLAAT");
        request.putQueryParameter("TemplateCode", "SMS_184220851");
        String code = randomVerificationCode();
        request.putQueryParameter("TemplateParam", "{\"code\":\""+code+"\"}");
        CommonResponse response = client.getCommonResponse(request);
        System.out.println(response.getData());
        return code;
    }

    private static String randomVerificationCode(){
        String randomVerificationCode = "";
        for (int i = 0; i < 4; i++) {
            randomVerificationCode += (int)(random()*10);
        }
        return randomVerificationCode;
    }
}
