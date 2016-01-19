from zad1_exporterImporter_python.importer import TextImporter


class DistributedModuleFactory:
    data = ""

    def __init__(self, data):
        self.data = data

    def export_data(self):
        a = self.data
        self.data = ""
        return a

    def create_data(self):
        return self.data

    def create_exporter(self):
        return self.data

    def create_importer(self):
        return TextImporter()

class DistributedModuleTextFactory(DistributedModuleFactory):
    def __init__(self, data):
        DistributedModuleFactory.__init__(self, data)