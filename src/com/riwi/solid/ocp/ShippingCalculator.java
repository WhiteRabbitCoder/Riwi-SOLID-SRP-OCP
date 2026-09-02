package com.riwi.solid.ocp;

/**
 * EJERCICIO OCP 04
 *
 * Cada tipo de envío contiene una fórmula diferente. Piensa dónde
 * debería vivir esa fórmula para permitir nuevas modalidades.
 */
public class ShippingCalculator {

    public double calculate(String shippingType, double weight) {
        if ("STANDARD".equals(shippingType)) {
            return weight * 3_000;
        }

        if ("EXPRESS".equals(shippingType)) {
            return weight * 7_000;
        }

        return 0;
    }
}
