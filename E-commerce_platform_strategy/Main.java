public class Main {
    public static void main(String[] args) {
        // Create an order with a weight of 10.5 kg
        Order order = new Order(10.5);
        System.out.println("Order Weight: 10.5 kg\n");

        // 1. Standard Shipping
        order.setShippingStrategy(new StandardShipping());
        System.out.println("Standard Shipping Cost: $" + order.calculateTotalShippingCost());

        // 2. Change strategy at runtime to Express Shipping
        order.setShippingStrategy(new ExpressShipping());
        System.out.println("Express Shipping Cost: $" + order.calculateTotalShippingCost());

        // 3. Change strategy at runtime to International Shipping
        order.setShippingStrategy(new InternationalShipping());
        System.out.println("International Shipping Cost: $" + order.calculateTotalShippingCost());
    }
}
