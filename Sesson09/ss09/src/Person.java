public class Person {
    private String fullName;
    private int age;

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void displayInfo(){
        System.out.println("Họ và tên: " + fullName);
        System.out.println("Tuổi: " + age);
    }
}
