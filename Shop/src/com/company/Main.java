package com.company;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Shop shop = new Shop();
        shop.addType(DairyProducts.class);
        shop.addProduct(new DairyProducts(4, new Date()));
        System.out.println(shop.getProduct(DairyProducts.class));

    }
}
