import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Bai1 {
    public static void dsBenhNhan(){
        Set<String> listPatient = new LinkedHashSet<>();

        listPatient.add("Nguyễn Văn A – Yên Bái");
        listPatient.add("Trần Thị B – Thái Bình");
        listPatient.add("Nguyễn Văn A – Yên Bái");
        listPatient.add("Lê Văn C – Hưng Yên");

        System.out.println("Danh sách gọi khám: ");
        for (String x: listPatient){
            System.out.println(x);
        }

    }
}
