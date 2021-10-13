import java.util.*;
public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to enter: ");
        int n = sc.nextInt();
        int c=0;
        int a =0,b=1;
        System.out.print(a+" , "+b);
        for(int i=2;i<n;i++){
            c=a+b;
            a=b;
            b=c;
            System.out.print(" , " +c);
        }
    }
}
