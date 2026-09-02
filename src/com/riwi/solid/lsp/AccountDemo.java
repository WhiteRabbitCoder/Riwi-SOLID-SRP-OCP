package com.riwi.solid.lsp;

public class AccountDemo {
    public static void withdrawMoney(BankAccount account, double amount) {
        account.withdraw(amount);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount(100_000);
        withdrawMoney(account, 20_000);
        // TODO: analiza si FixedTermAccount cumple realmente el contrato de BankAccount.
    }
}
