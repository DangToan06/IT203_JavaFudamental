import java.util.*;
import java.util.regex.*;

public class Bai06 {
    public static void execute() {

        String review = "Cuốn sách này rất tệ, nội dung thật là ngu ngốc và không đáng đọc.";
        List<String> blacklist = Arrays.asList(
                "tệ",
                "ngu ngốc",
                "không đáng đọc"
        );

        String regex = "\\b(" + String.join("|", blacklist) + ")\\b";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE);

        Matcher matcher = pattern.matcher(review);
        StringBuffer censored = new StringBuffer();

        while (matcher.find()) {
            String word = matcher.group();
            String stars = "*".repeat(word.length());
            matcher.appendReplacement(censored, stars);
        }
        matcher.appendTail(censored);

        String result = censored.toString();

        if (result.length() > 200) {
            int cutIndex = result.lastIndexOf(" ", 200);
            if (cutIndex == -1) {
                cutIndex = 200;
            }

            StringBuilder sb = new StringBuilder();
            sb.append(result, 0, cutIndex);
            sb.append("...");
            result = sb.toString();
        }

        System.out.println("Review sau khi xử lý:");
        System.out.println(result);
    }
}