package com.xuetang9.house.web;

import com.xuetang9.house.service.ImgUploadSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
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

    /**
     * 文件上传
     * @param file
     * @return
     */
    @PostMapping("/upload/image")
    public String uploadBrandImage(MultipartFile file){
        return imgUploadSerivce.uploadBrandImage(file);
    }
}

