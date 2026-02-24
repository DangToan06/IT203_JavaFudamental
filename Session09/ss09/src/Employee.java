public class Employee {
    protected String name;
    protected double salary;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double calculateSalary(){
        return 0.0;
    }
}
