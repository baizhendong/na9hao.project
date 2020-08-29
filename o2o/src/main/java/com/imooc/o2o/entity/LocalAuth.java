package com.imooc.o2o.entity;

import java.util.Date;

/**
 * @author shkstart
 * @create 2020-08-27 16:14
 */
public class LocalAuth {
    //ID
    private Long localAuthId;
    //名称
    private String userName;
    //密码
    private String password;
    //创建时间
    private Date createTime;
    //更新时间
    private Date lastEditTime;
    //PersonInfo 外键
    private PersonInfo personInfo;

    public Long getLocalAuthId() {
        return localAuthId;
    }

    public void setLocalAuthId(Long localAuthId) {
        this.localAuthId = localAuthId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public PersonInfo getPersonInfo() {
        return personInfo;
    }

    public void setPersonInfo(PersonInfo personInfo) {
        this.personInfo = personInfo;
    }
}
