import java.util.*;
public class Armstrongnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = sc.nextInt();
        int temp=n;
        int ans =0;
        while(temp>0){
            int r = temp%10;
            ans += (int)Math.pow(r,3);
            temp=temp/10;
        }
        if(n==ans){
            System.out.println("It is a armstrong number");
        }
        else{
            System.out.println("It is not a armstrong number");
        }
    }
}
