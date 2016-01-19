
class Node:

    def __init__(self, val):
        self.value = val
        self.ancestor = None
        self.coeval = None
        self.offspring = None

    def __init__(self, val, prev):
        self.value = val
        self.ancestor = prev
        self.coeval = None
        self.offspring = None

    def set_previous(self, node):
        self.ancestor = node

    def set_middle(self, node):
        self.coeval = node

    def set_next(self, node):
        self.offspring = node

    def set_value(self, val):
        self.value = val

    def get_previous(self):
        return self.ancestor

    def get_middle(self):
        return self.coeval

    def get_next(self):
        return self.offspring

    def get_value(self):
        return self.value