#include<iostream>
using namespace std;
int main()
{
	int a[50],n,i,flag=0;
	cout<<"\n Enter the size of array : ";
	cin>>n;
	cout<<"\n Enter the array elements \n\n";
	for(i=0;i<n;i++)
	{
		cout<<" Enter the "<<i<<" element : ";
		cin>>a[i];
	}
	cout<<"\n The elements are : ";
	for(i=0;i<n;i++)
	{
		cout<<"\t"<<a[i];
	}
	cout<<endl;
	int large=a[0],second=0;
	
	 for(i=1;i<n;i++)
	 {
	 	if(large<a[i])
	 	{
	 		large=a[i];
		 }
		 
	 }
	 for(i=0;i<n;i++)
	 {
	 	if(second<a[i] && large>a[i])
	 	{
	 		second=a[i];
		 }
	 }
	cout<<"\n\n The second largest element of array is : "<<second;
	
}
