 #include <stdio.h>

 int main()
 {
     int r,s,c;
         for (r=1;r<=5;r++)
        {
            for (s=4;s>=r;s--)
            {
                printf(" ");
            }
            for (c=1;c<=r;c++)
            { 
                printf("a");
            } 
        printf("\n");
        }
    return 0;
}