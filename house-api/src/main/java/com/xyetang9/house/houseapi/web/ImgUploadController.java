package com.xyetang9.house.houseapi.web;

import com.xyetang9.house.houseapi.service.ImgUploadSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * @USER: 柳宇
 * @DATETIME: 2020/8/12 - 19:53
 **/
@RestController
@RequestMapping("/api")
public class ImgUploadController {

    @Autowired
    private ImgUploadSerivce imgUploadSerivce;
    @RequestMapping("/upload/image")
    public String uploadBrandImage(MultipartFile multipartFile){
        return imgUploadSerivce.uploadBrandImage(multipartFile);
    }
}

