package apdungSRP;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Product sp1 = new Product("SP01", "Laptop", 15000000);
        Product sp2 = new Product("SP02", "Chuột", 300000);
        System.out.println("Đã thêm sản phẩm SP01, SP02");

        Customer customer = new Customer("Nguyễn Văn A", "a@example.com");
        System.out.println("Đã thêm khách hàng: " + customer.name);
        Order order = new Order("ORD001", customer);
        order.addProduct(sp1);
        order.addProduct(sp2);
        System.out.println("Đơn hàng 01 được tạo");
        OrderCalculator calculator = new OrderCalculator();
        long total = calculator.calculateTotal(order);
        System.out.println("Tổng tiền: " + total);

        OrderRepository repository = new OrderRepository();
        repository.save(order);

        EmailService emailService = new EmailService();
        emailService.sendEmail(order);
    }
}