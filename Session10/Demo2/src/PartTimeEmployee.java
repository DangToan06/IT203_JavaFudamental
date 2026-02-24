public class PartTimeEmployee extends Employee {
    private int workingHours;
    private double hourlyRate;

    public int getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public  void input(){
        super.input();
        System.out.println("Nhập số số giờ: ");
        workingHours = sc.nextInt();
        System.out.println("Nhập đánh giá: ");
        hourlyRate = sc.nextInt();

        setWorkingHours(workingHours);
        setHourlyRate(hourlyRate);
    }

    @Override
    public void display() {

    }

    @Override
    public double getSalary() {
        return workingHours * hourlyRate;
    }
}
