package apdungOCP;

class OrderCalculator {
    private DiscountStrategy strategy;

    public OrderCalculator(DiscountStrategy strategy) {
        this.strategy = strategy;
    }

    public double calculate(double totalAmount) {
        return strategy.applyDiscount(totalAmount);
    }
}