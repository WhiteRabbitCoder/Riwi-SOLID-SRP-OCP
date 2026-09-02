package com.riwi.solid.exercises.lsp.ex03;

public class FixedTermAccount extends BankAccount {
    public FixedTermAccount(double balance) { super(balance); }

    /**
     * Señal de LSP: la cuenta a plazo no puede cumplir la promesa de retiro inmediato.
     */
    @Override
    public void withdraw(double amount) {
        throw new UnsupportedOperationException("No se puede retirar antes del vencimiento");
    }
}
