import java.util.ArrayList;
import java.util.Iterator;

public class Bai1 {
    public static void b1 () {
        ArrayList<Double> temperature = new ArrayList<Double>();

        temperature.add(36.5);
        temperature.add(40.2);
        temperature.add(37.0);
        temperature.add(12.5);
        temperature.add(39.8);
        temperature.add(99.9);
        temperature.add(36.8);

        System.out.println("Danh sách nhiệt độ ban đầu là: ");
        for(double x : temperature){
            System.out.print(x + " ");
        }

        Iterator<Double> it = temperature.iterator();
        while (it.hasNext()){
            double value = it.next();

            if(value < 34.0 || value > 42.0){
                it.remove();
            }
        }
        System.out.println("");
        System.out.println("Danh sách sau khi lọc là: ");
        for(double x : temperature){
            System.out.print(x + " ");
        }

        double sum = 0;

        for (double num : temperature) {
            sum += num;
        }

        double average = sum / temperature.size();

        System.out.println("");
        System.out.print("Nhiệt độ trung bình: " + average);
    }
}
