import java.util.Scanner;

public class Bai04 {
    static void kiemSoatDauVao(){
        Scanner sc = new Scanner(System.in);

        int id;

        do{
            System.out.print("Nhập vào mã ID sách mới (phải > 0): ");
            id = sc.nextInt();
            if(id <= 0){
                System.out.println("Lỗi: ID phải là số dương. Mời nhập lại!");
            }
        }while (id <= 0);

        System.out.println("Xác nhận mã sách " + id + " đã được ghi nhận.");
    }
}
