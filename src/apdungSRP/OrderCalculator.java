package apdungSRP;

import java.util.Scanner;

class OrderCalculator {
    public long calculateTotal(Order order) {
        long total = 0;
        for (Product p : order.products) {
            total += p.price;
        }
        return total;
    }
}