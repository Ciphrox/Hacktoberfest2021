/**
 * This class represents a node of a tree. Which contains data and reference to left and right children.
 */
class Node {
    int data;
    Node left, right;

    public Node(int item)
    {
        data = item;
        left = right = null;
    }
}


public class BinaryTreeDiameter {
    //This is the reference of the root of tree.
    Node root;

    // Method to calculate the diameter of the binary tree
    int diameter(Node root)
    {
        // In case tree is empty then diameter will be 0
        if (root == null)
            return 0;

        // get the height of left and right sub-trees
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        // get the diameter of left and right sub-trees
        int leftDiameter = diameter(root.left);
        int rightDiameter = diameter(root.right);

        /**
         * Max diameter can be found in any part of subtrees so first check if max diameter present in any of the sub tree
         * else subtree will go from root.
         */
        return Math.max(leftHeight + rightHeight + 1,
                Math.max(leftDiameter, rightDiameter));
    }

    int diameter() { return diameter(root); }

    /**
     * The function Compute the "height" of a tree. Height
     * is the number of nodes along the longest path from the
     * root node down to the farthest leaf node.
     * @param node
     * @return - height of the node
     */
    static int height(Node node)
    {
        // base case tree is empty
        if (node == null)
            return 0;

        // If tree is not empty then height = 1 + max of
        // left height and right heights
        return (1
                + Math.max(height(node.left),
                height(node.right)));
    }

    public static void main(String args[])
    {
        // creating a binary tree and entering the nodes
        BinaryTreeDiameter tree = new BinaryTreeDiameter();
        tree.root = new Node(2);
        tree.root.left = new Node(3);
        tree.root.right = new Node(4);
        tree.root.left.left = new Node(1);
        tree.root.left.right = new Node(5);

        System.out.println(
                "The diameter of given binary tree is : "
                        + tree.diameter());
    }
}
