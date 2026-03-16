package patternsolid;

import java.util.Scanner;

public class POSFactory implements SalesChannelFactory {

    public DiscountStrategy createDiscount() {
        return new POSDiscount();
    }

    public PaymentMethod createPayment() {
        return new CODPayment();
    }

    public NotificationService createNotification() {
        return new PrintNotification();
    }
}