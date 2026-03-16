package btvn.hethongthanhtoan;

import java.util.Scanner;

class CreditCardPayment implements PaymentMethod, CardPayable {
    @Override
    public void pay(double amount) { processCreditCard(amount); }

    @Override
    public void processCreditCard(double amount) {
        System.out.println("thanh toán : " + (long)amount);
    }
}