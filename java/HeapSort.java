package sort;

import java.util.Arrays;

public class HeapSort {
    private int left(int i)
    {
        return 2*i+1;
    }
    private int right(int i)
    {
        return 2*i+2;
    }
    private int parent(int i)
    {
        return (i-1)/2;
    }


    private void maxHeapify(int arr[],int n,int i)
    {
        int l = left(i);
        int r = right(i);
        int large = i;
        if(l<n && arr[l]>arr[i])
            large = l;
        if(r<n && arr[r] > arr[large])
            large = r;
        if(large!=i)
        {
            swap(arr,i,large);
            maxHeapify(arr,n,large);
        }
    }
    private void buildHeap(int arr[],int n)
    {
        for(int i = (n-2)/2;i>=0;i--)
        {
            maxHeapify(arr,n,i);
        }
    }
    public void sort(int arr[],int n)
    {
        buildHeap(arr,n);
        for(int i=n-1;i>=0;i--)
        {
            swap(arr,i,0);
            maxHeapify(arr,i,0);
        }
    }

    private void swap(int[] arr, int i, int large) {
        int temp = arr[i];
        arr[i] = arr[large];
        arr[large] = temp;
    }

    public static void main(String[] args) {
        HeapSort h = new HeapSort();
        int arr[] = {5,4,1,2,8,3,9,7};
        System.out.println(Arrays.toString(arr));
        h.sort(arr,arr.length);
        System.out.println(Arrays.toString(arr));

    }
}
