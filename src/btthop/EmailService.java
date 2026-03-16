package btthop;

import java.util.Scanner;

public class EmailService implements NotificationService {

    public void send(String message, String recipient) {

        System.out.println("Gửi email tới " + recipient);

    }
}