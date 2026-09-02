package com.riwi.solid.lsp;

public abstract class Payment {
    public abstract void pay(double amount);

    /** El contrato actual obliga a todo pago a soportar reembolsos. */
    public abstract void refund(double amount);
}
