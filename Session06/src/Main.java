void main() {

//    Bai01
//    Student sv1 = new Student("S001", "Đặng Quốc Toàn", 2006, 3.8);
//    Student sv2 = new Student("S002", "Trần Trí Dương", 2006, 3.5);
//
//    System.out.println("DANH SÁCH SINH VIÊN:");
//    sv1.displayInfo();
//    sv2.displayInfo();


//    Bai02
//    Account ac1 = new Account("tyler", "tyler@123", "tyler@gmail.com");
//
//    System.out.println("Trước khi thay đổi: ");
//    ac1.displayAccount();
//
//    ac1.changePassword("hehehehehe");
//
//    System.out.println("Sau khi thay đổi: ");
//    ac1.displayAccount();


//    Bai03
//    Product p1 = new Product("P001", "Laptop Dell", 15000000);
//    p1.displayProduct();
//
//    System.out.println("Cập nhật giá lớn hơn 0");
//    p1.setPrice(16000000);
//    p1.displayProduct();
//    System.out.println("Cập nhật giá nhỏ hơn 0");
//    p1.setPrice(-500);
//    p1.displayProduct();

//    Bai04
//    Employee emp1 = new Employee();
//
//    Employee emp2 = new Employee("NV01", "Nguyen Van A");
//
//    Employee emp3 = new Employee("NV02", "Tran Thi B", 1500.0);
//
//    System.out.println("DANH SÁCH NHÂN VIÊN:");
//    emp1.displayInfo();
//    emp2.displayInfo();
//    emp3.displayInfo();

//    Bai05
//    Book b1 = new Book("Lập trình Java", "James Gosling", 150000);
//
//    System.out.println("\nTHÔNG TIN CHI TIẾT:");
//    b1.displayBook();

//    Bai06

    User user1 = new User(1, "nguyenvana", "abc123", "vana@gmail.com");

    // Sai định dạng email
    User user2 = new User(2, "tran_thi_b", "456789", "email_sai_dinh_dang");

    // Mật khẩu rỗng
    User user3 = new User(3, "le_van_c", "", "levanc@gmail.com");

    System.out.println("\nDANH SÁCH NGƯỜI DÙNG SAU KHI KIỂM TRA:");
    user1.displayUser();
    user2.displayUser();
    user3.displayUser();
}
