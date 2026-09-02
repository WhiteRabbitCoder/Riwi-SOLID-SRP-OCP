package com.riwi.solid.integrator;

public class CashPaymentProcessor implements PaymentProcessor {
    @Override
    public void pay(double amount) {
        System.out.printf("Pago en efectivo recibido: $%.0f%n", amount);
    }

    @Override
    public void refund(double amount) {
        throw new UnsupportedOperationException("El reembolso automático no aplica para efectivo");
    }

    @Override
    public void scheduleRecurringPayment(double amount) {
        throw new UnsupportedOperationException("El efectivo no soporta pagos recurrentes");
    }
}
