package btthop;

import java.util.Scanner;
public class PercentageDiscount implements DiscountStrategy {

    public double applyDiscount(double amount) {

        if(amount > 1000000)
            return amount * 0.9;

        return amount;
    }
}