package com.example.demo.bean;

import org.apache.ibatis.annotations.Mapper;
/**
 *
 * @author lss
 * @date 2020-07-31 16:41
 * @description 学员信息类
 *
 **/


public class Student {
    private int id;
    private String sname;
    private String birthday;
    private String gender;
    private String telephone;
    private String email;
    private int classId;
    private Classes c;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }
}
