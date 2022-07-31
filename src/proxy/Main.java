package proxy;

import proxy.account.Account;
import proxy.account.AccountDaviplata;
import proxy.account.AccountNequi;
import proxy.manager.AccountManagerProxy;

public class Main {
    public static void main(String[] args) throws Exception {
        Account nequi = new AccountNequi("32290239293", "micontrasena");
        Account daviplata = new AccountDaviplata("3029021111", "otracontrasena");
        AccountManagerProxy nequiManager = new AccountManagerProxy(nequi);
        AccountManagerProxy daviplataManager = new AccountManagerProxy(daviplata);

        nequiManager.withdraw(50000, daviplataManager);
        nequiManager.deposit(35000, daviplataManager);
        daviplataManager.getBalance();
    }
}
