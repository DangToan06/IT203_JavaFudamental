import java.util.Set;
import java.util.TreeSet;

public class patient implements Comparable<patient> {
    String name;
    int arrivalTime;
    int severity;

    public patient(String name, int arrivalTime, int severity) {
        this.name = name;
        this.arrivalTime = arrivalTime;
        this.severity = severity;
    }

    @Override
    public int compareTo(patient other) {
        if (this.severity != other.severity) {
            return Integer.compare(this.severity, other.severity);
        }
        return Integer.compare(this.arrivalTime, other.arrivalTime);
    }

    @Override
    public String toString() {
        return String.format("Bệnh nhân: %-10s | Mức độ: %d | Giờ đến: %d", name, severity, arrivalTime);
    }
}

class b5 {
    static void use() {
        Set<patient> emergencyRoom = new TreeSet<>();

        emergencyRoom.add(new patient("Nguyễn A", 3, 10));
        emergencyRoom.add(new patient("Trần B", 1, 12));
        emergencyRoom.add(new patient("Lê C", 2, 8));
        emergencyRoom.add(new patient("Phạm D", 1, 9));

        System.out.println("--- DANH SÁCH CẤP CỨU THEO ĐỘ ƯU TIÊN ---");
        for (patient p : emergencyRoom) {
            System.out.println(p);
        }


    }
}