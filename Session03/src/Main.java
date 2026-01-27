import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
//        BAI1

//        System.out.print("Nhập vào số lượng sách cần quản lý: ");
//        int n = sc.nextInt();
//
//        int[] arr1 = Bai01.addBookToLibraries(n);
//
//        Bai01.displayLibraries(arr1);




//        Bai02

//        String[] books = {"Doraemon" , "Chú mèo đi hia", "Conan"};
//
//        System.out.print("Nhập vào tên sách cần tìm: ");
//        String search = sc.nextLine();
//
//        int s = Bai02.searchBooks(books, search);
//
//        if(s == -1){
//            System.out.println("Sách không tồn tại trong thư viện.");
//        }else {
//            System.out.println("Tìm thấy sách '" + search + "' tại vị trí số: " + s);
//        }




//        Bai3

//        String[] names = {"Python basic", "Web Design" , "Java Core", "HTML/CSS"};
//        int[] quantities = {50, 5, 50, 1};
//
//        Bai03.maxQuantityOfBooks(names, quantities);
//        System.out.println("-----------------------");
//        Bai03.minQuantityOfBooks(names,quantities);



//        Bai4
//        Random r = new Random();
//        int[] arr2 = new int[5];
//        for (int i = 0; i < 5; i++){
//            arr2[i] = r.nextInt(100);
//        }
//
//        System.out.println("Mảng trước khi sắp xếp ");
//
//        Bai04.displayBooks(arr2);
//
//        Bai04.sortBooks(arr2);
//            System.out.println();
//        System.out.println("Mảng sau khi sắp xếp");
//
//        Bai04.displayBooks(arr2);




//        Bai5
//        int[] books = {101, 102, 103, 104, 105};
//        int n = books.length;
//        System.out.println("Kho sách hiện tại (" + n + " cuốn): " + Arrays.toString(books));
//
//        System.out.println("Nhập mã sách cần xóa (0 để thoát): ");
//        int bookId = sc.nextInt();
//
//        if (bookId != 0){
//            n = Bai05.deleteBook(books, n, bookId);
//        }
//
//        System.out.println("Kho sách hiện tại (" + n + " cuốn): " );
//        for (int i = 0; i < n; i++) {
//            System.out.print(books[i] + (i == n - 1 ? "" : ", "));
//        }

//        Bai6
        int[] arrayFirst = {101, 103, 105, 110};
        int[] arraySecond = {102, 103, 108, 110, 115};

        int[] result = Bai06.mergeBooks(arrayFirst, arraySecond);

        System.out.println("Kho cũ: " + Arrays.toString(arrayFirst));
        System.out.println("Lô mới " + Arrays.toString(arraySecond));
        System.out.println("Kho tổng: " + Arrays.toString(result));
    }
}