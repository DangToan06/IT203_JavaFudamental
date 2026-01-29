public class ShowListStu {
    public static void displayStudent(String[] students){
        System.out.println("Danh sách mã sinh vien hiện có là: ");
        if(students.length == 0){
            System.out.println("Danh sách không có sinh viên nào");
        } else {
            for (int i = 0; i < students.length; i++){
                System.out.println(i+1 + ". " + students[i]);
            }
        }
    }
}
