public class StandardShipping implements ShippingStrategy {
    @Override
    public double calculateShippingCost(double weight) {
        // Example: $2.5 per kg
        return weight * 2.5;
    }
}
