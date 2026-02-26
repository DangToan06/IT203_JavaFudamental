import java.util.ArrayList;
import java.util.List;

public class Bai3 {

    public static <T> List<T> findCommonPatients(List<T> arr1, List<T> arr2){
        List<T> res = new ArrayList<>();

        for (T x: arr1){
            if(arr2.contains(x)){
               res.add(x);
            }
        }

        return res;
    }


}
