class Node:
    def __init__(self, val):
        self.data = val
        self.next = None

class SinglyLinkedList:
    def __init__(self):
        self.head = None
        self.tail = None
        self.size = 0

    def insertRear(self, val):
        if self.head is None:
            self.head = Node(val)
            self.tail = self.head
            self.size += 1  # would it be the same thing if we did self.tail = Node(ele)?
        else:
            self.tail.next = Node(val)
            self.tail = self.tail.next
            self.size += 1

    def insertFront(self, val):
        if self.head is None:
            self.head = Node(val)
            self.head.next = None
            self.tail = self.head
            self.size += 1
        else:
            newNode = Node(val)
            newNode.next = self.head
            self.head = newNode
            self.size += 1

    def insertAt(self, index, val):
        if index == 0:
            self.insertFront(val)
            self.size += 1
            return
        if index == self.size:
            self.insertRear(val)
            self.size += 1
            return
        temp = self.head
        try:
            for i in range(index - 1):
                temp = temp.next
        except AttributeError:
            print(f'List index {index} is out of bounds')
            return
        newNode = Node(val)
        newNode.next = temp.next
        temp.next = newNode
        self.size += 1

    def insertAfter(self, after, val):
        if self.tail.data == after:
            self.insertRear(val)
            return
        temp = self.head
        try:
            while temp.data != after:
                temp = temp.next
        except AttributeError:
            print(f'Element {after} is not present in the list.')
            return
        newNode = Node(val)
        newNode.next = temp.next
        temp.next = newNode
        self.size += 1
        
    def insertBefore(self, before, val):
        if self.head.data == before:
            self.insertFront(val)
            return
        temp = self.head
        while temp.next.data != before and temp.next != None:
            temp = temp.next
        newNode = Node(val)
        newNode.next = temp.next
        temp.next = newNode
        self.size += 1

    def reverse(self):
        rev = []
        temp = self.head
        while temp is not None:
            rev.append(temp)
            temp = temp.next
        rev.reverse()
        self.head = rev[0]
        temp = self.head
        for node in rev:
            temp.next = node
            temp = temp.next
        temp.next = None
    
    def delete(self, ele):
        temp = self.head
        if temp is None:
            return
        if temp.data == ele:
            self.head = self.head.next
            self.size -= 1
            return
        while temp.next is not None:
            if temp.next.data == ele:
                temp.next = temp.next.next
                break
            temp = temp.next
        self.size -= 1

    def show(self):
        temp = self.head
        while temp is not None:
            print(temp.data, end = '  ')
            temp = temp.next
        print()

    def __len__(self):
        return self.size

    def __str__(self) -> str:
        final_str = 'SinglyLinkedList( '
        temp = self.head
        while temp is not None:
            final_str += str(temp.data) + '  '
            temp = temp.next
        return final_str + ')'

    def __add__(self, other):
        newList = self
        newList.tail.next = other.head
        return newList

    def __iter__(self):
        self.temp = self.head
        return self

    def __next__(self): 
        if self.temp is not None:
            item = self.temp.data
            self.temp = self.temp.next
            return item
        else:
            raise StopIteration

if __name__ == '__main__':
    aa = SinglyLinkedList()
    aa.insertRear(3)
    aa.insertRear(4)
    aa.insertRear(5)
    aa.insertRear(6)
    aa.insertFront(2)
    aa.insertFront(1)
    aa.insertBefore(1, -1)
    aa.insertAt(7, 7)
    aa.show()
    # aa.reverse()
    # aa.show()
    # print(aa + ab)
    # for x in aa:
    #     print(x)
