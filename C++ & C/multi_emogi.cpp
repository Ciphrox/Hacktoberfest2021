#include <iostream>
using namespace std;
int main() 
{
    char u,x, s,h,i,l,p=0 ,a=0 ;
    printf("input a no for mix emogi : ");
    scanf("%d", &i);
    for(s=1;s<=i;s++)
    { p++;
        for(l=1;l<=i-p;l++)
        {
            printf(" ");
        } a++;
        for(h=1;h<=a;h++)
        {
                 printf("%c",h);    
        }
        for(h=s-1;h>=1;h--)
        { 
            printf("%c",h);
        } 
    printf("\n");
        
    }         
    return 0;
    
}
