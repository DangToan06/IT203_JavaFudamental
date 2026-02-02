public class ClassRoom {
    public static double classFund = 0.0;

    private String nameStudent ;

    public ClassRoom(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public void payTheMoney(double payMoney){
        if (classFund >= 0.0) {
            classFund += payMoney;
            System.out.println("Sinh viên: " + nameStudent +  " vừa đóng + " + payMoney);
        }else {
            System.err.println("Đóng tiền lỗi");
        }
    }

    public static void viewTheClassFund (){
        System.out.println("==> Tổng quỹ lớp hiện tại là: " + classFund);
    }
}
