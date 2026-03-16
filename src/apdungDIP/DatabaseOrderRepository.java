package apdungDIP;

import java.util.Scanner;

class DatabaseOrderRepository implements OrderRepository {
    public void save(Order order) {
        System.out.println("Lưu đơn hàng vào database: " + order.orderId);
    }
}