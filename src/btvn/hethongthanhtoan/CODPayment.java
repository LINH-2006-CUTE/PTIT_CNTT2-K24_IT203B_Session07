package btvn.hethongthanhtoan;

import java.util.Scanner;

class CODPayment implements PaymentMethod, CODPayable {
    @Override
    public void pay(double amount) { processCOD(amount); }

    @Override
    public void processCOD(double amount) {
        System.out.println("thanh toán : " + (long)amount + " - Thành công");
    }
}