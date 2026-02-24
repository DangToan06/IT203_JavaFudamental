public class Manager extends Employee{
    private String room;

    public Manager(String name, double salary, String room) {
        super(name);
        this.room = room;
    }

    public void displayInfo(){
        System.out.println("--------------------");
        System.out.println("Tên: " + name);
        System.out.println("Lương cơ bản: " + salary);
        System.out.println("Tên phòng ban: " + room);
        System.out.println("--------------------");
    }
}
