import java.util.Scanner;

public class bai01 {
    static void nhapThongTinSach(){

        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập mã sách: ");
        String bookID = sc.nextLine();
        System.out.println("Nhập tên sách: ");
        String bookName = sc.nextLine();
        System.out.println("Nhập năm xuất bản: ");
        int publishYear = sc.nextInt();
        System.out.println("Nhập giá bìa: ");
        double price = sc.nextDouble();
        System.out.println("Sách còn trong kho (true/false): ");
        boolean isAvailable = sc.hasNextBoolean();

        int lifeBook = 2026 - publishYear;

        System.out.println("---Phiếu thông tin sách---");
        System.out.println("Tên sách: "+ bookName);
        System.out.println("Mã số: " + bookID + " | Tuổi thọ: " + lifeBook + " năm");
        System.out.println("Giá bán: "+ price + " VNĐ");
        System.out.println("Tình trang sách: " + isAvailable);
    }
}
