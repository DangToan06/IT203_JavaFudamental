public class Student {
    String studentId;
    String name;
    int birthYear;
    double gpa;

    public Student(String studentId, String name, int birthYear, double gpa){
        this.studentId = studentId;
        this.name = name;
        this.birthYear = birthYear;
        this.gpa = gpa;
    }

    public void displayInfo() {
        System.out.println("---------------------------");
        System.out.println("Mã SV: " + studentId);
        System.out.println("Họ tên: " + name);
        System.out.println("Năm sinh: " + birthYear);
        System.out.println("Điểm TB: " + gpa);
    }
}
