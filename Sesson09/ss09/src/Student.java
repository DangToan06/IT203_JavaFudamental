public class Student extends Person {
    private String StudentId;
    private double scoreAvg;

    public Student(String fullName, int age, String studentId, double scoreAvg) {
        super(fullName, age);
        StudentId = studentId;
        this.scoreAvg = scoreAvg;
    }

    @Override
    public void displayInfo(){
        System.out.println("-------------------");
        super.displayInfo();
        System.out.println("Mã sinh viên: " + StudentId);
        System.out.println("Điểm trung bình: " + scoreAvg);
        System.out.println("-------------------");
    }
}
