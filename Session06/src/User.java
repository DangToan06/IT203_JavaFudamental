import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User {
    private int id;
    private String username;
    private String password;
    private String email;

    String EMAIL_REGEX = "^[A-Za-z0-9+_.-]+@(gmail\\.com|hotmail\\.com)$";

    public User(int id, String username, String password, String email) {
        this.id = id;
        this.username = username;
        setPassword(password);
        setEmail(email);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if(password.length() > 0){
            this.password = password;
        }else {
            System.err.println("Password không được để trống !!!");
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {

        Pattern pattern = Pattern.compile(EMAIL_REGEX);

        Matcher matcher = pattern.matcher(email);

        if(matcher.matches()){
            this.email = email;
        }else {
            System.err.println("Email không hợp lệ !!!");
        }

    }

    public void displayUser() {
        System.out.println("---------------------------");
        System.out.println("User ID: " + id);
        System.out.println("Username: " + username);
        System.out.println("Email   : " + email);
        System.out.println("Password: ********");
        System.out.println("---------------------------");
    }
}
