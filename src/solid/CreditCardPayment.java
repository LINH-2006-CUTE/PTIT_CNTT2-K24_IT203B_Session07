package solid;

import java.util.Scanner;

public class CreditCardPayment implements PaymentMethod {

    public void pay(double amount) {
        System.out.println("Thanh toán bằng thẻ: " + amount);
    }
}