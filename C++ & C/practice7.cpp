 
#include <iostream>
 using namespace std; 
 // void solve() 
 // { 
 //     int n;
 //     long gm;
 //     cin >> n;
 //     int temp= 0;
 //     for ( gm = 1; gm <= n; gm = gm * 10 + 1) 
 //     {
 //       for (int d = 1; d <= 9; d++) 
 //       { 
 //         if (gm * d <= n)
 //          { 
 //             temp++;
 //              }
 //           }
 //       }
 //    cout << temp << endl;
 //       }
 //int main() 
 //{
 //   int K;
 //   cin >> K;
 //   while (K-- > 0)
 //    {
 //   solve(); 
 //    } 
//return 0; 
//}

int main() 
  { 
      int k;
    cin >> k;
      for(int i=1;i<=k;i++)
      {
      int n,gm,temp=0;
      
      cin >> n;
      
      for ( gm = 1; gm <= n; gm = gm * 10 + 1) 
      {
        for (int d = 1; d <= 9; d++) 
        { 
          if (gm * d <= n)
           { 
              temp++;
               }
            }
        }
     cout << temp << "\n";
        }
  
 
return 0; 
}