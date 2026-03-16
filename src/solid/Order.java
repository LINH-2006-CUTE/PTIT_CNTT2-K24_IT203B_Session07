package solid;

import java.util.*;

public class Order {
    String id;
    Customer customer;
    List<OrderItem> items = new ArrayList<>();

    public Order(String id, Customer customer) {
        this.id = id;
        this.customer = customer;
    }

    public void addItem(OrderItem item) {
        items.add(item);
    }

    public double getTotal() {
        double sum = 0;
        for (OrderItem i : items) {
            sum += i.getTotal();
        }
        return sum;
    }
}