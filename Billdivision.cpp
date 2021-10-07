#include <iostream>

using namespace std;

int main()
{
    int n,k;
    cin >> n >> k;
    int bill[n];
    for(int i=0; i<n; i++)
    {
        cin >> bill[i];
    }
    int b;
    cin >> b;
    int sum=0;
    for(int i=0; i< n; i++)
    {
        if(i != k)
           sum = sum + bill[i];
        else 
        {
           continue;
        }
    }
    sum = sum/2;
    if(sum == b)
    {
        cout << "Bon Appetit";
    }
    else
    {
        sum = b - sum;
        cout << sum;
    }
}
