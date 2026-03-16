package apdungSRP;

import java.util.Scanner;

class EmailService {
    public void sendEmail(Order order) {
        System.out.println("Đã gửi email đến " + order.customer.email
        );
        System.out.println("Đơn hàng " + order.orderId + " đã được tạo thàn");
    }
}