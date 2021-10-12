import java.util.Scanner;
public class PowerCalculator{

	public static void main (String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter base number :");
		int x = scan.nextInt();
		System.out.print("Enter power index :");
		int y = scan.nextInt();
		int pow_calc = power(x,y);
		System.out.printf("Power of number %d raised to %d is : %d\n", x, y, pow_calc);
		
	}
	public static int power(int base, int index){
		if(index!=0){
			return base * power(base,(index-1));
		}
		else{
			return 1;
		}
		
	}
}