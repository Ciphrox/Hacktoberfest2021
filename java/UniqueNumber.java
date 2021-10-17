//A number is said to be unique, if the digits in it are not repeated.

import java.util.Scanner;
public class UniqueNumber
{
    public static void main(String[] args)
    {
        int r1, r2, n, num1, num2, c = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number=");
        n = sc.nextInt();
        num1 = n;
        num2 = n;
        while (num1 > 0)
        {
            r1 = num1 % 10;
            while (num2 > 0)
            {
                r2 = num2 % 10;
                if (r1 == r2)
                {
                    c++;
                }
                num2 = num2 / 10;
            }
            num1 = num1 / 10;
        }
        if (c == 1)
        {
            System.out.println("Unique Number");
        }
        else
        {
            System.out.println("Not Unique Number");
        }
    }
}