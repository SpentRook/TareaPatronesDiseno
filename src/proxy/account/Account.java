package proxy.account;

public interface Account {
    String getId();

    void withdraw(Integer amount, Account account);

    void deposit(Integer amount, Account account);

    String getPlatform();

    Integer getBalance();
}
