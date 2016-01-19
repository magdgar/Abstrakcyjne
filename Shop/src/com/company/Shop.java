package com.company;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Shop {
    List<Class> types;
    List<Object> products;

    public Shop(){
        types = new LinkedList<>();
        products = new LinkedList<>();
    }

    public void addType(Class claz){
        types.add(claz);
    }

    public void addProduct(Object o){
        for(Class type: types)
            if(type.equals(o.getClass()))
                products.add(o);
    }

    public void restoreMagasine(){
        List<Object> coolerableProducts = products.stream().filter(o -> o instanceof Coolerable).collect(Collectors.toList());
        coolerableProducts.removeIf(o -> ((Coolerable)o).getExpireDate().after(new Date()));
        products = coolerableProducts;
    }

    public Object getProduct(Class claz){
        //predicate
        return products.stream().filter(p -> p.getClass().equals(claz)).findFirst().orElse(null);
    }
}
