package apdungSRP;

import java.util.Scanner;

import java.util.ArrayList;
import java.util.List;

class Order {
    String orderId;
    Customer customer;
    List<Product> products = new ArrayList<>();

    public Order(String orderId, Customer customer) {
        this.orderId = orderId;
        this.customer = customer;
    }

    public void addProduct(Product p) {
        products.add(p);
    }
}