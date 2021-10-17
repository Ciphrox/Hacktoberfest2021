using namespace std; 
#include<iostream>

#include<string.h> 


int main()

{

char one[]="one";
 char two[]="two";

if (one==two) 
{

cout<<"Equal";
 } 
 if(strcmp(one, two)==0)
 {
      cout<<"Equal"; 
 }



else

{

cout<<"NotEqual";
}

return 0;
}