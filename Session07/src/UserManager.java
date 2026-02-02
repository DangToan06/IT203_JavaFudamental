import java.util.ArrayList;

public class UserManager {
    public static ArrayList<User> users = new ArrayList<>();

    public static void addUser(User u) {
        users.add(u);
    }

    public static boolean checkLogin(String username, String password){
        for (User u : users) {
            if (u.userName.equals(username) && u.password.equals(password)) {
                return true;
            }
        }
        return false;
    }
}
