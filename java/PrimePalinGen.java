import java.util.*;
class PrimePalinGen
{	
	static int start,end;
	public PrimePalinGen(int a, int b)
	{
		start=a;
		end=b;
	}
	public static int isPrime(int n)
	{
		int x=n; int c=0;
		for(int i=2;i<x;i++)
			if(x%i==0) c++;
			if(c==1) return 1;
			else return 0;
	}
	public static int isPalin(int n)
	{
		int x=n; int d,y=0;
		while(x!=0)
		{
			d=x%10;
			y=(d*10)+y;
			x=x/10;
		}
		if(x==y) return 1;
		else return 0;
	}
	public static void generate()
	{
		for(int i=start+1;i<end;i++)
		{
			int x=isPrime(i);
			int y=isPalin(i);
			if(x==1 && y==1) System.out.println(i);
		}
	}
	public static void main(String args[])
	{
		PrimePalinGen obj=new PrimePalinGen(0,100);
		obj.generate();
	}
}
	
