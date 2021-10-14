import java.util.*;
public class TableOfAnyNumber {
   public static void main(String args[]) {
      System.out.println("Enter an integer variable for print it's Table :: ");
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      for(int i=1; i<= 20; i++) {
         System.out.println(""+num+" X "+i+" = "+(num*i));
      }
   }
}
