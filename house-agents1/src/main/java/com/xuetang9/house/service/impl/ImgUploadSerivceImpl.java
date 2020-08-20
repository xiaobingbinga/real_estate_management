package com.xuetang9.house.service.impl;

import com.xuetang9.house.service.ImgUploadSerivce;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * @USER: 柳宇
 * @DATETIME: 2020/8/12 - 19:30
 **/
@Service
public class ImgUploadSerivceImpl implements ImgUploadSerivce {

    @Value("${upload.image.path}")
    private String brandImagePath;

    @Value("${upload.image.server.path}")
    private String imagePath;

    @Override
    public String uploadBrandImage(MultipartFile multipartFile) {
        String imgsPath=null;
        //创建文件对象
        File file = new File(brandImagePath,multipartFile.getOriginalFilename());
        try {
            multipartFile.transferTo(file);
            imgsPath =this.imagePath+ file.getName();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return imgsPath;
    }
}
