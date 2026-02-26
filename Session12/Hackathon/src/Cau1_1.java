import java.util.Scanner;

public class Cau1_1 {
    public static void demKyTu(){
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine().trim();
        // Đếm số ký tự
        int countChar = 0;
        // Đế chữ số
        int countDigtal = 0;
        // Đếm kỹ tự đặc biệt
        int kyTuDacBiet = 0;

        // Kiểm tra xem chuỗi có rỗng không
        if(text.isEmpty() ){
            System.out.println("Lỗi: Không nhập nội dung");
            return;
        }


        for (int i = 0; i < text.length(); i++){
            char ch = text.charAt(i);


            if(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z'){
                // Nếu là chữ cái thì tăng
                countChar++;
            } else if (ch >= '0' && ch <= '9') {
                // Nếu là chữ số thì tăng
                countDigtal++;
            }else {
                // Còn lại là ký tự đặc biệt
                kyTuDacBiet++;
            }
        }

        System.out.println("Số chữ cái: " + countChar);
        System.out.println("Số chữ số: " + countDigtal);
        System.out.println("Ký tự đặc biệt: " + kyTuDacBiet);

    }
}
