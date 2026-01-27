public class Bai04 {
    public static void sortBooks(int[] arr){
        for (int i = 0; i < arr.length - 1 ; i++){
            for (int j = 0 ; j < arr.length - i - 1 ; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void displayBooks(int[] arr){
        for (int x : arr){
            System.out.print( x +" ");
        }
    }
}
