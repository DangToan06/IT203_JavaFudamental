import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Bai2 {
    public static void dsThuoc(){
        Scanner sc = new Scanner(System.in);
        Map<String, String> listMedicine = new HashMap<>();

        listMedicine.put("T01","Paracetamol");
        listMedicine.put("T02","Ibuprofen");
        listMedicine.put("T03","Panadol");
        listMedicine.put("T04","Aspirin");
        listMedicine.put("T05","Cam");

        System.out.println("Nhập vào mã thuốc: ");
        String idMedicine = sc.nextLine();
        if (listMedicine.containsKey(idMedicine)){
            System.out.println("Tên thuốc: " + listMedicine.get(idMedicine));
        }else {
            System.out.println("Thốc không tồn tại");
        }
    }
}
