/******************************************************************************
Largest word in a sentence;
Approach
1. Iterate over the sentence and keep variables currLen and maxLen which
store the current length of the present word being iterated and the overall
maximum length word’s length.
2. Whenever we encounter a space during iteration, we will maximize our
maxLen variable.

maxLen = max(maxLen, currLen)


*******************************************************************************/
#include<iostream>
using namespace std;
int main(){
    int n;
    cin>>n;
    cin.ignore(); //used to ignore or clear one or more characters from the input buffer.
    char arr[n+1];
    
    cin.getline(arr,n);
    cin.ignore();
    
    int i=0;
    int currLen=0 ,maxlen=0;
    int st=0, maxst=0;
    while(1){
        if(arr[i]==' '||arr[i]=='\0')
        {
            if(currLen>maxlen)
            {
                maxlen=currLen;
                maxst=st;
            }
            currLen=0;
            st=i+1;
        }
        else
        currLen++;
        if(arr[i]=='\0')
        break;
        
        i++;
    }
    cout<<maxlen<<endl;
    for(int i=0;i<maxlen;i++)
    cout<<arr[i+maxst];
    
    return 0;
}



