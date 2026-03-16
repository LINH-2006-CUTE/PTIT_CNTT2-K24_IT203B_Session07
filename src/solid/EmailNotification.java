package solid;

import java.util.Scanner;

public class EmailNotification implements NotificationService {

    public void send(String message) {
        System.out.println("Gửi Email: " + message);
    }
}