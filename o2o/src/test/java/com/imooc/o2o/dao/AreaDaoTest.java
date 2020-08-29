package com.imooc.o2o.dao;

import com.imooc.o2o.BaseTest;
import com.imooc.o2o.entity.Area;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author shkstart
 * @create 2020-08-28 15:14
 */
public class AreaDaoTest extends BaseTest {
    @Autowired
    private AreaDao areaDao;

    @Test
    public void testQueryArea(){
        List<Area> areaList = areaDao.queryArea();
        Assert.assertEquals(2,areaList.size());
    }
}
