import java.util.*;

public class Patient2 {
    private String name;
    private int age;
    private String department;

    public Patient2(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    public String getDepartment() { return department; }
    public String getName() { return name; }

    @Override
    public String toString() {
        return name + " (" + age + " tuổi)";
    }
}

class b6 {
    static void use() {
        Map<String, List<Patient2>> map = new HashMap<>();

        List<Patient2> input = Arrays.asList(
                new Patient2("Nguyễn A", 20, "Nội"),
                new Patient2("Trần B", 30, "Ngoại"),
                new Patient2("Lê C", 25, "Nội"),
                new Patient2("Phạm D", 40, "Nội")
        );

        for (Patient2 p : input) {
            String dept = p.getDepartment();
            map.computeIfAbsent(dept, k -> new ArrayList<>()).add(p);
        }

        String targetDept = "Nội";
        System.out.println("Bệnh nhân khoa " + targetDept + ": " + map.get(targetDept));

        String maxDept = "";
        int maxCount = -1;

        for (Map.Entry<String, List<Patient2>> entry : map.entrySet()) {
            if (entry.getValue().size() > maxCount) {
                maxCount = entry.getValue().size();
                maxDept = entry.getKey();
            }
        }

        System.out.println("Khoa quá tải nhất: " + maxDept + " với " + maxCount + " ca.");
    }

    public static void main(String[] args) {
        use();
    }
}