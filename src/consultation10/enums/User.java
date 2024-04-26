package consultation10.enums;

public class User {
    private String email;
    private String password;
   private Day currentDayOfWeek;
    private Role role;

    public User(String email, String password, Role role) {
        this.email = email;
        this.password = password;
        this.role = role.USER;
    }
}
