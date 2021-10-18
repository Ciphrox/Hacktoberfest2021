package java;

import java.io.*;
public class Cipher
{
    public static void main(String[] args)throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str,st="";
        char c,d,t;
        int a,b,x,i=0,n;
        System.out.println("Enter a String for which you want Cipher Text");
        str=br.readLine();
        x=str.length();
        do
        {
            c=str.charAt(i);
            a=(int)c;
            if(a>=65 && a<=90)
            {
                if(a>77 && a<=90)
                {
                    n=a+13;
                    t=(char)((n%90)+64);
                    st=st+t;
                }
                else
                {
                    t=(char)(a+13);
                    st=st+t;
                }
            }
            else
            {
                if(c==32)
                {
                    st=st+" ";
                }
                else
                {
                    if(a>=97 && a<=122)
                    {
                        if(a>109 && a<=122)
                        {
                            n=(a+13);
                            t=(char)((n%122)+96);
                            st=st+t;
                        }
                        else
                        {
                            t=(char)(a+13);
                            st=st+t;
                        }
                    }
                }
            }
            i=i+1;
            x=x-1;
        }while(x!=0);
        System.out.println("Your Cipher Text is : ");
        System.out.println(st);
    }
}
                   