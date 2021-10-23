package ATM;

import java.util.Scanner;


public class checkBalance {
    int current_balance = 10000;
    int option;
    int amount;

    Scanner sc = new Scanner(System.in);

    public void showBalance() {
            System.out.println("Your current account balance is " + current_balance);
    }     
}
