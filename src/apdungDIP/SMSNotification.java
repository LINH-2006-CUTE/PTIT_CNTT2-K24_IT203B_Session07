package apdungDIP;

import java.util.Scanner;

class SMSNotification implements NotificationService {
    public void send(String message, String recipient) {
        System.out.println("Gửi SMS: " + message);
    }
}