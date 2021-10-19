import java.util.Scanner;
public class numberofdigits
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = sc.nextInt();
        int c=0;
        int n1=n;
        while(n1!=0)
        {
            n1 = n1/10;
            c++;
        }
        System.out.println("Number of digits in the entered integer are : "+c);
    }
}