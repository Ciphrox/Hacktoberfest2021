#include<iostream>
#include<vector>
using namespace std;

// return the last occurance of a number x
// if x is not present in a vector, return -1
int find_last_occurance(vector<int> &A, int x){
    int l = 0, r = A.size()-1;
    while(l < r){
        int mid = (l+r+1)/2;
        if(x >= A[mid])
            l = mid;
        else
            r = mid-1;
    }
    return (A[l] == x) ? l : -1;
}

int main(){
    vector<int> v{1,1,1,2,2,2,3,3,4,4,4,4,4,5,5,5,10,10};
    
    int idx;
    if((idx = find_last_occurance(v, 2)) != -1)
        cout << "Last occurance of 2 in vector v is at index " << idx << endl;
    else
        cout << "2 is not present in vector v.\n";
    
    if((idx = find_last_occurance(v, 30)) != -1)
        cout << "Last occurance of 30 in vector v is at index " << idx << endl;
    else
        cout << "30 is not present in vector v.\n";
}