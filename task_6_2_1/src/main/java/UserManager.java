public interface UserManager {
    void registerUser(User user);

    User login(String user, String password);
}
