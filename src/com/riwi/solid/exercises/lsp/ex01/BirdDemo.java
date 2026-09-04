package com.riwi.solid.exercises.lsp.ex01;

public class BirdDemo {
    public static void makeBirdFly(Bird bird) {
        bird.fly();
    }

    public static void main(String[] args) {
        makeBirdFly(new Bird());
        // TODO: prueba qué ocurre con new Penguin() y rediseña el contrato.
    }
}
