import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Bai2 {
    public static void b2(){
        ArrayList<String> medicines = new ArrayList<>();
        medicines.add("Paracetamol");
        medicines.add("Ibuprofen");
        medicines.add("Panadol");
        medicines.add("Paracetamol");
        medicines.add("Aspirin");
        medicines.add("Ibuprofen");

        for (String x: medicines){
            System.out.print(x + " ");
        }

        ArrayList<String> medicines2 = new ArrayList<>();

        for (String x: medicines){
            if(!medicines2.contains(x)){
                medicines2.add(x);
            }
        }

        System.out.println("");

        Collections.sort(medicines2);

        for (String x: medicines2){
            System.out.print(x + " ");
        }
    }
}
