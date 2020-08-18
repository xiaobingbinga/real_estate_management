package com.xuetang9.house.houselogin.service;


import com.xuetang9.house.houselogin.dto.RegisterByAccountTo;
import com.xuetang9.house.houselogin.dto.RegisterByPhoneTo;


public interface RegisterService {
    /**
     * 手机注册
     * @param registerByPhoneTo
     * @return
     */
    int registerByPhone(RegisterByPhoneTo registerByPhoneTo);

    /**
     * 账号注册
     * @param registerByAccountTo
     * @return
     */
    int registerByAccount(RegisterByAccountTo registerByAccountTo);

    /**
     * 检查数据库中是否已存在手机号
     * @param phone
     * @return
     */
    boolean checkIsExistingPhone(String phone);

    /**
     * 检查数据库中是否已存在账号
     * @param account
     * @return
     */
    boolean checkIsExistingAccount(String account);
}
