package implementation;

import node.Node;

import java.util.*;

public class MyBST {
    private Node root;

    public void setRoot(Node root) {
        this.root = root;
    }

    public Node getRoot() {
        return root;
    }

    public Node insert(Node root, int data) //O(logn)
    {
        if(root == null)
        {
            root  = new Node(data);
            return root;
        }
        if(data<root.getData())
            root.setLeft(insert(root.getLeft(),data));
        else
            root.setRight(insert(root.getRight(),data));
        return root;
    }
    public void inOrder(Node root){
        if(root==null)
            return;
        inOrder(root.getLeft());
        System.out.print(root.getData()+" ");
        inOrder(root.getRight());
    }
    public boolean search(Node root,int data) //O(logn)
    {
        if(root==null)
            return false;
        if(root.getData()==data)
            return true;
        if(data< root.getData())
            return search(root.getLeft(),data);
        else
            return search(root.getRight(), data);
    }

    public void deleteinBST(int data) //O(logn)
    {
        Node temp = root;
        Node parent  = null;
        while(temp!=null && temp.getData()!=data)
        {
            parent = temp;
            if(data<temp.getData())
                temp = temp.getLeft();
            else
                temp = temp.getRight();
        }
        if(temp!=null)
        {
//            deleting leaf node and node having one children
            if(temp.getLeft()==null || temp.getRight()==null)
            {
                if(temp.getData()< parent.getData())
                {
                    if(temp.getLeft()==null)
                        parent.setLeft(temp.getRight());
                    else
                        parent.setLeft(temp.getLeft());
                }
                else
                {
                    if(temp.getLeft()==null)
                        parent.setRight(temp.getRight());
                    else
                        parent.setRight(temp.getLeft());
                }
            }
            else{
//                deleting node having two children
                Node successor = getSuccessor(temp.getRight());
                deleteinBST(successor.getData());
                temp.setData(successor.getData());
            }
        }
    }

    private Node getSuccessor(Node temp) {
//        System.out.println(temp.getData());
        Node res = temp;
        while(temp!=null)
        {
            res = temp;
            temp = temp.getLeft();
        }
        return res;
    }
    public int height(Node root) //O(n)
    {
        if(root==null)
            return -1;
        return 1+Math.max(height(root.getLeft()),height(root.getRight()));
    }
    public int countNodes(Node root) //O(n)
    {
        if(root==null)
            return 0;
        return 1+countNodes(root.getLeft())+countNodes(root.getRight());
    }
    public int sumOfNodes(Node root) //O(n)
    {
        if(root==null)
            return 0;
        return root.getData()+sumOfNodes(root.getLeft())+sumOfNodes(root.getRight());
    }
    public void levelOrderTraversal(Node root)
    {
        if(root==null)
            return;
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty())
        {
                Node temp = q.remove();
                System.out.print(temp.getData()+" ");
                if(temp.getLeft()!=null)
                    q.add(temp.getLeft());
                if(temp.getRight()!=null)
                    q.add(temp.getRight());
        }
    }
    public void rightTree(Node root) //O(n)
    {
        if(root==null)
            return;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            int n = q.size();
            for(int i=0;i<n;i++)
            {
                Node temp = q.remove();
                if(i==n-1)
                    System.out.print(temp.getData()+" ");
                if(temp.getLeft()!=null)
                    q.add(temp.getLeft());
                if(temp.getRight()!=null)
                    q.add(temp.getRight());
            }

        }
    }
    public void leftTree(Node root)  //O(n)
    {
        if(root==null)
            return;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            int n = q.size();
            for(int i=0;i<n;i++)
            {
                Node temp = q.remove();
                if(i==0)
                    System.out.print(temp.getData()+" ");
                if(temp.getLeft()!=null)
                    q.add(temp.getLeft());
                if(temp.getRight()!=null)
                    q.add(temp.getRight());
            }
        }
    }
//    AVL(BALANCED BINARY SEARCH TREE)
}
