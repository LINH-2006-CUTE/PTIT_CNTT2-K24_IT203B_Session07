package solid;

public class Main {

    public static void main(String[] args) {

        Product p1 = new Product("SP01","Laptop",15000000);

        Customer c1 = new Customer("Nguyễn Văn ABCDDD","a@gmail.com");

        Order order = new Order("01", c1);

        order.addItem(new OrderItem(p1,1));

        DiscountStrategy discount = new PercentageDiscount(10);

        PaymentMethod payment = new CODPayment();

        OrderRepository repo = new FileOrderRepository();

        NotificationService notify = new EmailNotification();

        OrderService service = new OrderService(repo, notify);

        service.checkout(order, discount, payment);
    }
}