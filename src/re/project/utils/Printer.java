package re.project.utils;

import java.util.Scanner;

public class Printer {
    //các phương thức chung cho các lớp sử dụng

    // in thông tin bình thường
    public static void prinInfo(String content) {
        System.out.println(content);
    }

    // cảnh báo: màu vàng
    public static void prinWarrnning(String content) {
        System.out.println(content);
    }

    // in lỗi: màu đỏ
    public static void prinError(String content) {
        System.out.println(content);
    }
}