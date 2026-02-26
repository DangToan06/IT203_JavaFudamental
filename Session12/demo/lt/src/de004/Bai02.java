package de004;

import java.util.Scanner;

public class Bai02 {
    public static void chuanHoaTen(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập họ và tên:");
        String input = sc.nextLine();

        // 1. Tách các từ và bỏ khoảng trắng thừa
        String[] words = input.trim().split("\\s+");

        if (words.length == 0) {
            System.out.println("Dữ liệu không hợp lệ");
            return;
        }

        // 2. Chuẩn hóa tên (Title Case)
        StringBuilder normalizedName = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            String word = words[i].toLowerCase();
            // Viết hoa chữ đầu + phần còn lại
            String capitalized = word.substring(0, 1).toUpperCase() + word.substring(1);
            normalizedName.append(capitalized);

            if (i < words.length - 1) {
                normalizedName.append(" ");
            }
        }

        // 3. Tạo Username (Tên + Chữ cái đầu của Họ và Đệm)
        // Ví dụ: ["Nguyen", "Duc", "Anh"] -> Anh + N + D
        String firstName = words[words.length - 1]; // Từ cuối cùng
        String username = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();

        for (int i = 0; i < words.length - 1; i++) {
            username += words[i].substring(0, 1).toUpperCase();
        }

        // In kết quả
        System.out.println("Tên chuẩn: " + normalizedName.toString());
        System.out.println("Username: " + username);
    }
}
