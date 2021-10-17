 
import java.util.*;

public class AggressiveCows {
public static int minDis(int[] arr,int n,int c) {
	int l=1,r=arr[n-1]-arr[0];
	int max=0;
	while(l<=r) {
		int mid=(l+r)/2;
		if(isPossible(mid,arr,n,c)) {max=mid;l=mid+1;}
		else r=mid-1;
	}
	
	return max;
}
	public static boolean isPossible(int d,int[] arr,int n,int c) {
		int prev=0;
		for(int i=1;i<n;i++) {
			if(arr[i]-arr[prev]>=d) {prev=i;c--;}
		}
		return c==1;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
		 int t=sc.nextInt();
    	while(t>0) {
    		
		 int n =sc.nextInt();
    	 int c=sc.nextInt();
    	 
    	 int[] arr=new int[n];
    	 for(int i=0;i<n;i++) {
    		 arr[i]=sc.nextInt();
    	 }
    	 Arrays.sort(arr);
    	 int dis=minDis(arr,n,c);
    	 System.out.println(dis);
	
	
	t--;}
    	
	}
	
	
	
	
	
	
	
	

}
