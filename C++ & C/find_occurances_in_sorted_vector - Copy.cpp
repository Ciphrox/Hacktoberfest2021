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

// return the first occurance of a number x
// if x is not present in a vector, return -1
int find_first_occurance(vector<int> &A, int x){
    int l = 0, r = A.size()-1;
    while(l < r){
        int mid = (l+r)/2;
        if(x <= A[mid])
            r = mid;
        else
            l = mid+1;
    }
    return (A[l] == x) ? l : -1;
}

int find_occurance(vector<int> &v, int x){
    int first = find_first_occurance(v,x);
    int last = find_last_occurance(v, x);
    return first == -1 ? 0 : last-first+1;
}

int main(){
    vector<int> v{1,1,1,2,2,2,3,3,4,4,4,4,4,5,5,5,10,10};
    
    if(find_occurance(v,2) != 0)
        cout << "2 is occuring " << find_occurance(v,2) << " times in vector\n";
    else
        cout << "2 is not present in vector v.\n";
    
    if(find_occurance(v,30) != 0)
        cout << "30 is occuring " << find_occurance(v,30) << " times in vector\n";
    else
        cout << "30 is not present in vector v.\n";
}