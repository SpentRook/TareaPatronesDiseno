package proxy.account;

import proxy.ApiBankExample;

public class AccountDaviplata implements Account {
    private String id;
    private String password;

    /**
     * Realiza conexion a la "API" de Daviplata y obtiene los datos de la cuenta
     */
    public AccountDaviplata(String phoneNumber, String password) {
        /**
         * ...verifica que se puede conectar con las credenciales a la cuenta
         */
        this.id = phoneNumber;
        this.password = password;
    }

    /**
     * Conecta a la api para retirar el dinero solicitado y enviarlo
     * a la cuenta dada usando las credenciales guardadas
     */
    @Override
    public void withdraw(Integer amount, Account account) {
        /**
         * Se conecta a la API retirando el dinero solicitado y enviarlo a la cuenta
         * dada usando las credenciales guardadas
         */
        Daviplata.withdraw(this.id, this.password, amount, account.getId());
    }

    @Override
    public void deposit(Integer amount, Account account) {
        account.withdraw(amount, this);
    }

    @Override
    public Integer getBalance() {
        return Daviplata.getBalance(this.id, this.password);
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public String getPlatform() {
        return "Daviplata";
    }
}

/**
 * Abstraccion de ejemplo simulando api de daviplata,
 */
class Daviplata extends ApiBankExample {
}
