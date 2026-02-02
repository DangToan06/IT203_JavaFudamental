void main() {

//    Bai01
//    Student st01 = new Student("SV01", "Tôn Phạm Quang Huy");
//    st01.displayStudent();
//    Student.displayTotal();
//
//    Student st02 = new Student("SV02", "Trần Trí Dương");
//    st02.displayStudent();
//    Student.displayTotal();


//    Bai02
//    int a = 5;
//    Student st03 = new Student("SV03", "Đinh Đình Thành");
//
//    int tempa = a;
//    tempa = 6;
//
//    System.out.println("Biến tempa: " + tempa);
//    System.out.println("Biến a: " + a);
////    Giá trị gốc không thay đổi vì nó tạo ra bản sao là lưu vào biến tempa
//
//    Student tempst03 = st03;
//    tempst03.setName("Bách");
//    System.out.println("Biến tempat03: " + tempst03.getName());
//    System.out.println("Biến st: " + st03.getName());
//    //    Giá trị gốc không thay đổi vì nó biến object kiểu tham chiếu


//    Bai03
//    double myScore = 7.5;
//    double[] listScores = {8.0, 7.0, 9.5, 4.0};
//
//    String result = ScoreUtils.check(myScore);
//    double avg = ScoreUtils.avg(listScores);
//
//    System.out.println("Kết quả kiểm tra: " + result);
//    System.out.println("Điểm trung bình: " + avg);


//    Bai04
//    ClassRoom st04 = new ClassRoom("Đinh Trọng An");
//    st04.payTheMoney(69000);
//    ClassRoom.viewTheClassFund();
//
//    ClassRoom st05 = new ClassRoom("Đinh Đình Thành");
//    st04.payTheMoney(70000);
//    ClassRoom.viewTheClassFund();


//    Bai05
//    System.out.println("Trường: " + Config.SCHOOL_NAME);
//    System.out.println("Điểm tối đa cho phép: " + Config.MAX_SCORE);

//     Config.MAX_SCORE = 120; ==> Lỗi biên dịch vì final là định ngĩa hằng số không được phép thay đổi
//     Lỗi: cannot assign a value to final variable MAX_SCORE


//    Bai06
    User u1 = new User(1, "admin", "123456");
    User u2 = new User(2, "bob", "password123");
    User u3 = new User(3, "alice", "alice@2024");

    UserManager.addUser(u1);
    UserManager.addUser(u2);
    UserManager.addUser(u3);

    System.out.println("---------------------------");

    System.out.println("Thử đăng nhập admin/123456: " + UserManager.checkLogin("admin", "123456"));
    System.out.println("Thử đăng nhập bob/wrongpass: " + UserManager.checkLogin("bob", "wrongpass"));
    System.out.println("Thử đăng nhập unknow/123: " + UserManager.checkLogin("unknow", "123"));
}

