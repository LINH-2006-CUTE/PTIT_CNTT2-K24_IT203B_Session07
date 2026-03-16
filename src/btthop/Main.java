package btthop;

import java.util.Scanner;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== HỆ THỐNG ĐƠN HÀNG =====");

        System.out.print("Nhập tên khách hàng: ");
        String name = sc.nextLine();

        System.out.print("Nhập email: ");
        String email = sc.nextLine();

        System.out.print("Nhập tổng tiền đơn hàng: ");
        double total = sc.nextDouble();

        Customer customer = new Customer(name, email);
        Order order = new Order(customer, total);

        System.out.println("Chọn loại giảm giá");
        System.out.println("1. Giảm 10%");
        System.out.println("2. Giảm 50000");
        System.out.println("3. Không giảm");

        int discountChoice = sc.nextInt();

        DiscountStrategy discount;

        if (discountChoice == 1)
            discount = new PercentageDiscount();
        else if (discountChoice == 2)
            discount = new FixedDiscount();
        else
            discount = new NoDiscount();


        System.out.println("Chọn:");
        System.out.println("1. COD");
        System.out.println("2. Credit Card");

        int payChoice = sc.nextInt();

        PaymentMethod payment;

        if (payChoice == 1)
            payment = new CODPayment();
        else
            payment = new CreditCardPayment();


        NotificationService notification = new EmailService();
        OrderRepository repository = new FileOrderRepository();

        OrderService service = new OrderService(
                discount,
                payment,
                notification,
                repository
        );

        service.processOrder(order);
    }
}