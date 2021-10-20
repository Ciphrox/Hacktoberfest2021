//Java program to put all negative
//numbers before positive numbers
import java.io.*;
import java.util.Scanner;

class GFG {

 static void rearrange(int arr[], int n)
 {
     int j = 0, temp;
     for (int i = 0; i < n; i++) {
         if (arr[i] < 0) {
             if (i != j) {
                 temp = arr[i];
                 arr[i] = arr[j];
                 arr[j] = temp;
             }
             j++;
         }
     }
 }

 // A utility function to print an array
 static void printArray(int arr[], int n)
 {
     for (int i = 0; i < n; i++)
         System.out.print(arr[i] + " ");
 }

 // Driver code
 public static void main(String args[])
 {  Scanner sc = new Scanner(System.in);  
	
	int n = sc.nextInt();
	int arr[] = new int[n];
    for (int i = 0; i < n; i++) {
    	arr[i]= sc.nextInt();
    }
	 
	 
	 
    

     rearrange(arr, n);
     printArray(arr, n);
 }
}
