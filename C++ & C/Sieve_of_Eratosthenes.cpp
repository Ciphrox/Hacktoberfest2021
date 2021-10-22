/******************************************************************************
Strategy 
Sieve of Eratosthenes.  To find all prime numbers up to a given integer n
 we proceed as follows.
(a) List all integers from 2 to n
(b) The first integer on the list is 2, and it is prime. Mark out all multiples of 
2 that are bigger than 2 because they are composite.We do not have to compute anything,
as we can simply mark out every second number starting at 2.
c) The next integer on the list that is not marked out is 3, and it is prime. Mark out 
all multiples of 3 that are bigger than 3 because they are composite. (Note that some of these, 
such as 6, will already be marked out).We do not have to compute anything, as we can simply mark 
out every third number starting at 3.
(d) The next integer on the list that is not marked out is 5, and it is prime. Mark out all 
multiples of 5 that are bigger than 5 because they are composite.We do not have to compute anything,
as we can simply mark out every fifth number starting at 5.
(e) Continue in this way until there is no next integer on the list that is not marked out.
The integers that are not marked out are all of the primes up to (and possibly including) 
n
.
*******************************************************************************/
#include <iostream>
using namespace std;

void primeSieve(int n){
    int prime[n+1]={0}; //0 means true (let all number is prime in starting)
    for(int i=2;i<=n;i++){
        if(prime[i]==0){
            for(int j=i*i;j<=n;j+=i){
                prime[j]=1;
            }
        }
    }
   for(int i=2;i<=n;i++){
       if(prime[i]==0){
           cout<<i<<" ";
       }
   } cout<<endl;
}
int main()
{
int n;
cin>>n;
primeSieve(n);
    return 0;
}

