package com.riwi.solid.challenge;

/**
 * RETO FINAL — SRP + OCP
 *
 * No resuelvas este archivo agregando más if/else.
 * Primero identifica responsabilidades y puntos de variación.
 */
public class OrderService {

    public void createOrder(double basePrice, String customerType,
                            String notificationType, String invoiceFormat) {
        double finalPrice = calculateDiscount(basePrice, customerType);
        saveOrder(finalPrice);
        sendNotification(notificationType, "Pedido creado por " + finalPrice);
        exportInvoice(invoiceFormat, finalPrice);
    }

    public double calculateDiscount(double price, String customerType) {
        if ("REGULAR".equals(customerType)) {
            return price;
        }
        if ("PREMIUM".equals(customerType)) {
            return price * 0.90;
        }
        if ("VIP".equals(customerType)) {
            return price * 0.80;
        }
        return price;
    }

    public void saveOrder(double total) {
        System.out.println("Guardando pedido por " + total);
    }

    public void sendNotification(String type, String message) {
        if ("EMAIL".equals(type)) {
            System.out.println("Email: " + message);
        } else if ("SMS".equals(type)) {
            System.out.println("SMS: " + message);
        }
    }

    public void exportInvoice(String format, double total) {
        if ("PDF".equals(format)) {
            System.out.println("Factura PDF por " + total);
        } else if ("CSV".equals(format)) {
            System.out.println("Factura CSV por " + total);
        }
    }
}
