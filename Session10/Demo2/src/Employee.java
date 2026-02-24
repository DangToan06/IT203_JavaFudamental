import java.util.Scanner;

public abstract class Employee implements IEmployee {
    protected String id;
    protected String name;
    protected int age;

    Scanner sc = new Scanner(System.in);

    public Employee() {
        this.id = "SV0000";
        this.name = "Not name";
        this.age = 0;
    }

    public Employee(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void input(){
        System.out.println("Nhập vào id: ");
        id = sc.nextLine();
        System.out.println("Nhập vào tên: ");
        name = sc.nextLine();
        System.out.println("Nhập vào tuổi: ");
        age = sc.nextInt();

        setId(id);
        setName(name);
        setAge(age);
    }

    public abstract double getSalary();
}
