package apdungOCP;

import java.util.Scanner;

class HolidayDiscount implements DiscountStrategy {
    @Override
    public double applyDiscount(double totalAmount) {
        return totalAmount * 0.85;
    }
}