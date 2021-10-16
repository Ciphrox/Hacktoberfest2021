import java.util.*;
class BinaryTree
{
	Scanner sc=new Scanner(System.in);
	static void preorder(tnode n)	//For preorder traversal of the binary tree
	{
		if(n==null)
			return;
		System.out.print(n.data+"\t");
		preorder(n.left);
		preorder(n.right);
	}
	static void inorder(tnode n)	//For inorder traversal of the binary tree
	{
		if(n==null)
			return;
		inorder(n.left);
		System.out.print(n.data+"\t");
		inorder(n.right);
	}
	static void postorder(tnode n)	//For post order traversal of the binary tree
	{
		if(n==null)
			return;
		postorder(n.left);
		postorder(n.right);
		System.out.print(n.data+"\t");
	}
	public static void main(String args[])	//Driver function
	{
		tnode root=new tnode(1);
		root.left=new tnode(2);
		root.right=new tnode(3);
		root.left.left=new tnode(4);
		root.left.right=new tnode(5);
		root.right.left=new tnode(6);
		root.right.right=new tnode(7);
		System.out.println("Preorder:\t");
		preorder(root);
		System.out.println("\nInorder:\t");
		inorder(root);
		System.out.println("\nPostorder:\t");
		postorder(root);
	}
}
