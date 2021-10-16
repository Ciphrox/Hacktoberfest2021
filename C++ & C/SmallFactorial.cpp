#include <iostream>
using namespace std;
int main()
{
    // your code goes here
    int t;
    cin>>t;
    for(int i=0;i<t;i++){
        int num;
        cin>>num;
        int size=1000,nfact[size],carry=0,j=size-1;
        nfact[size-1]=1;
        while(num>1)
        {
            int x;
            for(int k=size-1;k>=j;k--)
            {
                x=nfact[k]*num + carry;
                nfact[k]=x%10;
                carry=x/10;
            }
            while(carry>0)
            {
                nfact[--j]=carry%10;
                carry/=10;
            }
            num--;
        }
            for(int k=j;k<size;k++){
                cout<<nfact[k];
            }
            cout<<endl;
    }
    return 0;
}
