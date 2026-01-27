public class Bai02 {
    public static int searchBooks(String[] arr, String search){

        int flag = -1;

        for (int i = 0; i < arr.length; i++){
            if (arr[i].equalsIgnoreCase(search)){
                flag = i;
                return flag;
            }
        }

        return flag;
    }
}
