package ATM;

import java.util.Scanner;

public class selsctOption {

    Scanner sc = new Scanner(System.in);

    public void getOption(int option) {
        System.out.println("What do you want to do? Enter 1: Withdraw......Enter 2: Deposit......Enter 3: Check account balance.");
        option = sc.nextInt();
    }
}
