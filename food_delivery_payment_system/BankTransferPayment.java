public class BankTransferPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Verifying bank account details and transferring funds...");
        System.out.println("Paid $" + amount + " using Bank Transfer.");
    }
}
