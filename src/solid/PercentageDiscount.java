package solid;

import java.util.Scanner;

public class PercentageDiscount implements DiscountStrategy {

    private double percent;

    public PercentageDiscount(double percent) {
        this.percent = percent;
    }

    public double applyDiscount(double amount) {
        return amount - amount * percent / 100;
    }
}