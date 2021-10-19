public class ReverceArray {
    public static void main(String[] args) {
        int[] arr = {10,12,15,45,13,44};
        
        System.out.println("");
        System.out.println("Reverce Array:");
        for(int i= arr.length-1;i>=0;i--){
            System.out.print(arr[i] +" ");
        }
    }
}