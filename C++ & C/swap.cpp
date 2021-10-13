#include<iostream>
using namespace std;
int main()
{
int a,b;
cout<<"enter no A :";
cin>>a;
cout<<"enter no B :";
cin>>b;
a=a+b;
b=a-b;
a=a-b;
cout<<"A :"<<a<<"\nB :"<<b;
return 0;
}