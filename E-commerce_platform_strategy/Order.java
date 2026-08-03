public class Order {
    private ShippingStrategy shippingStrategy;
    private double weight;

    public Order(double weight) {
        this.weight = weight;
    }

    // Method to change the shipping strategy at runtime
    public void setShippingStrategy(ShippingStrategy shippingStrategy) {
        this.shippingStrategy = shippingStrategy;
    }

    public double calculateTotalShippingCost() {
        if (shippingStrategy == null) {
            throw new IllegalStateException("Shipping strategy not set.");
        }
        return shippingStrategy.calculateShippingCost(weight);
    }
}
