public class Employee {
    private String employeeId;
    private String name;
    private double salary;

    public Employee() {
        this.employeeId = "";
        this.name = "";
        this.salary = 0.0;
    }

    public Employee(String employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = 500.0;
    }

    public Employee(String employeeId, String name, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
    }

    public void displayInfo() {
        System.out.println("ID: " + employeeId + " | Tên: " + name + " | Lương: " + salary);
    }
}
