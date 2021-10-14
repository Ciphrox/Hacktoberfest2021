public class LinearSearch{    
public static int linearSearch(int[] arr, int key){    
        for(int i=0;i<arr.length;i++){    
            if(arr[i] == key){    
                return i;    
            }    
        }    
        return -1;    
    }    
    public static void main(String a[]){    
        int[] a1= {11,26,35,54,79,98};    
        int key = 35;    
        System.out.println(key+" is found at index: "+linearSearch(a1, key));    
    }    
}
