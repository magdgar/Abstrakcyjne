package com.magda;

/**
 * Created by magdgar on 2016-01-19.
 */
public abstract class Exporter {
    protected Data exportedData;

    public Exporter(Data exportedData){
        this.exportedData = exportedData;
    }

    public abstract Data exportData();
}
