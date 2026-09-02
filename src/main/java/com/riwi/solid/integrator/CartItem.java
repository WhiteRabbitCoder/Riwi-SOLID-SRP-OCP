package com.riwi.solid.integrator;

public record CartItem(Product product, int quantity) {
    public double subtotal() {
        return product.price() * quantity;
    }
}
