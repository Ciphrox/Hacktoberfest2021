package ATM;

import java.util.Scanner;

public class Withdrawal {
    int current_balance = 10000;
    int amount;

    Scanner sc = new Scanner(System.in);

    public void withdraw() {
        System.out.println("How much do you want to withdraw?");
        amount = sc.nextInt();

        current_balance = current_balance - amount;

        System.out.println("You successfully withdraw " + amount + " . Your current account balance is " + current_balance);
        
    }
}
