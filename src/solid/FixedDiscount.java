package solid;

import java.util.Scanner;

public class FixedDiscount implements DiscountStrategy {

    private double value;

    public FixedDiscount(double value) {
        this.value = value;
    }

    public double applyDiscount(double amount) {
        return amount - value;
    }
}