/******************************************************************************
 Case 1: The elements that contribute to the maximum sum are arranged such that
 no wrapping(no need of going last to first) is there.
 Example: {-1,4,-6,7,5,4}
 (code will be like kadane's algorithm)
 
Case 2: The elements which contribute to the maximum sum are arranged such that 
wrapping(need of going last to first) is there. 
Examples: {10, -12, 11}

code approch=
reverse the sign of all elements.
max subarray sum =total sum of array-sum of non-contributing elements.

*******************************************************************************/
#include<iostream>
#include<climits>
using namespace std;

int kadane(int a[],int n){
    int currentSum=0;
    int maxSum =INT_MIN;

for(int i=0;i<n;i++){
    currentSum+=a[i];
    if(currentSum<0){
        currentSum=0;
    }
    maxSum=max(maxSum,currentSum);
}
return maxSum;
}
int main()
{
int n;
cin>>n;
int a[n];
for(int i=0;i<n;i++){
    cin>>a[i];
}
int wrapsum;
int nonwrapsum;

nonwrapsum=kadane(a,n);
int totalsum=0;
for(int i=0;i<n;i++){
    totalsum+=a[i];
    a[i]=-a[i];
}
wrapsum=totalsum+kadane(a,n);
cout<<max(wrapsum,nonwrapsum)<<endl;
    return 0;
}

