package apdungDIP;

import java.util.Scanner;

class FileOrderRepository implements OrderRepository {
    public void save(Order order) {
        System.out.println("đơn hàng : " + order.orderId);
    }
}