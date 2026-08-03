public class CreditCardPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Validating card information before charging the customer...");
        System.out.println("Paid $" + amount + " using Credit Card.");
    }
}
