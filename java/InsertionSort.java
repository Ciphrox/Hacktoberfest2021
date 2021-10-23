package com.company;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {

        int[] arr = {-1,7,3,2,5,6};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    //Function to sort the array in ascending order using insertion sort
    static void insertion(int[] arr)
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j > 0; j--) {
                if(arr[j-1] > arr[j])
                {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                else
                {
                    break;
                }
            }
        }

    }
}
