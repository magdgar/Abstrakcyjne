package com.magda;

/**
 * Created by magdgar on 2016-01-19.
 */
public class TextExporter extends Exporter {
    public TextExporter(String text) {
        super(new TextData(text));
    }

    @Override
    public Data exportData() {
        return exportedData;
    }
}
