class Node:
    def __init__(self, val = None) -> None:
        self.data = val
        self.left = None
        self.right = None

class BinaryTree:
    def __init__(self) -> None:
        self.root = None

    def _createTree(self, node):
        value = int(input())
        if value != -999:
            if not node:
                node = Node(value)
            else:
                node.data = value
            print(f'Enter value for left of {node.data} :')
            self._createTree(node.left)
            print(f'Enter value for right of {node.data} :')
            self._createTree(node.right)

    def _inorder(self, node):
        if node is not None:
            self._inorder(node.left)
            print(node.data, end = '  ')
            self._inorder(node.right)

    def _printLevel(self, root, level, space = '  '):
        if not root:
            return
        if level == 1:
            print(root.data, end = space)
        elif level > 1:
            self._printLevel(root.left, level - 1, space)
            self._printLevel(root.right, level - 1, space)
    
    def _height(self, root):
        if not root:
            return 0
        lh = self._height(root.left)
        rh = self._height(root.right)
        if lh > rh:
            return lh + 1
        return rh + 1

    def createTree(self):
        print('Enter value for root node :')
        self._createTree(self.root)

    def height(self):
        return self._height(self.root)

    def printLevel(self, level, space = '  '):
        self._printLevel(self.root, level, space)
    
    def levelOrder(self):
        space = '  '
        h = self.height()
        for i in range(1, h + 1):
            self._printLevel(self.root, i, space)
            print('\n')

    def inorder(self):
        self._inorder(self.root) 
            
    def insert(self, val):
        if not self.root:
            self.root = Node(val)
            return
        l = []
        l.append(self.root)
        while(len(l)):
            temp = l[0]
            l.pop(0)
            if not temp.left:
                temp.left = Node(val)
                break
            else:
                l.append(temp.left)
            if not temp.right:
                temp.right = Node(val)
                break
            else:
                l.append(temp.right)

    def __str__(self) -> str:
        def storeLevel(root, level, space = '  '):
            nonlocal final_str
            if not root:
                return
            if level == 1:
                final_str += str(root.data) + space
            elif level > 1:
                storeLevel(root.left, level - 1, space)
                storeLevel(root.right, level - 1, space)
        final_str = ''
        h = self.height()
        leaves = 2**h/2
        half_leaves = leaves//2
        space = ''
        for i in range(1, h + 1):
            if i == h:
                space = '\t'
            elif( i == 1):
                space = '\t' * int((half_leaves - 1)) + '    '
                final_str += space
            else:
                space = '\t' * int((half_leaves//i - 1)) + '    '
                final_str += space
                space = '\t' * int((half_leaves//(i - 1))) + '    '
            storeLevel(self.root, i, space)
            final_str += '\n\n'
        return final_str 
        #

if __name__ == '__main__':
    tr = BinaryTree()
    # tr.createTree()
    # tr.root = Node(1)
    # tr.root.left = Node(2)
    # tr.root.right = Node(3)
    # tr.root.left.left = Node(4)
    # tr.root.left.right = Node(5)
    # tr.root.right.left = Node(6)
    # tr.root.right.right = Node(7)
    tr.insert(1)
    tr.insert(2)
    tr.insert(3)
    tr.insert(4)
    tr.insert(5)
    tr.insert(6)
    tr.insert(7)
    tr.insert(8)
    tr.insert(9)
    tr.insert(10)
    tr.insert(11)
    tr.insert(12)
    tr.insert(13)
    tr.insert(14)
    tr.insert(15)
    print(tr)
    # execute the above statement and see how the tree will be printed ;)
