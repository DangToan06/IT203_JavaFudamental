public class Bai01 {
    public static void formatEx(){
        String title = "   lap trinh jAva   Co ban   ";
        String author = "nguyen van a";
        title = title.trim().replaceAll("\\s+"," ").toUpperCase();

        author = author.trim();
        StringBuilder sb = new StringBuilder(author);
        sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
        for (int i = 1; i < sb.length() - 1 ; i ++){
            if(sb.charAt(i) == ' ' && sb.charAt(i+1) != ' ' ){
                sb.setCharAt(i+1, Character.toUpperCase(sb.charAt(i+1)));
            }

        }
        author = sb.toString();
        System.out.printf("[%s] - Tac gia: %s\n", title, author);

    }
}