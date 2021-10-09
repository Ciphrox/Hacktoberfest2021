#include<iostream>
using namespace std;
int main()
{
    int year;
    cout<<"enter a year : ";
    cin>>year;
    if(year%4==0){
        if(year%100==0){
            if(year%400==0){
                cout<<year<<"\tis a leap year";
            }
                else
                    cout<<year<<"\tis not a leap year";

            }
            else
                cout<<year<<"\tis a leap year";
        }
        else
            cout<<year<<"\tis not a leap year";
    //}
    return 0;
}
