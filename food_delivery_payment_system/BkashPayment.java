public class BkashPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Verifying the mobile account and OTP...");
        System.out.println("Paid $" + amount + " using bKash.");
    }
}
