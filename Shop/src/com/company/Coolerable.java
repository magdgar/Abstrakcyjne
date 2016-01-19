package com.company;

import java.util.Date;

/**
 * Created by magdgar on 2016-01-18.
 */
public abstract class Coolerable {
    private int storageTemperature;
    private Date expireDate;

    public  Coolerable(int storageTemperature, Date expireDate){
        this.storageTemperature = storageTemperature;
        this.expireDate = expireDate;
    }

    public Date getExpireDate() {
        return expireDate;
    }
}
