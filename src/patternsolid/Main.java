package patternsolid;

import java.util.Scanner;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Chọn :");
        System.out.println("1. Website");
        System.out.println("2. Mobile App");
        System.out.println("3. POS");

        int choice = sc.nextInt();

        SalesChannelFactory factory = null;

        if (choice == 1) {
            factory = new WebsiteFactory();
        } else if (choice == 2) {
            factory = new MobileFactory();
        } else {
            factory = new POSFactory();
        }

        DiscountStrategy discount = factory.createDiscount();
        PaymentMethod payment = factory.createPayment();
        NotificationService notification = factory.createNotification();

        double price = 1000000;

        double finalPrice = discount.apply(price);

        payment.pay(finalPrice);

        notification.send();

        System.out.println("Thanh toán xong: " + finalPrice);
    }
}