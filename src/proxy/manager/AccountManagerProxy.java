package proxy.manager;

import proxy.account.Account;

/**
 * AccountManagerProxy es un proxy de registro y de caché,
 * guarda el ultimo balance y lo devuelve en caso de ser solicitado
 * evitando hacer la petición a la API. También realiza tareas de auditoria
 */
public class AccountManagerProxy implements Account {
    private Account account;
    private Integer balanceCache;
    private Boolean isResetRequired = false;

    public AccountManagerProxy(Account account) {
        this.account = account;
        System.out.println("Se ha conectado la cuenta de " + account.getPlatform() +
                " con id " + account.getId());
        /**
         * tareas de logger, registros de la hora, la cuenta, etc. Notificacion por
         * correo
         * al dueno
         */
    }

    @Override
    public void withdraw(Integer amount, Account account) {
        this.account.withdraw(amount, account);
        System.out.println("Retiro de la cuenta con id " + this.account.getId() + " por un monto de " + amount
                + " a la cuenta con id " + account.getId());
        /**
         * tareas de logger, registros de la hora, la cuenta, etc.
         * Notificacion por correo al dueno de la operacion
         */
    }

    @Override
    public void deposit(Integer amount, Account account) {
        account.withdraw(amount, this);
    }

    @Override
    public Integer getBalance() {
        if (balanceCache == null || isResetRequired) {
            balanceCache = this.account.getBalance();
            System.out.println("Se ha solicitado el balance actual en la cuenta con id " + this.account.getId()
                    + " el cual es de " + balanceCache);
            /**
             * tareas de logger, registros de la hora, la cuenta, etc.
             */
        }

        return balanceCache;
    }

    @Override
    public String getId() {
        return this.account.getId();
    }

    @Override
    public String getPlatform() {
        return this.account.getPlatform();
    }
}
