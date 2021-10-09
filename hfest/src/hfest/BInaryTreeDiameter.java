package hfest;

import java.util.*;

public class BInaryTreeDiameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int[] Tree=new int[n];
for(int i=0;i<n;i++) {
	Tree[i]=sc.nextInt();
}
Node root=new Node(Tree[0]);
Node temp=root;
for(int i=0;i<n;i++) {
//	Node temp=
	temp.right=new Node(Tree[2*i]);
	temp.left=new Node(Tree[2*i+1]);
}


	}

}
