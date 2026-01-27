import java.util.Scanner;

public class Bai01 {
    public static Scanner sc = new Scanner(System.in);

    public static int[] addBookToLibraries(int n){

        int[] a = new  int[n];

        System.out.println("Nhập vào mã số cho " + n + " cuốn sách:");

        for (int i = 0; i < n; i++){
            System.out.print("Sách thứ " + (i + 1) + " :");
            a[i] = sc.nextInt();
        }

        return a;
    }

    public static void displayLibraries(int[] arr){

        System.out.println("--- KẾT QUẢ ---");
        System.out.print("Danh sách mã sách: ");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
            if (i != arr.length - 1){
                System.out.print(" , ");
            }
        }

    }
}
