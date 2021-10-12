#include<iostream>

using namespace std;

int main()
{
    int n;
    cin >> n;

    int** arr = new int*[n];
    for(int i = 0; i < n; i++)
    arr[i] = new int[n];

    for(int i = 0; i < n; i++)
    {
        for(int j = 0; j < n; j++)
        {
            cin >> arr[i][j];
        }
    }
    int x;
    cin >> x;
    int i = 0;
    int j = n-1;
    while (i<n && j>=0)
    {
        if (arr[i][j] == x)
        {
            cout << i << endl;
            cout << j << endl;
            return 0;
        }
        else if(arr[i][j] < x)
        {
            i++;
        }
        else{
            j--;
        }
    }
    cout << "Not Found" << endl;
}
