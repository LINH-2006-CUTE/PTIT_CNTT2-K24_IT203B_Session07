package btvn.hethongthanhtoan;

import java.util.Scanner;
class PaymentProcessor {
    public void executePayment(PaymentMethod method, double amount) {
        method.pay(amount);
    }
}