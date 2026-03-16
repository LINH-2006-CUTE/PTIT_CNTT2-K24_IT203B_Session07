package solid;

import java.util.Scanner;

public class FileOrderRepository implements OrderRepository {

    public void save(Order order) {
        System.out.println("Lưu đơn" + order.id + " vào file");
    }
}