__author__ = 'Makda'

class Data:
    data = ""

    def __init__(self, data):
        self.data = data

class TextData(Data):
    def __init__(self, data):
        Data.__init__(self, data)

    def text(self):
        return self.data
