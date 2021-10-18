#include <bits/stdc++.h>

using namespace std;

int dp[1000][1000];

int lcs(string &s1, string &s2, int n, int m)
{
    if(n==0 or m==0)return 0;
    
    if(dp[n][m]!=-1)return dp[n][m];
    
    if(s1[n-1]==s2[m-1])
    {
        return 1 + lcs(s1,s2,n-1,m-1);
    }
    
    int op1 = lcs(s1,s2,n-1,m);
    int op2 = lcs(s1,s2,n,m-1);
    
    return dp[n][m] = max(op1,op2);
    
}

int main()
{
    string s1,s2;
    cout<<"Enter the string1"<<endl;
    cin>>s1;
    
    cout<<"Enter the string2"<<endl;
    cin>>s2;
    
    int l1 = s1.length();
    int l2 = s2.length();
    
    memset(dp,-1,sizeof(dp));
    cout<<"The lcs is = "<<(lcs(s1,s2,l1,l2))<<endl;
    
    

   return 0;
}