package com.imooc.o2o.dao;

import com.imooc.o2o.BaseTest;
import com.imooc.o2o.entity.Area;
import com.imooc.o2o.entity.PersonInfo;
import com.imooc.o2o.entity.Shop;
import com.imooc.o2o.entity.ShopCategory;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

/**
 * @author shkstart
 * @create 2020-08-31 14:18
 */
public class ShopDaoTest extends BaseTest {
    @Autowired
    private ShopDao shopDao;

    @Test
    public void shopTest(){
        Shop shop = new Shop();
        Area area = new Area();
        PersonInfo personInfo = new PersonInfo();
        ShopCategory shopCategory = new ShopCategory();
        personInfo.setUserId(1L);
        shopCategory.setShopCategoryId(1L);
        area.setAreaId(1);
        shop.setArea(area);
        shop.setShopCategory(shopCategory);
        shop.setOwner(personInfo);
        shop.setAdvice("test");
        shop.setCreateTime(new Date());
        shop.setEnableStatus(1);
        shop.setPhone("test");
        shop.setPriority(1);
        shop.setShopAddr("test");
        shop.setShopDesc("测试店铺");
        shop.setShopImg("test");
        shop.setShopName("test");
        int effected = shopDao.insertShop(shop);
        Assert.assertEquals(1,effected);
    }
}
