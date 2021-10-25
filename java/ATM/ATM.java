package ATM;

public class ATM {
    public static int opt;
    public static void main(String[] args) {
        getDetails details = new getDetails();
        details.getAcc_number();

        selsctOption option = new selsctOption();
        
        option.getOption(1);
        Withdrawal withdraw = new Withdrawal();
        withdraw.withdraw();  
    
        option.getOption(2);
        Deposit deposit = new Deposit();
        deposit.deposit();  
    
        option.getOption(3);
        checkBalance balance = new checkBalance();
        balance.showBalance();  
        
    } 
}
