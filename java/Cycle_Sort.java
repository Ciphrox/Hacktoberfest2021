/* This sorting method is used only when numbers are given in range from 1 to N or 0 to N.
Space Complexity = O(1)
Time Complexity = O(N) */

// Below is the code to sort numbers from 1 to N

import java.util.*;

class Cycle_Sort{
    static void cycleSort(int[] arr){
        int i=0;
        while(i < arr.length){
            int k = arr[i];
            if(k == i+1)
                i++;
            else{
                int temp = arr[i];
                arr[i] = arr[k-1];
                arr[k-1] = temp;
            }
        }
    }
    static void printArray(int arr[], int size)
	{
		int i;
		for (i = 0; i < size; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}


	public static void main(String args[])
	{
		int arr[] = {4,2,6,1,8,9,3,5,7,11,10 };
		int n = arr.length;
		cycleSort(arr, n);
		System.out.println("Sorted array: ");
		printArray(arr, n);
	}
}