public class AccountBalanceAfterRoundedPurchase {
    public static void main(String[] args) {
        int purchaseAmount = 23; 
        int finalBalance = accountBalanceAfterRoundedPurchase(purchaseAmount);
        System.out.println("Final account balance: " + finalBalance);
    }

    public static int accountBalanceAfterRoundedPurchase(int purchaseAmount) {
        int roundedPurchase = ((purchaseAmount + 5) / 10) * 10;
        return 100 - roundedPurchase;
    }
}
