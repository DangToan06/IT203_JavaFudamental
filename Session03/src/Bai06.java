import java.util.Arrays;

public class Bai06 {
    public static int[] mergeBooks(int[] a, int[] b){

        int i =0;
        int j = 0;
        int[] arr = new int[a.length + b.length];
        int k = 0;

        while (i < a.length || j < b.length) {
            int currentVal;

            if (i < a.length && (j == b.length || a[i] < b[j])) {
                currentVal = a[i++];
            } else if (j < b.length && (i == a.length || b[j] < a[i])) {
                currentVal = b[j++];
            } else {
                // Trường hợp a[i] == b[j]
                currentVal = a[i];
                i++;
                j++;
            }

            if (k == 0 || currentVal != arr[k - 1]) {
                arr[k++] = currentVal;
            }
        }

        return Arrays.copyOf(arr,k);

    }
}
