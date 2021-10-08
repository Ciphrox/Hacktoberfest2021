// This program print table of any entered number.


import java.util.*;

class tableofnum{
    public static void main(String arr[]){
        Scanner scan=new Scanner(System.in);
        int i=scan.nextInt();

        for(int j=1;j<=10;j++){
            System.out.println(i*j);
        }
    }
}
