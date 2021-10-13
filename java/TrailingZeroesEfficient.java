import java.util.Scanner;

public class TrailingZeroesEfficient {

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        int count=0;
        for(int i=5 ; i<=n ; i = i*5)
        {
            count = count + n/i;
        }

        System.out.println("Trailing zeroes : " + count);

        sc.close();
    }
}
