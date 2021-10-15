import java.io.*;
import java.util.*;
class Ugly
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int n,k=0,p;
        System.out.println("Enter Number");
        n= in.nextInt();
        p=n;
        while(n!=1)
        {
            if(n%2==0)
            {
                n=n/2;
            }
            else if(n%3==0)
            {
                n=n/3;
            }
            else if(n%5==0)
            {
                n=n/5;
            }
            else
            {
                System.out.println("It is not a Ugly Number "+p);
                k=1;
                break;
            }
        }
        if(k==0)
        {
            System.out.println("It is a Ugly Number : "+p);
        }
    }//end of main method
}//end of class