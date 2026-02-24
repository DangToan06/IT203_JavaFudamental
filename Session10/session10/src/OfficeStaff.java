public class OfficeStaff extends Employee{

    public OfficeStaff(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    double calculateSalary() {
        return baseSalary;
    }
}
