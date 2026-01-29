import java.util.Scanner;
import java.util.regex.*;

public class Bai04 {
    public static void execute(Scanner sc) {
        System.out.print("Nhap ma the: ");
        String code = sc.nextLine();

        Pattern prefixPattern = Pattern.compile("^[A-Z]{2}");
        Pattern yearPattern = Pattern.compile("^[A-Z]{2}\\d{4}");
        Pattern fullPattern = Pattern.compile("^[A-Z]{2}\\d{9}$");

        Matcher fullMatcher = fullPattern.matcher(code);

        if (code.length() != 11) {
            System.out.println(" Ma the phai co 11 ky tu!");
        } else if (!prefixPattern.matcher(code).find()) {
            System.out.println(" Thieu tien to! Phai bat dau bang 2 chu HOA");
        } else if (!yearPattern.matcher(code).find()) {
            System.out.println(" Nam khong hop le! Phai la 4 chu so");
        } else if (Integer.parseInt(code.substring(2, 6)) < 2000 || Integer.parseInt(code.substring(2, 6)) > 2030) {
            System.out.println(" Nam phai tu 2000 den 2030!");
        } else if (!fullMatcher.matches()) {
            System.out.println(" Ma so khong hop le! 5 ky tu cuoi phai la so");
        } else {
            System.out.println(" Ma the hop le!");
        }
    }
}