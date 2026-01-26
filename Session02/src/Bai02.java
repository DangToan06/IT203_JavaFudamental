import java.util.Scanner;

public class Bai02 {
    static void phanLoaiViTriSach (){
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập mã khu vực (A, B, C, D): ");
        char ma = sc.next().charAt(0);

        switch (ma){
            case 'A':
                System.out.println("Vị trí: Tầng 1 - Sách Văn Học");
                break;
            case 'B':
                System.out.println("Vị trí: Tầng 2: Sách Khoa học");
                break;
            case 'C':
                System.out.println("Vị trí: Tầng 3: Sách Ngoại ngữ");
                break;
            case 'D':
                System.out.println("Vị trí: Tầng 4: Sách Tin học");
                break;
        }
    }
}
