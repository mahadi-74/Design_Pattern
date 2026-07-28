public class Main {
    public static void main(String[] args) {
        // Create an order of amount $150.50
        Order order = new Order(150.50);

        System.out.println("--- Scenario 1: Paying with Credit Card ---");
        order.setPaymentStrategy(new CreditCardPayment());
        order.processPayment();

        System.out.println("\n--- Scenario 2: Changing payment strategy at runtime (bKash) ---");
        // Demonstrate changing payment strategy at runtime
        order.setPaymentStrategy(new BkashPayment());
        order.processPayment();

        System.out.println("\n--- Scenario 3: Using Cash on Delivery ---");
        order.setPaymentStrategy(new CashOnDelivery());
        order.processPayment();

        System.out.println("\n--- Scenario 4: Using newly added Bank Transfer ---");
        // Demonstrate the new payment method added without modifying existing classes
        order.setPaymentStrategy(new BankTransferPayment());
        order.processPayment();
    }
}
