Scanner sc = new Scanner(System.in);
static Student[] students = new Student[100];
static int count = 0;
void main() {
    int choice = 0;

    do{
        System.out.println("" +
                "===== QUẢN LÝ ĐIỂM SINH VIÊN =====\n" +
                "1. Nhập danh sách sinh viên \n" +
                "2. Hiển thị danh sách sinh viên \n" +
                "3. Tìm kiếm sinh viên theo Học lực \n" +
                "4. Sắp xếp theo học lực giảm dần\n" +
                "5. Thoát \n" +
                "==================================\n");

        System.out.println("Nhập lựa chọn của bạn: ");
        choice = sc.nextInt();

        switch (choice){
            case 1:
                addStudent();
                break;
            case 2:
                displayStudent();
                break;
            case 3:
                search();
                break;
            case 4:
                sapXepTheoHocLuc();
                break;
            case 5:
                System.out.println("Cam on vi da sư dung chương trình");
                break;
            default:
                break;
        }
    }while (choice != 5);

}

public void addStudent(){
    sc.nextLine();
    System.out.println("Nhập thông tin sinh viên muốn thêm");

    System.out.print("Nhập tên: ");
    String name = sc.nextLine();

    System.out.print("Nhập id: ");
    String id = sc.nextLine();

    System.out.print("Nhập điểm: ");
    double score = sc.nextDouble();

    students[count++] = new Student(id,name, score);

    System.out.println("\n Thêm sinh viên thành công !!!");
}

public  void displayStudent(){
    if(students.length == 0 ) return;
    for (int i = 0; i < students.length ; i++){
        if (students[i] != null) System.out.println(students[i].toString());
    }
}

public void search(){
    System.out.print("Nhập học lực: ");
    String key = sc.nextLine().toLowerCase();
    boolean found = false;
    for (int i = 0; i < count; i++) {
        if (students[i].getRank().equalsIgnoreCase(key)){
            System.out.println(students[i].toString());
        }
    }
}

public void sapXepTheoHocLuc() {
    for (int i = 0; i < count - 1; i++) {
        for (int j = 0; j < count - 1 - i; j++) {
            if (students[j].getScore() < students[j + 1].getScore()) {
                Student temp = students[j];
                students[j] = students[j + 1];
                students[j + 1] = temp;
            }
        }
    }
}