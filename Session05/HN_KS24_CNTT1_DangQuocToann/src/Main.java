import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int choice;
        String[] students = new String[10];
        do{
            Menu.showMenu();
            System.out.print("Nhập lựa chọn: ");
            choice = sc.nextInt();



            switch (choice){
                case 1:
                    ShowListStu.displayStudent(students);
                    break;
                case 2:
                    System.out.println("Nhập vị trí muốn thêm: ");
                    int pos = sc.nextInt();
                    while (pos < 0 || pos > 100){
                        System.out.println("Vị trí sai vui lòng nhập lại: ");
                        pos = sc.nextInt();
                    }

                    String regex = "^B\\d{7}$";

                    Pattern pattern = Pattern.compile(regex);


                    System.out.println("Nhập mã sinh viên: ");
                    String maSv = sc.nextLine();

                    Matcher matcher = pattern.matcher(maSv);
                    while (!matcher.matches()){
                        System.out.println("Mã sv không họp lệ nhập lại: ");
                        maSv = sc.nextLine();
                    }

                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    System.out.println("Cảm ơn vì sử dụng hệ thống");
                    break;
                default:
                    System.out.println("Lỗi vui lòng nhập lại!!!");
                    break;
            }

        }while (choice != 6);
    }

    bool isValidMSSV(string mssv) {

        return regex_match(mssv, regex("^B\\d{7}$"));
    }
}
