package btthop;

import java.util.Scanner;

public class OrderService {

    private DiscountStrategy discount;
    private PaymentMethod payment;
    private NotificationService notification;
    private OrderRepository repository;

    public OrderService(DiscountStrategy discount,
                        PaymentMethod payment,
                        NotificationService notification,
                        OrderRepository repository) {

        this.discount = discount;
        this.payment = payment;
        this.notification = notification;
        this.repository = repository;
    }

    public void processOrder(Order order) {

        double finalPrice = discount.applyDiscount(order.total);

        System.out.println("Tổng tiền: " + order.total);
        System.out.println("Sau giảm giá: " + finalPrice);

        payment.pay(finalPrice);

        repository.save(order);

        notification.send("Đơn hàng được xác nhận qua email", order.customer.email);

    }
}