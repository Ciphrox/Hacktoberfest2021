package Practical;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class program6 {
    static int unique(int n){
        Set<Integer> number= new HashSet<Integer>();
        while(n>0){
            number.add(n%10);
            n/=10;
        }
        return number.size();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Unique Number " + unique(a));
    }
}
