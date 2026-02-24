void main() {
    OfficeStaff os = new OfficeStaff("Duong", 9000);
    Manager m = new Manager("Quang", 9000);

    System.out.println("Ten: " + os.name + " luong: " + os.calculateSalary());
    System.out.println("Ten: " + m.name + " luong: " + m.calculateSalary());

}
