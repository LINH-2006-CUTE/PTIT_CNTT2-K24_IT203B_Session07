package apdungOCP;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double total = 5000000;
        OrderCalculator calc1 = new OrderCalculator(new PercentageDiscount(10));
        OrderCalculator calc2 = new OrderCalculator(new FixedDiscount(50000));
        System.out.println("Số tiền sau giảm (50k): " + (long) calc2.calculate(total));
        OrderCalculator calc3 = new OrderCalculator(new NoDiscount());
        System.out.println("Số tiền sau giảm (No): " + (long) calc3.calculate(total));
        OrderCalculator calc4 = new OrderCalculator(new HolidayDiscount());
        System.out.println("Số tiền sau giảm (Holiday 15%): " + (long) calc4.calculate(total));
    }
}