package patternsolid;

import java.util.Scanner;

public class WebsiteDiscount implements DiscountStrategy {

    public double apply(double amount) {
        System.out.println("giảm giá 10% cho Website");
        return amount * 0.9;
    }
}