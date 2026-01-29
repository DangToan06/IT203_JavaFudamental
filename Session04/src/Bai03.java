import java.text.SimpleDateFormat;
import java.util.Date;

public class Bai03 {
    public static void execute(){
        String[] transactions = {"BK001-20/01", "BK005-21/01", "BK099-22/01"};

        Date today = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String dateString = formatter.format(today);

        long startString = System.currentTimeMillis();

        String str = "---Bao cao muon sach---\nNgay tao: " + dateString + "\n";
        for (int i = 0; i < transactions.length; i++){
            str = str + ("Giao dich: " + transactions[i] + "\n");
        }
        long endString = System.currentTimeMillis();
        long stringTime = endString - startString;

        long startSB = System.currentTimeMillis();
        StringBuilder tsb = new StringBuilder();
        tsb.append("---Bao cao muon sach---\nNgay tao: " + dateString + "\n");
        for (int i = 0; i < transactions.length; i++){
            tsb.append("Giao dich: " + transactions[i] + "\n");
        }
        long endSB = System.currentTimeMillis();
        long sbTime = endSB - startSB;
        tsb.append("Thoi gian StringBuilder: " + sbTime + " milliseconds\n");
        tsb.append("Thoi gian String: " + stringTime + " milliseconds\n");


        System.out.println(tsb.toString());
    }
}