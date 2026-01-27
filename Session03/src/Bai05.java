public class Bai05 {
    public static int deleteBook(int[] arr, int n, int bookId){

        int pos = -1;
        for (int i = 0; i < n; i++){
            if(arr[i] == bookId){
                pos = i;
                break;
            }
        }

        if(pos == -1){
            return n;
        }

        for (int i = pos; i < n - 1; i++){
            arr[i] = arr[i + 1];
        }
        return n - 1;
    }
}
