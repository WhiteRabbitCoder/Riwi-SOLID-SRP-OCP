package com.riwi.solid.exercises.lsp.ex04;

public class CardPayment extends Payment {
    @Override public void pay(double amount) { System.out.println("Pago con tarjeta: " + amount); }
    @Override public void refund(double amount) { System.out.println("Reembolso a tarjeta: " + amount); }
}
