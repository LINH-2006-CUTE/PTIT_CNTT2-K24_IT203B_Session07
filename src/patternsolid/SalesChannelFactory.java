package patternsolid;

import java.util.Scanner;

public interface SalesChannelFactory {

    DiscountStrategy createDiscount();

    PaymentMethod createPayment();

    NotificationService createNotification();
}