void main() {
//    Bai01
//    Student st01 = new Student("Bơ văn sừn", 28, "SV001", 3.2);
//    st01.displayInfo();

//    Bai02
//    Dog meo = new Dog();
//    Cat cho = new Cat();
//    meo.sound();
//    cho.sound();

//    Bai03
//    Manager mng = new Manager("Nguyễn Văn A", 15000000, "Phòng Kinh Doanh");
//    mng.displayInfo();

//    Bai04
//    Animal animal = new Dog();
//    animal.sound();
//    // animal.playFetch(); // Trình biên dịch báo : "Cannot find symbol"
//    if (animal instanceof Dog) {
//        Dog myDog = (Dog) animal;
//        myDog.playFetch();
//    }

//    Bai05
//    List<Employee> employeeList = new ArrayList<>();
//
//    employeeList.add(new OfficeEmployee("Nguyễn Văn An", 15000000));
//    employeeList.add(new ProductionEmployee("Trần Thị Bình", 200, 50000));
//    employeeList.add(new ProductionEmployee("Lê Văn Cường", 150, 60000));
//
//    double totalSalary = 0;
//
//    System.out.println("DANH SÁCH LƯƠNG NHÂN VIÊN:");
//    System.out.println("---------------------------");
//
//    for (Employee emp : employeeList) {
//        double salary = emp.calculateSalary();
//        totalSalary += salary;
//
//        System.out.printf("Tên: %-15s | Lương: %,.0f VNĐ%n", emp.getName(), salary);
//    }
//
//    System.out.println("---------------------------");
//    System.out.printf("TỔNG LƯƠNG CÔNG TY: %,.0f VNĐ%n", totalSalary);

//    Bai06
    List<Shape> shapes = new ArrayList<>();

    shapes.add(new Circle(5));
    shapes.add(new Rectangle(3, 4));
    shapes.add(new Rectangle(6));

    double totalArea = 0;
    System.out.println("Kết quả tính toán hình học:");
    System.out.println("---------------------------");

    for (int i = 0; i < shapes.size(); i++) {
        Shape s = shapes.get(i);
        double area = s.calculateArea();
        totalArea += area;

        String name = (s instanceof Circle) ? "Hình tròn (r=5)" : ((Rectangle) s).getType();

        System.out.printf("%d. %-25s - Diện tích: %,.2f%n", (i + 1), name, area);
    }

    System.out.println("---------------------------");
    System.out.printf("=> Tổng diện tích các hình: %,.2f%n", totalArea);
}

