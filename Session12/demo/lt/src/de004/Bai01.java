package de004;

import java.util.Locale;
import java.util.Scanner;

public class Bai01 {

    public static void kiemTraNguyenAm(){
        int nguyenAm = 0;
        int phuAm = 0;
        String cacPhuAm = "aeiou";
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        String lowerInput = input.toLowerCase();

        for (int i = 0; i < lowerInput.length(); i++){
            char ch = lowerInput.charAt(i);

            if(ch >= 'a' && ch <= 'z'){
                if(cacPhuAm.indexOf(ch) != -1){
                    nguyenAm++;
                }else {
                    phuAm++;
                }
            }
        }

        if (nguyenAm > phuAm) {
            System.out.printf("Nguyên âm nhiều hơn (Nguyên âm: %d, Phụ âm: %d)\n", nguyenAm, phuAm);
        } else if (phuAm > nguyenAm) {
            System.out.printf("Phụ âm nhiều hơn (Nguyên âm: %d, Phụ âm: %d)\n", nguyenAm, phuAm);
        } else {
            System.out.println("Bằng nhau");
        }
    }
}
