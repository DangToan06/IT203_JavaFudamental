import java.util.Scanner;

public class Bai06 {
    static  void phanTichXuHuongMuonSach(){
        Scanner sc = new Scanner(System.in);

        float avg = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < 7; i ++){
            int num;
            if(i == 6){
                System.out.print("Nhập lượt mượn ngày chủ nhật: ");
                num = sc.nextInt();
            } else {
                System.out.print("Nhập lượt mượn ngày thứ " + (i+2) + " : ");
                num = sc.nextInt();
            }
            if (num > max) max = num;
            if (num < min) min = num;
            avg += num;
        }

        System.out.println("---Kết quả thống kê---");
        System.out.println("Lượt mượn cao nhất: " + max);
        System.out.println("Lượt mượn thấp nhất: " + min);
        System.out.println("Trung binh lượt mượn trên ngày: " + avg/7);
    }
}
