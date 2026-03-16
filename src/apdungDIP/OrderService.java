package apdungDIP;

import java.util.Scanner;

class OrderService {
    private final OrderRepository repository;
    private final NotificationService notification;
    public OrderService(OrderRepository repository, NotificationService notification) {
        this.repository = repository;
        this.notification = notification;
    }

    public void process(Order order) {
        repository.save(order);
        notification.send("Đơn hàng " + order.orderId + " đã được tạo", "Khách hàng");
    }
}