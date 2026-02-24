public class Manager extends Employee implements IBonusCalculator{


    public Manager(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public double getBonus() {
        return 10;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + getBonus();
    }
}
