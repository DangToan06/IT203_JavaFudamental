import java.util.Scanner;

public class bai05 {
    static void kiemTraTinhHopLeMaSach(){
        Scanner sc = new Scanner(System.in);
        int number;
        do {
            System.out.print("Nhập mã sách (4 chữ số): ");
            number = sc.nextInt();
        }while (number < 1000 && number > 9999);

        int thousands = number / 1000;
        int hundreds = (number % 1000 ) / 100;
        int dozens = (number % 1000 % 100) / 10;
        int units = number % 1000 % 100 % 10;

        int sumOfFirstThreeNumber = thousands + hundreds + dozens;

        boolean check = sumOfFirstThreeNumber % 10 == units;
        System.out.println("Chữ số kiểm tra kỳ vọng: " + sumOfFirstThreeNumber % 10);
        System.out.print("Kết quả kiếm tra mã sách: ");
        System.out.println(  check ? "HỢP LỆ" : "SAI MÃ");
    }
}
