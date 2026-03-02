import java.util.HashSet;
import java.util.Set;

public class Bai3 {
    public static void phanTichDiUngThuoc(){
        Set<String> listA = new HashSet<>();
        Set<String> listB = new HashSet<>();

        listA.add("Aspirin");
        listA.add("Caffeine");
        listA.add("Paracetamol");

        listB.add("Penicillin");
        listB.add("Aspirin");

        Set<String> canhBao = new HashSet<>(listA);
        canhBao.retainAll(listB);

        Set<String> anToan = new HashSet<>(listA);
        anToan.removeAll(listB);

        System.out.println("Cảnh báo dị ứng: " + canhBao);

        System.out.println("Thành phần an toàn: " + anToan);
    }
}
