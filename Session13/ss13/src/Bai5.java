import java.util.ArrayList;
import java.util.Scanner;

public class Bai5 {
    static ArrayList<Patient> patients = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    private static void menu(){
        System.out.println("||=====================MENU======================||");
        System.out.println("||            1. Tiếp nhận bệnh nhân             ||");
        System.out.println("||            2. Cập nhật chuẩn đoán             ||");
        System.out.println("||            3. Xuất viện                       ||");
        System.out.println("||            4. Sắp xếp danh sách bệnh nhân     ||");
        System.out.println("||            5. Hiển thị danh sách bệnh nhân    ||");
        System.out.println("||            6. Thoát                           ||");
        System.out.println("||===============================================||");
        System.out.print("Chọn chức năng: ");
    }

    public static void b5(){

        int choice;

        do{
            menu();
            choice = sc.nextInt();

            switch (choice){
                case 1:
                    addPatient();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    System.out.println("Thoát thành công");
                    break;
                default:
                    System.out.println("Lựa chọn không họp lệ vui lòng nhập lại");
                    break;
            }
        }while (choice != 6);
    }

    public static void addPatient(){
        System.out.println("Nhập ID bệnh nhân: ");
        String id = sc.nextLine();
        System.out.println("Nhập tên bệnh nhân: ");
        String name = sc.nextLine();
        System.out.println("Nhập tuổi: ");
        int age = sc.nextInt();
        System.out.println("Nhập chuẩn đoán: ");
        String diagnosis = sc.nextLine();

        patients.add(new Patient(id, name, age, diagnosis));
        System.out.println("Thêm bệnh nhân thành công!!!");
    }

    public static void updateDiagnosis(){
        System.out.println("Nhập ID bệnh nhân để cập nhật chuẩn đoán: ");
        String idS
    }
}
