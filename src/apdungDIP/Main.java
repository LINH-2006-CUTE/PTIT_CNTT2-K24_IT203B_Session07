package apdungDIP;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        OrderService service1 = new OrderService(new FileOrderRepository(), new EmailService());
        service1.process(new Order("01"));

        OrderService service2 = new OrderService(new DatabaseOrderRepository(), new SMSNotification());
        service2.process(new Order("02"));
    }
}