package com.riwi.solid.exercises.lsp.ex03;

public class BankAccount {
    protected double balance;

    public BankAccount(double balance) { this.balance = balance; }
    public void deposit(double amount) { balance += amount; }
    /** El contrato actual promete retiros a cualquier cliente de BankAccount. */
    public void withdraw(double amount) { balance -= amount; }
    public double getBalance() { return balance; }
}
