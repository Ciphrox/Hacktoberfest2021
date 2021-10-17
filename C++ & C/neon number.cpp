#include<stdio.h>
int main()
{
	int a,sq,rem,sum=0;
	printf("enter the number to check if it is neon:\n");
	scanf("%d",&a);
	sq=a*a;
	
	while(sq>0)
	{
	 rem=sq%10;
	 sum+=rem;
	 
	 sq=sq/10;	
	}

	if(sum==a)
	{
		printf("%d is neon",a);
	}
	else{
		printf("%d is not neon",a);
	}
	return 0;
}