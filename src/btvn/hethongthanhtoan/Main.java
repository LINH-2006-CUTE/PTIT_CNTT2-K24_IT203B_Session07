package btvn.hethongthanhtoan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();
        processor.executePayment(new CODPayment(), 500000);
        processor.executePayment(new CreditCardPayment(), 1000000);
        processor.executePayment(new MomoPayment(), 750000);
        PaymentMethod testMethod = new CreditCardPayment();
        processor.executePayment(testMethod, 100000);

        testMethod = new MomoPayment();
        processor.executePayment(testMethod, 100000);
    }
}