package com.xuetang9.demo.domain;

import java.io.Serializable;

/**
 * @ClassName: User
 * @Description: TODO
 * @Author: 天冬
 * @Date: 2020-08-12 21:04
 * @Address: 成都市锦江区西部国际金融中心老九学堂
 * @Version: v1.0
 */
public class User implements Serializable {
    private Integer id;
    private String name;
    private Integer age;
    private String sex;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}
