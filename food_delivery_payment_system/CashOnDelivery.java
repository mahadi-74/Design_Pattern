public class CashOnDelivery implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Recording the payment to be collected when the order is delivered...");
        System.out.println("Payment of $" + amount + " will be collected as Cash on Delivery.");
    }
}
