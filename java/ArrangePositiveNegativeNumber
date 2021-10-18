import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the length of array : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
        int negCount=0;
		System.out.println("\nEnter the elements of array :: ");
		for (int i=0 ; i<n ; i++) {
			System.out.print("Enter the " + (i+1) + "th element : ");
			arr[i] = sc.nextInt();
			if(arr[i]<0){
			    negCount++;
			}
		}

		System.out.print("\n Array before Arranging Elements is : ");
		System.out.print(Arrays.toString(arr));

		arr = arrangeAll(n,arr,negCount);

		System.out.print("\n Array after Arranging Element is : ");
		System.out.print(Arrays.toString(arr));

		sc.close();
	}
	
	public static int[] arrangeAll(int n,int arr[],int negCount){
	    int temp[]=new int[n];
	    int curr=0;
	    for(int elem:arr){
	        if(elem>=0){
	            temp[negCount++]=elem;
	        }else{
	            temp[curr++]=elem;
	        }
	    }
	    
	    return temp;
	}
}
