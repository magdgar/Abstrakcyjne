package com.company;

import org.junit.Assert;
import java.text.SimpleDateFormat;
import java.util.Date;
import static org.junit.Assert.*;

public class ShopTest {
    private Shop shop;

    @org.junit.Before
    public void setUp() throws Exception {
        shop = new Shop();
    }

    @org.junit.After
    public void tearDown() throws Exception {

    }

    @org.junit.Test
    public void testAddProduct() throws Exception {
        shop.addType(BakedGoods.class);
        shop.addProduct(new BakedGoods());
        Object o = shop.getProduct(BakedGoods.class);
        assertNotNull(o);
        o = shop.getProduct(DairyProducts.class);
        assertNull(o);
    }

    @org.junit.Test
    public void restoreMagasine() throws Exception {
        shop.addType(DairyProducts.class);
        shop.addProduct(new DairyProducts(-3, new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S").parse("2017-01-24 00:00:00.0")));
        shop.addProduct(new DairyProducts(-3, new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S").parse("2011-01-18 00:00:00.0")));
        shop.addProduct(new DairyProducts(-3, new Date()));
        shop.restoreMagasine();
        Assert.assertTrue(shop.products.size() == 2);
    }

    @org.junit.Test
    public void testGetProduct() throws Exception {
        shop.addType(BakedGoods.class);
        shop.addProduct(new BakedGoods());
        Object o = shop.getProduct(BakedGoods.class);
        assertEquals(BakedGoods.class, o.getClass());
        assertNotEquals(DairyProducts.class, o.getClass());
    }
}