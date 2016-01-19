__author__ = 'Makda'

class Importer:
    data = ""

    def __init__(self):
        pass

    def import_data(self, data):
        self.data = data.data

    def imported_text(self):
        a = self.data
        self.data = ""
        return a

class TextImporter(Importer):
    def __init__(self):
        Importer.__init__(self)

