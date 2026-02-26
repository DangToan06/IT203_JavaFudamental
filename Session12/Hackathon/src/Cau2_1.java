import java.util.Scanner;

public class Cau2_1 {
    public static void mangDoiXung(){
        Scanner sc = new Scanner(System.in);

        System.out.print("n = ");
        int n = sc.nextInt();

        if(n == 0 || n < 0){
            System.out.println("Số lượng phần tử không hợp lệ");
            return;
        }

        int[] arr = new int[n];

        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        sc.nextLine();

        for (int i = 0; i < n; i++){
            // so sáng đầu với cuối mảng nếu khác thì out ra luôn
            if(arr[i] != arr[n - i - 1]){
                System.out.println("Mảng không đối xứng");
                return;
            }
        }

        // Nếu chạy hết vòng lặp thì là mảng đối xứng
        System.out.println("Mảng đối xứng");
    }
}
