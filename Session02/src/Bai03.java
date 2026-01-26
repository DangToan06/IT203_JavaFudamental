import java.util.Scanner;

public class Bai03 {
    static void tinhTongTienPhat(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số lượng sách mượn: ");
        int n = sc.nextInt();
        int count = 0;

        for (int i = 0; i < n; i++){
            System.out.printf("Nhập số ngày trả của cuốn thứ %d: ", i + 1);
            int day = sc.nextInt();
            count += day;
        }

        count = count * 5000;

        System.out.println("===> Tổng tiền phạt: " + count + " VNĐ");
    }
}
