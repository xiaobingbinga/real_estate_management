package com.xuetang9.to;

import lombok.Data;

import java.io.Serializable;

/**
 * @USER: 柳宇
 * @DATETIME: 2020/8/19 - 16:23
 **/
@Data
public class UserCache implements Serializable {

    private Long id;

    private Long expireTime;

    private Integer role;
}
