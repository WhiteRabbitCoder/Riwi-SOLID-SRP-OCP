package com.riwi.solid.solutions.lsp.ex03;

/**
 * SOLUCIÓN LSP 03 — Cuentas bancarias
 *
 * BankAccount prometía retiro a todos sus subtipos. El retiro pasa a ser una
 * capacidad opcional, así que la cuenta a plazo deja de romper el contrato.
 */
public final class Demo {

    private Demo() {
    }

    public static void run() {
        System.out.println("== LSP 03 — Cuentas bancarias ==");
        SavingsAccount savings = new SavingsAccount(100_000);
        FixedTermAccount fixedTerm = new FixedTermAccount(500_000);

        // Depositar vale para cualquier cuenta.
        deposit(savings, 20_000);
        deposit(fixedTerm, 20_000);

        // Retirar solo se le pide a quien lo promete.
        withdraw(savings, 50_000);

        System.out.println("Ahorros: " + savings.getBalance());
        System.out.println("Plazo fijo: " + fixedTerm.getBalance());
    }

    static void deposit(Account account, double amount) {
        account.deposit(amount);
    }

    static void withdraw(Withdrawable account, double amount) {
        account.withdraw(amount);
    }

    public static void main(String[] args) {
        run();
    }
}

abstract class Account {
    protected double balance;

    Account(double balance) {
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
    }

    double getBalance() {
        return balance;
    }
}

interface Withdrawable {
    void withdraw(double amount);
}

class SavingsAccount extends Account implements Withdrawable {
    SavingsAccount(double balance) {
        super(balance);
    }

    @Override public void withdraw(double amount) {
        balance -= amount;
    }
}

/** No implementa Withdrawable: el retiro anticipado nunca se prometió. */
class FixedTermAccount extends Account {
    FixedTermAccount(double balance) {
        super(balance);
    }
}
