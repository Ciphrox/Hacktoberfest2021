package ATM;

import java.util.Scanner;

public class Deposit {
    int current_balance = 10000;
    int option;
    int amount;

    Scanner sc = new Scanner(System.in);

    public void deposit() {
            System.out.println("How much do you want to deposit?");
            amount = sc.nextInt();

            current_balance = current_balance + amount;

            System.out.println("You successfully deposit " + amount + " . Your current account balance is " + current_balance);
        
    }     
}
