package com.xuetang9.house.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * @USER: 柳宇
 * @DATETIME: 2020/8/12 - 19:28
 **/
public interface ImgUploadSerivce {

    String uploadBrandImage(MultipartFile file);
}
