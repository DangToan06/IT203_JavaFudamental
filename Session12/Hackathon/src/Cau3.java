import java.util.Scanner;

public class Cau3 {
    public static void timCapk(){
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

        System.out.print("k = ");
        int k = sc.nextInt();
        for (int i = 0; i < n ; i++){
            for (int j = i; j < n; j++){
                // kiểm tra các cặp xem có tổng bằng k hay không
                if(arr[i] + arr[j] == k){
                    System.out.println("Cặp tìm được: " + arr[i] + " và " + arr[j]);
                    return;
                }
            }
        }

        System.out.println("Không tồn tại cặp nào");
    }
}
