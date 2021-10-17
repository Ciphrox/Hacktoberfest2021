import java.util.*;
public class IntegerPalindrome {
		
	public static void main (String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		int num= scan.nextInt();
		int palin=num;
		int res=0;
		int b=0;
		while(num!=0) {
			b=num%10;
			res=(res*10)+b;
			num/=10;
		}
		System.out.println(res);
		checkPalindrome(res,palin);
	}
		public static void checkPalindrome(int a,int b) {
			if(a==b) {
				System.out.println("It is a palindrome");
			}
			else {
				System.out.println("Not a palindrome");
				
			}
		
	
		
	}
	

}
