import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Bai4 {
    public static void FrequencyCounting(){
        List<String> danhSachCaBenh = Arrays.asList(
                "Cúm A", "Sốt xuất huyết", "Cúm A", "Covid-19", "Cúm A", "Sốt xuất huyết"
        );

        Map<String, Integer> baoCaoBenh = new TreeMap<>();

        for (String tenBenh : danhSachCaBenh) {
            if (baoCaoBenh.containsKey(tenBenh)) {
                baoCaoBenh.put(tenBenh, baoCaoBenh.get(tenBenh) + 1);
            } else {
                baoCaoBenh.put(tenBenh, 1);
            }
        }

        for (Map.Entry<String, Integer> entry : baoCaoBenh.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " ca");
        }
    }
}
