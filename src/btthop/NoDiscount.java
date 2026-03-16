package btthop;

import java.util.Scanner;

public class NoDiscount implements DiscountStrategy {

    public double applyDiscount(double amount) {

        return amount;

    }
}