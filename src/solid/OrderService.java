package solid;

import java.util.Scanner;

public class OrderService {

    private OrderRepository repo;
    private NotificationService notification;

    public OrderService(OrderRepository repo, NotificationService notification) {
        this.repo = repo;
        this.notification = notification;
    }

    public void checkout(Order order,
                         DiscountStrategy discount,
                         PaymentMethod payment) {

        double total = order.getTotal();

        total = discount.applyDiscount(total);

        payment.pay(total);

        repo.save(order);

        notification.send("Đã đặt hàng");
    }
}