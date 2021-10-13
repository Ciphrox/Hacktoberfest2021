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
           // x++;
           // for(u=1;u<=i;u++)
            // {
                 printf("%c",h);
                 //printf("%d",u);
            //}
        }
        for(h=s-1;h>=1;h--)
        { 
            printf("%c",h);
        }
    
        //for(u=1,u<=h,u++ ) 
       // { 
           // printf("%d",u);
       // }
    printf("\n");
        
    } 
    //for(u=1;u<=i;u++)
   // {
        //for(x=1;x<=u;x++)
       // {
           // printf("%d",x);

      //  }
      //  printf("\n");
    
            
    return 0;
    
}