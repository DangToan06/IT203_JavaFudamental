public class ScoreUtils {
    public static String check (double score){
        if (score >= 5.0){
            return "Điểm đạt";
        }else {
            return "Điểm không đạt";
        }
    }

    public static double avg (double[] scores){
        if (scores == null || scores.length == 0) return 0;

        double sum = 0;
        for (double s : scores) {
            sum += s;
        }
        return sum / scores.length;
    }
}
