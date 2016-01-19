package com.magda;

/**
 * Created by magdgar on 2016-01-19.
 */
public class TextImporter extends Importer {
    private Data importedData;

    @Override
    public Data importData(Data importededData) {
        this.importedData = importededData;
        return importededData;
    }

    public String getImportedText() {
        return ((TextData) importedData).getData();
    }
}