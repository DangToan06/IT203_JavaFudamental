public class Student {
    public static int totalStudent = 0;

    private String studentId;
    private String name;

    public Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;

        totalStudent++;
    }

    public void displayStudent(){
        System.out.println("------------------------------");
        System.out.println("Tên sing viên: " + name);
        System.out.println("Id sinh viên: " + studentId);
        System.out.println("------------------------------");
    }

    public static void displayTotal(){
        System.out.println("Tổng số sinh viên là: " + totalStudent);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
