package com.riwi.solid.solutions.ocp.ex02;

/**
 * SOLUCIÓN OCP 02 — Métodos de pago
 *
 * Cada medio de pago implementa el mismo contrato. PaymentService deja de
 * conocer los tipos concretos y no crece con cada medio nuevo.
 */
public final class Demo {

    private Demo() {
    }

    public static void run() {
        System.out.println("== OCP 02 — Métodos de pago ==");
        PaymentService service = new PaymentService();
        service.process(new CardPayment(), 50_000);
        service.process(new CashPayment(), 30_000);
        service.process(new BankTransferPayment(), 120_000);
        // Medio agregado sin tocar PaymentService.
        service.process(new NequiPayment(), 15_000);
    }

    public static void main(String[] args) {
        run();
    }
}

interface PaymentMethod {
    void pay(double amount);
}

class CardPayment implements PaymentMethod {
    @Override public void pay(double amount) { System.out.println("Pagando " + amount + " con tarjeta"); }
}

class CashPayment implements PaymentMethod {
    @Override public void pay(double amount) { System.out.println("Pagando " + amount + " en efectivo"); }
}

class BankTransferPayment implements PaymentMethod {
    @Override public void pay(double amount) { System.out.println("Pagando " + amount + " por transferencia"); }
}

class NequiPayment implements PaymentMethod {
    @Override public void pay(double amount) { System.out.println("Pagando " + amount + " con Nequi"); }
}

class PaymentService {
    void process(PaymentMethod method, double amount) {
        method.pay(amount);
    }
}
