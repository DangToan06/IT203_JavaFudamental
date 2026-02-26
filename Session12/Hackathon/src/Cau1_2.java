import java.util.Scanner;

public class Cau1_2 {
    public static void chuoiDoiXung(){
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine().trim();

        // Kiểm tra xem mảng có tồn tại hay không
        if(s.isEmpty() ){
            System.out.println("Lỗi: Không nhập nội dung");
            return;
        }

        int length = s.length();
        for (int i = 0; i < length/2; i++){

            // lấy ký tự đầu tiên của mảng
            char start = s.charAt(i);
            // lấy ký tự cuối mảng
            char end = s.charAt(length - i - 1);

            // kiểm tra nếu không phải chối đối xứng thì thoát ra
            if(start != end){
                System.out.println("Chuoi khong doi xung");
                return;
            }
        }

        // Nếu chạy hết vòng lặp thì là chuối đối xứng
        System.out.println("Chuoi doi xung");
    }
}
