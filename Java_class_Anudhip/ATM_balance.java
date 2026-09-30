package solve_problems.Java_class_Anudhip;
public class ATM_balance {
    private double balance;
    // Constructor
    ATM_balance(double balance) {
        this.balance = balance;
    }
    void checkBalance() {
        System.out.println("Current Balance = " + balance);
    }
    void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount.");
        } 
        else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } 
        else {
            balance = balance - amount;
            System.out.println("Withdrawal successful.");
            System.out.println("Withdrawn Amount = " + amount);
        }
    }
    public static void main(String[] args) {
        ATM_balance atm = new ATM_balance(10000);
        atm.checkBalance();
        atm.withdraw(3000);
        atm.checkBalance();
    }
}   

