package com.magda;

/**
 * Created by magdgar on 2016-01-19.
 */
public abstract class DistributedModuleFactory {
    public abstract Data createData();
    public abstract Exporter createExporter();
    public abstract Importer createImporter();
}