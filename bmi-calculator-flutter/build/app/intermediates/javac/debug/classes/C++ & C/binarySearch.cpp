#include<iostream>
#include<vector>
using namespace std;

bool binarySearch(vector<int> &A, int x){
    int l = 0, r = A.size()-1;
    while(l < r){
        int mid = (l+r)/2;
        if(A[mid] == x)
            return true;
        else if(x < A[mid])
            r = mid-1;
        else
            l = mid+1;
    }
    return (A[l] == x);
}

int main(){
    vector<int> v{1,2,3,4,5,6,7,8,9,10};
    
    if(binarySearch(v, 4))
        cout << "4 is present in vector v.\n";
    else
        cout << "4 is not present in vector v.\n";

    
    if(binarySearch(v, 30))
        cout << "30 is present in vector v.\n";
    else
        cout << "30 is not present in vector v.\n";
}