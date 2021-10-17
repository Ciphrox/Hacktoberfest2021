import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class OptimizedMoveAllZeroesToEnd {

    static class FastReader{
        BufferedReader br;
        StringTokenizer st;
        public FastReader(){
            br = new BufferedReader(new InputStreamReader(System.in));

        }
        String next(){
            while(st == null || !st.hasMoreElements()){
                try{
                    st = new StringTokenizer(br.readLine());
                }
                catch(IOException e){
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt(){
            return Integer.parseInt(next());
        }
    }

    static int MoveZeroes(int [] arr, int n){
        int count=0;
        for(int i=0 ; i<n ; i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;
                count++;
            }
        }
        return (n-count);
    }
    public static void main(String [] args){
        MoveAllZeroesToEnd.FastReader sc = new MoveAllZeroesToEnd.FastReader();
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        int zeroes = MoveZeroes(arr, n);
        for(int i=0 ; i<n ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println(zeroes);
    }
}
