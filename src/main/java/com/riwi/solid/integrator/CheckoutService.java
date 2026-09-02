package com.riwi.solid.integrator;

public class CheckoutService {
    // Problema intencional: dependencia concreta creada dentro del servicio.
    private final InMemoryOrderDatabase database = new InMemoryOrderDatabase();

    public double calculateDiscount(String customerType, double total) {
        if ("REGULAR".equalsIgnoreCase(customerType)) {
            return total;
        }
        if ("PREMIUM".equalsIgnoreCase(customerType)) {
            return total * 0.90;
        }
        if ("VIP".equalsIgnoreCase(customerType)) {
            return total * 0.80;
        }
        return total;
    }

    public void checkout(Cart cart, String customerType, String paymentType, String notificationType) {
        if (cart.isEmpty()) {
            System.out.println("El carrito está vacío.");
            return;
        }

        double originalTotal = cart.total();
        double finalTotal = calculateDiscount(customerType, originalTotal);

        // Problema intencional: cada medio nuevo obliga a modificar este método.
        PaymentProcessor paymentProcessor;
        if ("CARD".equalsIgnoreCase(paymentType)) {
            paymentProcessor = new CardPaymentProcessor();
        } else {
            paymentProcessor = new CashPaymentProcessor();
        }
        paymentProcessor.pay(finalTotal);

        // Problema intencional: persistencia mezclada con el caso de uso.
        String orderSummary = "Pedido | items=" + cart.getItems().size()
                + " | total=" + finalTotal
                + " | customer=" + customerType;
        database.save(orderSummary);

        // Problema intencional: lógica de notificación por condicionales.
        if ("EMAIL".equalsIgnoreCase(notificationType)) {
            System.out.println("EMAIL -> Compra confirmada por $" + Math.round(finalTotal));
        } else if ("SMS".equalsIgnoreCase(notificationType)) {
            System.out.println("SMS -> Compra confirmada por $" + Math.round(finalTotal));
        } else {
            System.out.println("CONSOLA -> Compra confirmada por $" + Math.round(finalTotal));
        }

        // Problema intencional: presentación y reglas mezcladas.
        System.out.printf("Total original: $%.0f | Total final: $%.0f%n", originalTotal, finalTotal);
        cart.clear();
    }
}
