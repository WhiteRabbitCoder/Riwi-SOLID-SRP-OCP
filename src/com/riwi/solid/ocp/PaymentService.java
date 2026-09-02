package com.riwi.solid.ocp;

/**
 * EJERCICIO OCP 02
 *
 * Añadir un nuevo método de pago requiere modificar processPayment().
 * Diseña una alternativa extensible.
 */
public class PaymentService {

    public void processPayment(String type, double amount) {
        if ("CARD".equals(type)) {
            System.out.println("Pagando " + amount + " con tarjeta");
        } else if ("CASH".equals(type)) {
            System.out.println("Pagando " + amount + " en efectivo");
        } else if ("BANK_TRANSFER".equals(type)) {
            System.out.println("Pagando " + amount + " por transferencia");
        }
    }
}
