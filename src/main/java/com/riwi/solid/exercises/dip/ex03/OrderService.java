package com.riwi.solid.exercises.dip.ex03;

public class OrderService {
    private final CardGateway gateway = new CardGateway();
    public void checkout(double total) { gateway.charge(total); }
}
