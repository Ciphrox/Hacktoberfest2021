package ATM;

import java.util.Scanner;

public class getDetails {
    public int account_number;

    Scanner sc = new Scanner(System.in);

    public void getAcc_number() {
        System.out.println("Enter your account number: ");
        account_number = sc.nextInt();
    }
}
