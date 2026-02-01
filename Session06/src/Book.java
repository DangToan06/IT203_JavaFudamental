public class Book {
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayBook() {
        System.out.println("---------------------------");
        System.out.println("Tên sách: " + this.title);
        System.out.println("Tác giả : " + this.author);
        System.out.println("Giá bán : " + this.price + " VND");
        System.out.println("---------------------------");
    }
}
