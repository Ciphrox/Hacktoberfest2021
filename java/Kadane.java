import java.util.*; 
  
public class Kadane 
{ 
    public static void main (String[] args) 
    { 
        int [] a = {-2, -3, 4, -1, -2, 1, 5, -3}; 
        System.out.println("Maximum contiguous sum is " + 
                                       maxSubArraySum(a)); 
    } 
  
    static int maxSubArraySum(int arr[]) 
    { 
        int size = arr.length; 
        int max =arr[0],curr = arr[0]; 
  
        for (int i = 1; i < size; i++) 
        { 
        curr=Math.max(curr,curr+arr[i]);
        max=Math.max(max,curr);            
        } 
        return max; 
    } 
} 
