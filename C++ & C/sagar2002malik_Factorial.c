# include<stdio.h>

int main()
{
    int num;
    float fact=1;
    printf("Enter a number: ");
    scanf("%d",&num);
    for(int i=1;i<=num;i++)
    {
        fact*=i;
    }
    printf("Factorial: %f",fact);
    return 0;
}
