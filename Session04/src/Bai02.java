public class Bai02 {
    public static void execute(){
        String desc = "Sach giao khoa toan lop 12, Ke: A1-102, tinh trang moi";
        boolean checkFound = false;
        checkFound = desc.contains("Ke");
        if(checkFound){
            int index = desc.indexOf("Ke");
            int endIndex = desc.indexOf(",", index);
            String pos = desc.substring(index, endIndex);
            System.out.println("Vi tri tim thay: " + pos);
            String newDesc = desc.replace("Ke", "Vi tri luu tru");
            System.out.println("" + newDesc);
        }else{
            System.out.println("Khong tim thay sach");
        }
    }


}