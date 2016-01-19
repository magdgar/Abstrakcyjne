__author__ = 'Makda'

class Exporter:
    data = ""

    def __init__(self, data):
        self.data = data

    def export_data(self):
        a = self.data
        self.data = ""
        return a

class TextExporter(Exporter):
    def __init__(self, data):
        Exporter.__init__(self, data)

