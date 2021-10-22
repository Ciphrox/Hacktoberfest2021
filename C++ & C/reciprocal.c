#include<stdio.h>
# define sign(a) (((a<0?-1:1)))

float  reciprocal(float x);
int main(void){
    float x;
    printf("Enter the value to find reciprocal for: ");
    scanf("%f",&x);
    printf("The reciprocal of the given value is:%f",reciprocal(x));
    return 0;


}
float reciprocal(float x){
    float x1=2,x0;
    float e=0.00001;
    int temp=0;  
    x *=sign(x);

    if (x==0) return 0;

    if(x>1){
        while(x>1){
            temp++;
            x/=10;
        }
    }else if (x<1){
        while(x<1){
        temp--;
        x*=10;
        }
    }

    do{
        x0=x1;
        x1= x0*(2-x0*x);     

    }while ((sign((x1-x0)/x0))*((x1-x0)/x0)>e); 
    if (temp>0)
        for (int i=temp; i>0;i--) x1/=10;    
    else if (temp<0)
        for (int i=temp;i<0;i++) x1*=10;
    return x1;

    return 0;
}



