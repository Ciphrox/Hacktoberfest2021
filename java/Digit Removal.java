// //You are given an integer N and a digit D. Find the minimum non-negetive integer you should add to N such that the final value of N does not contain the digit D.
// Input Format:The first line contains T denoting the number of test cases. Then the test cases follow.
// Each test case contains two integers N and D on a single line denoting the original number and the digit you need to avoid.
// Output Format:For each test case, output on a single line the minimum non-negetive integer you should add to N.



import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    static int ismin(int n,int d){
        int newn=n;
        int rem;
        int count=0;
        int c=0;
        while(newn>0){
            rem=newn%10;
            newn=newn/10;
            c++;
            if(rem==d){
                newn=newn*(int)Math.pow(10,c)+(rem+1)*(int)Math.pow(10,c-1);
                count=newn-n;
                c=0;
            }
        }
        return count;

    }
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc= new Scanner(System.in);
        int test=sc.nextInt();
        for(int i=0;i<test;i++){
            int n=sc.nextInt();
            int d=sc.nextInt();
            System.out.println(ismin(n,d));
        }
	}
}
