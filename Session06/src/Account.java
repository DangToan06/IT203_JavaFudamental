public class Account {
    String username;
    String password;
    String email;

    public Account (String username, String password, String email){
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public void changePassword(String newPassword) {
        this.password = newPassword;
        System.out.println("=> Thông báo: Đổi mật khẩu thành công cho tài khoản: " + username);
    }

    public void displayAccount (){
        System.out.println("---------------------------");
        System.out.println("Username: " + username);
        System.out.println("Email: " + email);
        System.out.println("Password: ********");
        System.out.println("---------------------------");
    }
}
