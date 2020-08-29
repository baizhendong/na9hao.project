package com.imooc.o2o.entity;

import java.util.Date;

/**
 * @author shkstart
 * @create 2020-08-28 9:12
 */
public class ProductCategory {
    private Long productCategoryId;
    //外键 商品类型所属店铺
    private Long shopId;
    //商品类型名称
    private String productCategoryName;
    //权重
    private Integer priority;
    //创建时间
    private Date createTime;

    public Long getProductCategoryId() {
        return productCategoryId;
    }

    public void setProductCategoryId(Long productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    public Long getShopId() {
        return shopId;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    public String getProductCategoryName() {
        return productCategoryName;
    }

    public void setProductCategoryName(String productCategoryName) {
        this.productCategoryName = productCategoryName;
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
}
