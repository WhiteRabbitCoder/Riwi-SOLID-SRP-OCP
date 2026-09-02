package com.riwi.solid.integrator;

public class CardPaymentProcessor implements PaymentProcessor {
    @Override
    public void pay(double amount) {
        System.out.printf("Tarjeta cobrada por $%.0f%n", amount);
    }

    @Override
    public void refund(double amount) {
        System.out.printf("Reembolso a tarjeta por $%.0f%n", amount);
    }

    @Override
    public void scheduleRecurringPayment(double amount) {
        System.out.printf("Pago recurrente programado por $%.0f%n", amount);
    }
}
