public interface Bank {
    String getAddress();

    void setAddress(String address);

    void deposit(User user, double amount);

    void withdraw(User user, double amount);

    double getBalance(User user);
}
