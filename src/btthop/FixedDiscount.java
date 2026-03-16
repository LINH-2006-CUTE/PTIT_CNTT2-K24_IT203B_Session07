package btthop;

import java.util.Scanner;

public class FixedDiscount implements DiscountStrategy {

    public double applyDiscount(double amount) {

        return amount - 50000;

    }
}