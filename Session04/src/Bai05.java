import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Bai05 {
    public static void execute() {

        String logData =
                "2024-05-20 | User: NguyenVanA | Action: BORROW | BookID: BK12345\n" +
                        "2024-05-21 | User: TranVanB  | Action: RETURN | BookID: BK54321\n" +
                        "2024-05-22 | User: NguyenVanA | Action: BORROW | BookID: BK99999";

        String regex =
                "(\\d{4}-\\d{2}-\\d{2})\\s*\\|\\s*" +
                        "User:\\s*(\\w+)\\s*\\|\\s*" +
                        "Action:\\s*(BORROW|RETURN)\\s*\\|\\s*" +
                        "BookID:\\s*(\\w+)";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(logData);

        while (matcher.find()) {
            String date = matcher.group(1);
            String user = matcher.group(2);
            String action = matcher.group(3);
            String bookId = matcher.group(4);

            System.out.println("Date: " + date);
            System.out.println("User: " + user);
            System.out.println("Action: " + action);
            System.out.println("BookID: " + bookId);
            System.out.println("-----");

        }


    }
}