import com.magda.*;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by magdgar on 2016-01-19.
 */
public class Tests {

    @Test
    public void TestExporter(){
        String textToBeExported = "Ala ma kota";
        Exporter exporter = new TextExporter(textToBeExported);
        Data exportedData = exporter.exportData();
        String exportedText = ((TextData) exportedData).getData();
        Assert.assertEquals(textToBeExported, exportedText);
        exporter = new TextExporter("");
        exportedData = exporter.exportData();
        exportedText = ((TextData) exportedData).getData();
        textToBeExported = "";
        Assert.assertEquals(textToBeExported, exportedText);
    }

    @Test
    public void TestImporter(){
        String textToBeImported = "Ala ma psa";
        Data dataToSendToImporter = new TextData(textToBeImported);
        Importer importer = new TextImporter();
        importer.importData(dataToSendToImporter);
        String dataSavedInImporter = ((TextImporter) importer).getImportedText();
        Assert.assertEquals(textToBeImported, dataSavedInImporter);
    }

    @Test
    public void TestFactory(){
        String textToForFactory = "Karol ma rybke";
        DistributedModuleFactory factory = new DistributedModuleTextFactory(textToForFactory);
        Data dataFromFactory = factory.createData();
        String textFromModule = ((TextData) dataFromFactory).getData();
        Assert.assertEquals(textToForFactory, textFromModule);
        Exporter exporter = factory.createExporter();
        textFromModule = ((TextData) ((TextExporter) exporter).exportData()).getData();
        Assert.assertEquals(textToForFactory, textFromModule);
        Importer importer = factory.createImporter();
        Assert.assertTrue(importer instanceof TextImporter);
    }


}
