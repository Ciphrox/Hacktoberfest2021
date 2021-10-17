// Friend Class
#include<iostream>
using namespace std;
class xyz;
class abc
{
	int a;
	public:
	void get()
	{
		cout<<"enter a : ";
		cin>>a;
	}
	void display()
	{
		cout<<a<<endl;
	}
	friend class xyz;
}a1;
class xyz
{
	int b;
	public:
	void in()
	{
		cout<<"enter b : ";
		cin>>b;
		}	
		void show(abc obj1)
		
{
	cout<<"sum is : "<<b+obj1.a;
}
}b1;

int main()
{
		a1.get();
		b1.in();
	    a1.display();
	    b1.show(a1);
}
