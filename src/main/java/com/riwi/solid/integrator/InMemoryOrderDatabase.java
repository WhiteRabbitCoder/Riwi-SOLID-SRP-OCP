package com.riwi.solid.integrator;

import java.util.ArrayList;
import java.util.List;

public class InMemoryOrderDatabase {
    private final List<String> orders = new ArrayList<>();

    public void save(String order) {
        orders.add(order);
        System.out.println("Pedido guardado en la base de datos simulada.");
    }

    public List<String> findAll() {
        return List.copyOf(orders);
    }
}
