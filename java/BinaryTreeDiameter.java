 
import java.util.*; 


public class Node {
int value;
Node right;
Node left;
Node() {
	value=0;
	left=right=null;
}
Node(int a) {
	value=a;
	left=right=null;
}
}


public class BinaryTreeDiameter {
	
public static  Node root;

public static Node constructTree(int i,int[] Tree) {
	if(i>=Tree.length)return null;
	Node node=new Node(Tree[i]);
	node.left=constructTree(2*i+1,Tree);
	node.right=constructTree(2*i+2,Tree);
	return node;
}


public static int diameter=0;
public static int diameterOfBinaryTree(Node root) {
    if(root==null)return 0;  // int lh=height(root.left) ;
    int rh=height(root) ;
     
     return diameter;
     // return Math.max(x,lh+rh+1); 
 }

 public static int height(Node r){
     if(r==null)return 0;
     int  lh=height(r.left) ;
     int rh=height(r.right) ;
     diameter=Math.max(diameter,lh+rh);
     return Math.max(lh,rh)+1;
 } 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
    	 int n =sc.nextInt();
    	 int[] Tree=new int[n];
		 for(int i=0;i<n;i++){Tree[i]=sc.nextInt();}
		root=constructTree(0,Tree);
	
		int d=diameterOfBinaryTree(root);
		  
			 System.out.println(d);
			 
		 }
	}



