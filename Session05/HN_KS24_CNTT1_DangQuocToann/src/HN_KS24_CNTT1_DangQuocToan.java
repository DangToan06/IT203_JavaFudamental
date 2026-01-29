import java.util.Scanner;
import java.util.regex.Pattern;

public class HN_KS24_CNTT1_DangQuocToan {
    public static Scanner sc = new Scanner(System.in);
    public static String[] studentIds = new String[100];
    public static int currentSize = 0;

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n**************** MENU ****************");
            System.out.println("1. Hiển thị danh sách MSSV");
            System.out.println("2. Thêm mới MSSV");
            System.out.println("3. Cập nhật MSSV");
            System.out.println("4. Xóa MSSV");
            System.out.println("5. Tìm kiếm MSSV");
            System.out.println("6. Thoát");
            System.out.print("Mời bạn chọn chức năng (1-6): ");

            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                choice = 0;
            }

            switch (choice) {
                case 1:
                    displayStudents();
                    break;
                case 2:
                    addStudent();
                    break;
                case 3:
                    updateStudent();
                    break;
                case 4:
                    deleteStudent();
                    break;
                case 5:
                    searchStudent();
                    break;
                case 6:
                    System.out.println("Thoát chương trình. Hẹn gặp lại!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ! Vui lòng chọn lại.");
            }
        } while (choice != 6);
    }

    public static void displayStudents() {
        if (currentSize == 0) {
            System.out.println("=> Danh sách hiện tại đang trống!");
            return;
        }
        System.out.println("--- DANH SÁCH MSSV ---");
        for (int i = 0; i < currentSize; i++) {
            System.out.printf("STT %d: %s\n", (i + 1), studentIds[i]);
        }
    }

    public static void addStudent() {
        if (currentSize >= 100) {
            System.out.println("=> Mảng đã đầy, không thể thêm mới!");
            return;
        }

        String newMssv;
        while (true) {
            System.out.print("Nhập MSSV mới (Ví dụ B2101234): ");
            newMssv = sc.nextLine().trim();
            if (isValidMSSV(newMssv)) {
                boolean exists = false;
                for (int i = 0; i < currentSize; i++) {
                    if (studentIds[i].equals(newMssv)) {
                        exists = true;
                        break;
                    }
                }
                if(exists){
                    System.out.println("MSSV đã tồn tại! Vui lòng nhập mã khác.");
                } else {
                    break;
                }
            } else {
                System.out.println("Định dạng sai! Bắt đầu bằng 'B' và theo sau là 7 chữ số.");
            }
        }

        studentIds[currentSize] = newMssv;
        currentSize++;
        System.out.println("=> Thêm mới thành công!");
    }

    public static void updateStudent() {
        System.out.print("Nhập vị trí (index) muốn sửa (0 - " + (currentSize - 1) + "): ");
        int index;
        try {
            index = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Vị trí phải là số nguyên!");
            return;
        }

        if (index >= 0 && index < currentSize) {
            System.out.println("Giá trị cũ: " + studentIds[index]);
            String newMssv;
            while (true) {
                System.out.print("Nhập MSSV mới: ");
                newMssv = sc.nextLine().trim();
                if (isValidMSSV(newMssv)) {
                    break;
                } else {
                    System.out.println("Định dạng sai! Vui lòng nhập lại.");
                }
            }
            studentIds[index] = newMssv;
            System.out.println("=> Cập nhật thành công!");
        } else {
            System.out.println("Vị trí không tồn tại!");
        }
    }

    public static void deleteStudent() {
        System.out.print("Nhập MSSV cần xóa: ");
        String deleteMssv = sc.nextLine().trim();

        int indexDel = -1;
        for (int i = 0; i < currentSize; i++) {
            if (studentIds[i].equals(deleteMssv)) {
                indexDel = i;
                break;
            }
        }

        if (indexDel != -1) {
            for (int i = indexDel; i < currentSize - 1; i++) {
                studentIds[i] = studentIds[i + 1];
            }
            studentIds[currentSize - 1] = null;
            currentSize--;
            System.out.println("=> Đã xóa sinh viên có mã: " + deleteMssv);
        } else {
            System.out.println("Không tìm thấy MSSV này trong danh sách!");
        }
    }

    public static void searchStudent() {
        System.out.print("Nhập chuỗi cần tìm: ");
        String keyword = sc.nextLine().trim().toLowerCase();

        System.out.println("--- KẾT QUẢ TÌM KIẾM ---");
        boolean found = false;
        for (int i = 0; i < currentSize; i++) {
            if (studentIds[i].toLowerCase().contains(keyword)) {
                System.out.printf("STT %d: %s\n", (i + 1), studentIds[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy kết quả nào!");
        }
    }

    public static boolean isValidMSSV(String mssv) {
        String regex = "^B\\d{7}$";
        return Pattern.matches(regex, mssv);
    }
}