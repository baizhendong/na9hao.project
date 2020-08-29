package com.imooc.o2o.entity;

import java.util.Date;

/**
 * @author shkstart
 * @create 2020-08-27 16:11
 */
public class WeChatAuth {
    //ID
    private Long weChatAuthId;
    //
    private String openId;
    //创建时间
    private Date createTime;
    //PersonInfo 外键
    private PersonInfo personInfo;

    public Long getWeChatAuthId() {
        return weChatAuthId;
    }

    public void setWeChatAuthId(Long weChatAuthId) {
        this.weChatAuthId = weChatAuthId;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public PersonInfo getPersonInfo() {
        return personInfo;
    }

    public void setPersonInfo(PersonInfo personInfo) {
        this.personInfo = personInfo;
    }
}
