import java.util.*;
import java.lang.*;

public class RoughQuadraticRoots {

    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        double root1=0, root2=0, a=0, b=0, c=0, D=0, r1=0, i1=0, r2=0, i2=0;
        System.out.println("Enter values in the format ax2 + bx + c = 0");
        System.out.print("Enter a : ");
        a = scanner.nextDouble();
        System.out.print("Enter b : ");
        b = scanner.nextDouble();
        System.out.print("Enter c : ");
        c = scanner.nextDouble();

        D = (Math.pow(b, 2) - (4*a*c));


        if (D == 0)
            System.out.println("The roots are real and equal.");
        else if(D > 0)
            System.out.println("The roots are real and distinct.");

        if(D>=0)
        {
            root1 = ((-b + Math.sqrt(D))/(2*a));
            root2 = ((-b - Math.sqrt(D))/(2*a));
            System.out.println("Roots are : " + root1 + " and " + root2);
        }
        else
        {
            System.out.println("The roots are imaginary.");
            r1 = (-b/(2*a));
            i1 = (Math.sqrt(-D)/(2*a));
            r2 = (-b/(2*a));
            i2 = (Math.sqrt(-D)/(2*a));
            System.out.println("Roots are : " + r1 + " + i(" + i1 + ")" + " and " + r2 + " - i(" + i2 + ")");

        }
        scanner.close();
    }
}
