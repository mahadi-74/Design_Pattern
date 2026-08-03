public class ExpressShipping implements ShippingStrategy {
    @Override
    public double calculateShippingCost(double weight) {
        // Ex: $5.0 per kg plus $10 for express
        return (weight * 5.0) + 10.0;
    }
}
