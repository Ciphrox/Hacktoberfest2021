import java.util.*;
class BinarySearchTree
{
    Scanner sc=new Scanner(System.in);
    tnode root;
    tnode insert(int val, tnode root) //For insertion of new node in tree
    {
        if(root==null)
            root=new tnode(val);
        else if(val<=root.data)
            root.left=insert(val, root.left);
        else
            root.right=insert(val, root.right);
        return root;
    }
    tnode delete1(int val, tnode root)
    {
        //If root is deleted
        //the function replaces it with successor
        if(root==null)
            return root;
        if(val<root.data)
            root.left=delete1(val, root.left);
        else if(val>root.data)
            root.right=delete1(val, root.right);
        else
        {
            if(root.left==null)
                return root.right;
            else if(root.right==null)
                return root.left;
            root.data=minValue(root.right);
            root.right=delete1(root.data, root.right);
        }
        return root;
    }
    int minValue(tnode root)
    {
        //The function returns the successor,
        //i.e. leftmost node, of the right subtree
        int minv=root.data;
        while(root.left!=null)
        {
            minv=root.left.data;
            root=root.left;
        }
        return minv;
    }
    tnode delete2(int val, tnode root)
    {
        //If root is deleted
        //the function replaces it with predecessor
        if(root==null)
            return root;
        if(val<root.data)
            root.left=delete2(val, root.left);
        else if(val>root.data)
            root.right=delete2(val, root.right);
        else
        {
            if(root.left==null)
                return root.right;
            else if(root.right==null)
                return root.left;
            root.data=maxValue(root.left);
            root.left=delete2(root.data, root.left);
        }
        return root;
    }
    int maxValue(tnode root)
    {
        //The function returns the predecessor,
        //i.e. leftmost node, of the right subtree
        int maxv=root.data;
        while(root.right!=null)
        {
            maxv=root.right.data;
            root=root.right;
        }
        return maxv;
    }
    void PrettyPrint(tnode currPtr)
    {
        //Manages printing function
        System.out.println("Binary Tree Visualization:");
        printHelper(currPtr, "", true);
    }
    void printHelper(tnode currPtr, String indent, boolean last)
    {
        //Prints the tree structure on the screen
        if (currPtr != null)
        {
            System.out.print(indent);
            if (last)
            {
                System.out.print("R----");
                indent += "     ";
            }
            else
            {
                System.out.print("L----");
                indent += "|    ";
            }
            System.out.println(currPtr.data);
            printHelper(currPtr.left, indent, false);
            printHelper(currPtr.right, indent, true);
        }
    }
    void preorder_print(tnode root)
    {
        //Manages preorder traversion
        System.out.print("Preorder Traversal:");
        preorder(root);
        System.out.println();
    }
    void preorder(tnode n)
    {
        if(n==null)
            return;
        System.out.print("\t"+n.data);
        preorder(n.left);
        preorder(n.right);
    }
    void inorder_print(tnode root)
    {
        //Manages inorder traversion
        System.out.print("Inorder Traversal:");
        inorder(root);
        System.out.println();
    }
    void inorder(tnode n)
    {
        if(n==null)
            return;
        inorder(n.left);
        System.out.print("\t"+n.data);
        inorder(n.right);
    }
    void postorder_print(tnode root)
    {
        //Manages postrder traversion
        System.out.print("Postrder Traversal:");
        postorder(root);
        System.out.println();
    }
    void postorder(tnode n)
    {
        if(n==null)
            return;
        postorder(n.left);
        postorder(n.right);
        System.out.print("\t"+n.data);
    }
    public static void main(String[] args)
    {
        BinarySearchTree ob=new BinarySearchTree();
        ob.root=ob.insert(50,ob.root);
        ob.root=ob.insert(30,ob.root);
        ob.root=ob.insert(20,ob.root);
        ob.root=ob.insert(20,ob.root);
        ob.root=ob.insert(70,ob.root);
        ob.root=ob.insert(60,ob.root);
        ob.root=ob.insert(80,ob.root);
        System.out.println("Before deletion-->");
        ob.preorder_print(ob.root);
        ob.inorder_print(ob.root);
        ob.postorder_print(ob.root);
        ob.root=ob.delete1(50,ob.root);
        System.out.println("\nAfter deletion-->");
        ob.preorder_print(ob.root);
        ob.inorder_print(ob.root);
        ob.postorder_print(ob.root);
        System.out.println();
        ob.PrettyPrint(ob.root);
		System.out.println(ob.root.data);
    }
}
