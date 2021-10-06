//C program to print and count prime numbers between 1 to 100
#include <stdio.h>

int main()
{   int count,num,t=0;
    printf("Prime numbers\n");
    for(int num=1; num<=100; num++){
        count=0;
        
        for(int i=2; i<num; i++){
            if(num%i==0){
                count++;
                break;  
            }
        }
        if(count==0 && num!=1){
            printf("%d ",num);
            t++;
        }
        
    } 
    printf("\nTotal prime numbers between 1 to 100 = %d",t);
    
   return 0;
}