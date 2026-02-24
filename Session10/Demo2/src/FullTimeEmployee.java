public class FullTimeEmployee extends Employee {
    private double basicSalary;
    private double bonus;

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void input() {
        super.input();
        System.out.println("Nhập vào lương cơ bản: ");
        basicSalary = sc.nextDouble();
        System.out.println("Nhập vào lương thưởng: ");
        bonus = sc.nextDouble();
        setBasicSalary(basicSalary);
        setBonus(bonus);
    }

    @Override
    public void display() {

    }

    @Override
    public double getSalary() {
        return basicSalary + bonus;
    }
}
