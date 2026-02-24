public class Manager extends Employee implements BonusCalculator{
    public Manager(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public double getBonus() {
        return 5000;
    }

    @Override
    double calculateSalary() {
        return baseSalary + baseSalary;
    }
}
