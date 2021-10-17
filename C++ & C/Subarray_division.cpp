#include <iostream>

using namespace std;

int main()
{
    int n;
    cin >> n;
    int arr[n];
    for(int i=0; i<n ;i++)
    {
      cin >>  arr[i];
    }
    int m,d;
    cin >> m >> d;
    int flag=0;
    int sum=0;
    for(int i=0; i<n ;i++)
    {
        for(int j=i;j<d+i;j++)
        {
            sum = arr[j] + sum;
        }
        if(sum == m)
        {
            flag++;
        }
        sum=0;
    }
    cout << flag;
}
