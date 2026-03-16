package apdungDIP;

import java.util.Scanner;

class EmailService implements NotificationService {
    public void send(String message, String recipient) {
        System.out.println("Gửi email: " + message);
    }
}