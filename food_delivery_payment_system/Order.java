public class Order {
    private PaymentStrategy paymentStrategy;
    private double amount;

    public Order(double amount) {
        this.amount = amount;
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void processPayment() {
        if (paymentStrategy == null) {
            System.out.println("Payment method not selected.");
        } else {
            paymentStrategy.pay(amount);
        }
    }
}
