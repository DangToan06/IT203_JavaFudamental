
void main() {
    Scanner sc = new Scanner(System.in);
    Employee[] employees = new Employee[100];
    int choice;

    do {
        System.out.println("===== QUẢN LÝ NHÂN SỰ =====\n" +
                "1. Thêm nhân sự\n" +
                "2. Hiển thị danh sách nhân sự\n" +
                "3. Tìm kiếm nhân sự theo mã\n" +
                "4. Xoá thông tin nhân sự theo mã\n" +
                "0. Thoát");
        System.out.println("Nhập lựa chọn của bạn: ");
        choice = sc.nextInt();
        switch (choice){
            case 1:

                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 0:
                System.out.println("Cảm ơn vì sử dụng hệ thống");
                break;
            default:
                System.out.println("Lựa chọn không họp lệ vui lòng nhập lại");
                break;
        }
    }while (choice != 0);
}

public void add(){

}
