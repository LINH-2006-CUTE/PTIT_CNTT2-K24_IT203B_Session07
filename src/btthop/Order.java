package btthop;

import java.util.Scanner;

public class Order {

    Customer customer;
    double total;

    public Order(Customer customer, double total) {
        this.customer = customer;
        this.total = total;
    }
}