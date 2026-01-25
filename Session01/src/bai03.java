public class bai03 {
    static void hoandoivitri(){

        // Lưu giá trị 2 chuỗi vào một địa chỉ trong heap
        String book1 = "Java basic";
        String book2 = "Python intro";

        System.out.println("Trước khi hoàn đổi: Book1 = " + book1 + ", Book2 = " + book2);

        // Tạo biến tạm biến này sẽ được lưu trong stack , lưu địa chỉ mà book1 đang giữ
        String temp = book1;

        // book1 lấy địa chỉ của book2
        book1 = book2;

        // book2 lấy địa chỉ Book1 cũ (đang nằm trong temp)
        book2 = temp;

        System.out.println("Sau khi hoàn đổi: Book1 = " + book1 + ", Book2 = " + book2);
    }
}
