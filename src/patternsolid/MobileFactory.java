package patternsolid;

import java.util.Scanner;
public class MobileFactory implements SalesChannelFactory {

    public DiscountStrategy createDiscount() {
        return new MobileDiscount();
    }

    public PaymentMethod createPayment() {
        return new MoMoPayment();
    }

    public NotificationService createNotification() {
        return new PushNotification();
    }
}