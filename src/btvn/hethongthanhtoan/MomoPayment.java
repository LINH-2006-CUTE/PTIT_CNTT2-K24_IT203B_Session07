package btvn.hethongthanhtoan;

import java.util.Scanner;

class MomoPayment implements PaymentMethod, EWalletPayable {
    @Override
    public void pay(double amount) { processMomo(amount); }

    @Override
    public void processMomo(double amount) {
        System.out.println("thanh toán Momo: " + (long)amount );
    }
}