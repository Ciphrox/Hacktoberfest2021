#include <iostream>
using namespace std;

int main()
{
    int space, rows;

    printf ("Enter number of rows: ");
    scanf("%d", &rows);

    for(int i = 1, k = 0; i <= rows; ++i, k = 0)
    {
        for(space = 1; space <= rows-i; ++space)
        {
            printf(" ");
        }

        while(k != 2*i-1)
        {
            printf("%c", 1) ;
            ++k;
        }
        printf("\n");
    }    
    return 0;
}