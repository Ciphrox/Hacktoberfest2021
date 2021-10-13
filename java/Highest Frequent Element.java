

import java.util.Scanner;
public class HighfrequentElement {

	public static void main(String[] args) {

           Scanner sc=new Scanner(System.in);
           int size,Max=-1,count=0;
           System.out.print("Enter the size: ");
           size=sc.nextInt();
           int arr[]=new int[size];
           System.out.print("Enter the Array: ");
           for(int i=0;i<size;i++) {
        	   arr[i]=sc.nextInt();
           }
           int element=0;
           for(int i=0;i<size-1;i++) {
        	   for(int j=i+1;j<size;j++) {
        		   if(arr[i]==arr[j]) {
        			   count++;
        		   }
        	   }
        	   if(count>Max) {
        		   Max=count;
        		   element=arr[i];
        	   }
           }
           System.out.print("The most frequent in an array : "+element);
	}

}
