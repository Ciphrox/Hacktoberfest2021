class BinaryTree:
    def __init__(self, val):
        self.data = val
        self.left = None
        self.right = None 

def invert_btree(head):
    if head is None:
        return
    else:
        temp = head.right
        head.right = head.left
        head.left = temp
        invert_btree(head.left)
        invert_btree(head.right)

root = BinaryTree(10)
root.left = BinaryTree(30)
root.right = BinaryTree(15)

def inorder(root):
    if root is None:
        return 
    else:
        inorder(root.left)
        print(root.data)
        inorder(root.right)

inorder(root)
invert_btree(root)
inorder(root)