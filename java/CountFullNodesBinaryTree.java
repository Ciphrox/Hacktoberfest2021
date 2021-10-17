
// Java program to count
// full nodes in a Binary Tree
// using Iterative approach
import java.util.Queue;
import java.util.LinkedList;
 
// Class to represent Tree node
class Node
{
    int data;
    Node left, right;
 
    public Node(int item)
    {
        data = item;
        left = null;
        right = null;
    }
}
 
// Class to count full nodes of Tree
class BinaryTree
{
 
    Node root;
 
    /* Function to get the count of full Nodes in
    a binary tree*/
    int getfullCount()
    {
        // If tree is empty
        if (root==null)
        return 0;
         
        // Initialize empty queue.
        Queue<Node> queue = new LinkedList<Node>();
         
        // Do level order traversal starting from root
        queue.add(root);
         
        int count=0; // Initialize count of full nodes
        while (!queue.isEmpty())
        {
 
            Node temp = queue.poll();
            if (temp.left!=null && temp.right!=null)
            count++;
 
            // Enqueue left child
            if (temp.left != null)
            {
                queue.add(temp.left);
            }
 
            // Enqueue right child
            if (temp.right != null)
            {
                queue.add(temp.right);
            }
        }
        return count;
    }
 
    public static void main(String args[])
    {
        /* 2
          / \
        7     5
        \     \
        6     9
        / \ /
        1 11 4
        Let us create Binary Tree as shown
        */
        BinaryTree tree_level = new BinaryTree();
        tree_level.root = new Node(2);
        tree_level.root.left = new Node(7);
        tree_level.root.right = new Node(5);
        tree_level.root.left.right = new Node(6);
        tree_level.root.left.right.left = new Node(1);
        tree_level.root.left.right.right = new Node(11);
        tree_level.root.right.right = new Node(9);
        tree_level.root.right.right.left = new Node(4);
 
        System.out.println(tree_level.getfullCount());
         
    }
}
// OUTPUT
//2
