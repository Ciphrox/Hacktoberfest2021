 
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

public class leftRightBottomView {

    //Function to return a list containing the left view of the given tree.
public static List<Integer> leftView(Node root) {
		 if(root==null)return new ArrayList<Integer>();
		 
	         Queue<Node> q=new ArrayDeque<>();
	         Node end=new Node(-1);
	         q.offer(end);
	         q.offer(root); 
	         ArrayList<Integer> ans=new ArrayList<>();
	         
	         while(!q.isEmpty()){
	             Node node=q.poll();
	           
	             if(node.left!=null)q.offer(node.left);
	             if(node.right!=null)q.offer(node.right);
	            
	             if(node!=end)continue;
	             if(q.isEmpty())break;
	           
	             ans.add(q.peek().value);
	            // q.poll();
	             q.offer(end);
	         }
	         return ans;}


	    //Function to return a list containing the right view of the given tree.
public static List<Integer> rightView(Node root) {
	         if(root==null)return new ArrayList<Integer>();
	         Queue<Node> q=new ArrayDeque<>();
	         q.offer(root);
	         Node end=new Node();
	         q.offer(end);
	         List<Integer> ans=new ArrayList<>();
	         while(!q.isEmpty()){
	        	 Node node=q.poll();
	             if(node==end)break;
	             if(node.left!=null)q.offer(node.left);
	             if(node.right!=null)q.offer(node.right);
	            
	             if(q.peek()!=end)continue;
	             ans.add(node.value);
	             q.poll();
	             q.offer(end);
	         }
	         return ans;}

	
	    

	    //Function to return a list containing the bottom view of the given tree.
public static ArrayList <Integer> bottomView(Node root)
	    { 
	    	if(root==null)return new ArrayList<Integer>(); 
	    	
	    	ArrayList<Integer> ans=new ArrayList<>();
	    	
	        Map<Integer,Integer> m=new TreeMap<>();//TO GET ANS LEFT TO RIGHT IN ORDER
	        Queue<Node[]> q=new ArrayDeque<>();
	        q.offer(new Node[]{root,new Node(0)});
	        
	        while(!q.isEmpty()){
	            Node[] node=q.poll();
	            m.put(node[1].value,node[0].value);
	            if(node[0].left!=null)q.offer(new Node[]{node[0].left,new Node(node[1].value-1)});
	            if(node[0].right!=null)q.offer(new Node[]{node[0].right,new Node(node[1].value+1)});
	        }
	       
	        for(Map.Entry<Integer,Integer> i:m.entrySet())
	        {
	            ans.add(i.getValue());
	        }
	        
	        
	        return ans;
	    } 
	
	
//14 14 3 -1 8 8 12 -1 6 17 3 -1 1 11 10 -1 6 6 13 -1 10 17 7 -1 11 7


	
	
	
public static  Node root;

//Function to construct a binary tree from array
public static Node constructTree(int i,int[] Tree) {
	if(i>=Tree.length||Tree[i]==-1)return null;
	Node node=new Node(Tree[i]);
	node.left=constructTree(2*i+1,Tree);
	node.right=constructTree(2*i+2,Tree);
	return node;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
    	 int n =sc.nextInt();
    	 int[] Tree=new int[n];
		 for(int i=0;i<n;i++){Tree[i]=sc.nextInt();}
		 root=constructTree(0,Tree);
	
		 List<Integer> left=leftView(root);
		 List<Integer>  right=rightView(root);
		 List<Integer>  bottom=bottomView(root);
		 

	     System.out.println(left);
	     System.out.println(right);
	     System.out.println(bottom);
			 
	}

}
