from Node import Node


class List:

    def __init__(self):
        self.first = None
        self.last = None

    def add(self, node):
        """
        :param node: elem of Node class
        """
        if self.last is None:
            self.first = self.last = node
        else:
            old_last = self.last
            old_last.set_next = node
            node.set_previous = old_last
            self.last = node

    def add(self, value):
        """
        :param value: int
        """
        old_last = self.last
        insert_node = Node(value, old_last)
        if old_last is not None:
            old_last.set_next = insert_node

    def get(self, value):
        item = self.last
        while item != self.first:
            if item.get_value == value:
                return item
            else:
                item = item.get_previous
        if item.get_value == value:
            return item
        else:
            return None

    def count(self):
        count = 0
        item = self.last
        while item != self.first:
            count += 1
            item = item.get_previous
        if self.last == self.first:
            return 1
        else:
            return count
