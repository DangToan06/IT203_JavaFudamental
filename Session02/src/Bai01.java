import java.util.Scanner;

public class Bai01 {
    static void kiemTraDieuKienMuonSach() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập vào số tuổi của bạn: ");
        int age = sc.nextInt();
        while (age < 0){
            System.out.print("Không được nhập giá trị âm: ");
            age = sc.nextInt();
        }

        System.out.print("Nhập vào số sách đang mượn: ");
        int book = sc.nextInt();
        while (age < 0){
            System.out.print("Không được nhập giá trị âm: ");
            book = sc.nextInt();
        }

        if(age >= 18 && book < 3){
            System.out.println("Bạn đủ ĐIỀU KIỆN mượn sách");
        } else if (age < 18 && book < 3) {
            System.out.println("Bạn phải từ 18 tuổi trở lên");
        }else if(age >= 8 && book >= 3) {
            System.out.println("Bạn đã mượn vượt quá số sách quy định");
        }else {
            System.out.println("Bạn không thỏa mã bất kỳ điều kiện mượn sách nào");
        }
    }
}
