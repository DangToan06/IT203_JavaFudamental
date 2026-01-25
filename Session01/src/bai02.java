import java.util.Scanner;

public class bai02 {
    static void heThongTinhPhatTraMuon(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập số ngày chậm chễ: ");
        int n = sc.nextInt();
        System.out.println("Nhập số lượng sách mượn: ");
        int m = sc.nextInt();

        double total = m * n * 5000;

        System.out.println("Tiền phạt gốc: " + total + " VNĐ");

        if (n > 7 && m >= 3){
            total =total + total * 0.2;
        }

        System.out.println("Tiền phạt sau khi điều chỉnh: " + total + " VNĐ");

        if(total > 50000){
            System.out.println("Yêu cầu khóa thẻ: " + true);
        }else {
            System.out.println("Yêu cầu khóa thẻ: " + false);
        }

    }
}
