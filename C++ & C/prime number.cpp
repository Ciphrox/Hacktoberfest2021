#include <iostream>
using namespace std;

int main() {
	// your code goes here
	int t;
	cin >> t;
	while(t--){
	   long long int a;
	   int count =0;
	   cin >> a;
	     for(int i=1;i<=a;i++){
	           if(a%i==0 && a/i != 0){
	               count ++;
	           }
	       }
	   if(count==2){
	       cout << "yes" << endl;
	   }
	   else cout << "no" << endl;
	
	}   	    
	return 0;
}
