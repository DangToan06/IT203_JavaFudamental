import java.util.Scanner;

public class bai04 {
    static void chuyendoingoaite(){
        Scanner sc = new Scanner(System.in);
        double giaSach ;
        float tyGia = 25450;
        System.out.println("Nhập giá sách (USD - kiểu double): ");
        giaSach = sc.nextDouble();


        double total = giaSach * tyGia;

        System.out.println("Giá trị chính xác (số thực): " + total);

        System.out.println("Giá làm tròn đến thanh toán (long): " + (long)total);
    }
}
