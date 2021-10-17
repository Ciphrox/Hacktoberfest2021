#include<iostream>
using namespace std;

int nthprime(int n){
	int t=0;
	for (int i=1;i>=1;i++)
	{
		int a=0;
		for (int j=2;j<=i/2;j++)
		{
			if (i%j==0)
			{
				a=1;
				break;
			}
		}
		if (a==0 && i!=1)
		{
			t++;
			if (t==n)
			{
				return i;
			}
		}
	}
}

int main()
{
	int n;
	cin>>n;
	cout<<nthprime(n);
}
