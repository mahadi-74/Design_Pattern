public class InternationalShipping implements ShippingStrategy {
    @Override
    public double calculateShippingCost(double weight) {
        // Example: $15.0 per kg plus $50 international fee
        return (weight * 15.0) + 50.0;
    }
}
