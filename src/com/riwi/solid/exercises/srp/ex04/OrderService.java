package com.riwi.solid.exercises.srp.ex04;

import java.util.List;

/**
 * EJERCICIO SRP 04
 *
 * Simula el flujo de una tienda. Identifica las razones de cambio y
 * reorganiza el código sin alterar el comportamiento general.
 */
public class OrderService {

    public double calculateTotal(List<Double> prices) {
        return prices.stream().mapToDouble(Double::doubleValue).sum();
    }

    public boolean validateStock() {
        System.out.println("Validando stock...");
        return true;
    }

    public void saveOrder(double total) {
        System.out.println("Pedido guardado con total: " + total);
    }

    public void sendConfirmationEmail(String email) {
        System.out.println("Confirmación enviada a: " + email);
    }

    public void printInvoice(double total) {
        System.out.println("FACTURA - TOTAL: " + total);
    }
}
