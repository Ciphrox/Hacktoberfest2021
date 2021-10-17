import java.io.*;
import java.util.*;
class Weird
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("Enter Number");
        n= in.nextInt();
        if(isAbundant(n)==true && isSemiperfect(n)==false)
        {
            System.out.println("It is a Weird Number : "+n);
        }
        else
        {
            System.out.println("It is not a Weird Number : "+n);
        }
    }// end of main method
    public static boolean isAbundant(int x)
    {
        int sum=0,i;
        for(i=1;i<x;i++)
        {
            if(x%i==0)
            {
                sum=sum+i;
            }
        }
        if(sum>x)
        {
            return true;
        }
        else
        {
            return false;
        }
    }// end of isAbundant()
    public static boolean isSemiperfect(int x)
    {
        int c=0,i,j,k,z,a=0,s=0,d=0,temp;
        for(i=1;i<x;i++)
        {
            if(x%i==0)
            {
                c++;//calculating no. of factors
            }
        }
        z=(int) Math.pow(2,c); //calculating no. of subsets required
        int ar[]=new int[z];
        for(i=1;i<x;i++)
        {
            if(x%i==0)
            {
                ar[a]=i; //storing factors in Array
                a++;
            }
        }
        for(i=0;i<c;i++) //Loops for calculating sum of factors
        {
            for(j=0;j<c;j++)
            {
                for(k=j;k<c;k++)
                {
                    s=s+ar[k];
                    if(s==x)
                    {
                        d=1;
                        break;
                    }
                }
                if(d==1)
                {
                    break;
                }
                temp=ar[j];
                ar[j]=ar[j+1];
                ar[j+1]=temp;
                s=0;
            }
            if(d==1)
            {
                break;
            }
        }
        if(d==1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }// end of isSemiperfect()
}//end of class
