package patternsolid;

import java.util.Scanner;

public class POSDiscount implements DiscountStrategy {

    public double apply(double amount) {
        System.out.println("giảm giá 5% cho POS");
        return amount * 0.95;
    }
}