import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cau2_2 {
    public static void soXuatHienNhieu() {
        Scanner sc = new Scanner(System.in);

        System.out.print("n = ");
        int n = sc.nextInt();

        if (n == 0 || n < 0) {
            System.out.println("Số lượng phần tử không hợp lệ");
            return;
        }

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        sc.nextLine();

        // Tạo ra biến lưu số xuất hiện nhiều và gán bằng giá trị đầu của mảng
        int number = arr[0];

        // Biến đếm số lần xuất hiện nhiều nhất
        int maxEmpty = 0;


        for (int i = 0; i < n; i++){
            // Biến đếm số lần xuất hiện của một phần tử
            int countEmpty = 0;

            for (int j = 0; j < n ; j++){

                // Kiểm tra nếu phần tử đấu xuất hiện thì tăng biến đếm
                if(arr[i] == arr[j]){
                    countEmpty++;
                }
            }

            // kiểm tra nếu số lần xuất hiện của biến đếm nhiều hơn biến đêm số lần xuất hiện nhiều nhất thì lưu vào
            if(countEmpty > maxEmpty){
                number = arr[i];
                maxEmpty = countEmpty;
            }
        }


        System.out.println("Số xuất hiện niều nhất: " + number);
        System.out.println("Số lần xuất hiện: " + maxEmpty);
    }
}
