import java.util.Scanner;

public class AverageofNnumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter n numbers to get Average ");
		int n = input.nextInt();
		int count = 0;
		int sum = 0;
		int rem = 1;
		if (n==0) {
			System.out.println("Please Enter value greater than 0");
			System.exit(0);
			
		}
		while(n>0){
			rem = n%10;
		    sum = sum+rem;
		    count+=1;
		    n=n/10;
		}
		System.out.println("Average is "+sum/count);
	}
}
