package com.imooc.o2o.dao;

import com.imooc.o2o.entity.Shop;

/**
 * @author shkstart
 * @create 2020-08-31 13:44
 */
public interface ShopDao {
    /**
     * 新增店铺
     * @param shop
     * @return
     */
    int insertShop(Shop shop);
}
