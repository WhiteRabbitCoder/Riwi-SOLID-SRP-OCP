package com.riwi.solid.exercises.lsp.ex04;

public class CashPayment extends Payment {
    @Override public void pay(double amount) { System.out.println("Pago en efectivo: " + amount); }
    /** Este fallo muestra que Payment promete más de lo que todo pago puede cumplir. */
    @Override public void refund(double amount) { throw new UnsupportedOperationException("Reembolso digital no disponible"); }
}
