import java.util.Arrays;

public class SelectionSort {
    public static void sort(int[] arr)
    {
        int n = arr.length;
        for(int i=0;i<n-1;i++)
        {
            int min = i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]<arr[min])
                    min = j;
            }
            if(min!=i)
                swap(arr,min,i);
        }
    }
    private static void swap(int[] a, int j, int i) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void main(String[] args) {
        int a[] = {2,5,4,8,9,7,6,1};
        System.out.println(Arrays.toString(a));
        sort(a);
        System.out.println(Arrays.toString(a));
    }
}
