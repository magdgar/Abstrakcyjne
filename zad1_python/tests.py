from zad1_exporterImporter_python.data import TextData
from zad1_exporterImporter_python.exporter import TextExporter
from zad1_exporterImporter_python.factory import DistributedModuleTextFactory
from zad1_exporterImporter_python.importer import TextImporter

def test_exporter():
    text_to_be_exported = "Ala ma kota"

    exporter = TextExporter(text_to_be_exported)
    exported_data = exporter.export_data()
    exported_text = TextData(exported_data).text()
    assert text_to_be_exported == exported_text

    exported_data = exporter.export_data()
    exported_text = TextData(exported_data).text()
    text_to_be_exported = ""
    assert text_to_be_exported == exported_text

def test_importer():
    text_to_be_imported = "Ala zgubila dolara"
    data_to_send_to_importer = TextData(text_to_be_imported)
    importer = TextImporter()
    importer.import_data(data_to_send_to_importer)
    data_saved_in_importer = importer.imported_text()
    assert text_to_be_imported == data_saved_in_importer

def test_factory():
    text_to_for_factory = "Ali kot zjadl dolara"
    factory = DistributedModuleTextFactory(text_to_for_factory)
    data_from_factory = factory.create_data()
    text_from_module = TextData(data_from_factory).text()
    assert text_to_for_factory == text_from_module

    exporter = factory.create_exporter()
    text_from_module = TextData(TextExporter(exporter).export_data()).text()
    assert text_to_for_factory == text_from_module
    importer = factory.create_importer()
    assert isinstance(importer, TextImporter)

test_factory()