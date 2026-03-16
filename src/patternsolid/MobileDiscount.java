package patternsolid;

import java.util.Scanner;
public class MobileDiscount implements DiscountStrategy {

    public double apply(double amount) {
        System.out.println("giảm giá 15% cho Mobile App");
        return amount * 0.85;
    }
}