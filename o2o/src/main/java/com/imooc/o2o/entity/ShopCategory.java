package com.imooc.o2o.entity;

import java.util.Date;

/**
 * @author shkstart
 * @create 2020-08-27 16:53
 */
public class ShopCategory {
    //ID
    private Long shopCategoryId;
    //店铺类型 名称
    private String shopCategoryName;
    //店铺类型 描述
    private String shopCategoryDesc;
    //店铺类型 图片
    private String shopCategoryImg;
    // 店铺类型 权重
    private Integer priority;
    //创建时间
    private Date createTime;
    //更新时间
    private Date lastEditTime;
    //上一级（可为空）
    private ShopCategory parent;

    public Long getShopCategoryId() {
        return shopCategoryId;
    }

    public void setShopCategoryId(Long shopCategoryId) {
        this.shopCategoryId = shopCategoryId;
    }

    public String getShopCategoryName() {
        return shopCategoryName;
    }

    public void setShopCategoryName(String shopCategoryName) {
        this.shopCategoryName = shopCategoryName;
    }

    public String getShopCategoryDesc() {
        return shopCategoryDesc;
    }

    public void setShopCategoryDesc(String shopCategoryDesc) {
        this.shopCategoryDesc = shopCategoryDesc;
    }

    public String getShopCategoryImg() {
        return shopCategoryImg;
    }

    public void setShopCategoryImg(String shopCategoryImg) {
        this.shopCategoryImg = shopCategoryImg;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
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

    public ShopCategory getParent() {
        return parent;
    }

    public void setParent(ShopCategory parent) {
        this.parent = parent;
    }
}
