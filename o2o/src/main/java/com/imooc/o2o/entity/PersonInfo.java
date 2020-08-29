package com.imooc.o2o.entity;

import java.util.Date;

/**
 * @author shkstart
 * @create 2020-08-27 15:38
 */
public class PersonInfo {
    //ID
    private Long userId;
    //用户名
    private String name;
    //
    private String profileImg;
    //email 邮箱
    private String email;
    //性别
    private String gender;
    //是否启用 0.不可用 1.可用
    private Integer enableStatus;
    //用户类型：1.顾客 2.店家 3.超级管理员
    private Integer userType;
    //创建时间
    private Date createTime;
    //更新时间
    private Date lastEditTime;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfileImg() {
        return profileImg;
    }

    public void setProfileImg(String profileImg) {
        this.profileImg = profileImg;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getEnableStatus() {
        return enableStatus;
    }

    public void setEnableStatus(Integer enableStatus) {
        this.enableStatus = enableStatus;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastEditTime() {
        return lastEditTime;
    }

    public void setLastEditTime(Date lastEditTime) {
        this.lastEditTime = lastEditTime;
    }
}
