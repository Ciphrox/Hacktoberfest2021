
class Node {
    int data;
    Node left, right;
    public Node(int item)
    {
        data = item;
        left = right = null;
    }
}


class DiaBinaryTree {
    Node root;
    public static void main(String args[])
    {
        DiaBinaryTree tree = new DiaBinaryTree();
        tree.root = new Node(10);
        tree.root.left = new Node(20);
        tree.root.right = new Node(30);
        tree.root.left.left = new Node(45);
        tree.root.left.right = new Node(73);

        // Function Call
        System.out.println( "Binary Tree Diameter is : " + tree.diameter());


    }
    int diameter(Node root)
    {

        if (root == null)
            return 0;
        int lheight = height(root.left);
        int rheight = height(root.right);
        int ldiameter = diameter(root.left);
        int rdiameter = diameter(root.right);

        return Math.max(lheight + rheight + 1,
                Math.max(ldiameter, rdiameter));
    }

    int diameter() {
        return diameter(root);
    }

    static int height(Node node)
    {
        if (node == null)
            return 0;

        return (1+ Math.max(height(node.left),height(node.right)));


    }

    
}
