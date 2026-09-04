package com.riwi.solid.solutions.lsp.ex01;

/**
 * SOLUCIÓN LSP 01 — Aves y vuelo
 *
 * Bird ya no promete vuelo. Volar es una capacidad aparte, así que Penguin
 * sigue siendo un ave válida sin lanzar excepciones.
 */
public final class Demo {

    private Demo() {
    }

    public static void run() {
        System.out.println("== LSP 01 — Aves y vuelo ==");
        Sparrow sparrow = new Sparrow();
        Penguin penguin = new Penguin();

        // Todo subtipo de Bird cumple este contrato.
        describe(sparrow);
        describe(penguin);

        // Solo quien puede volar entra aquí; no hace falta instanceof.
        makeItFly(sparrow);
    }

    static void describe(Bird bird) {
        bird.move();
    }

    static void makeItFly(Flyer flyer) {
        flyer.fly();
    }

    public static void main(String[] args) {
        run();
    }
}

abstract class Bird {
    abstract void move();
}

interface Flyer {
    void fly();
}

class Sparrow extends Bird implements Flyer {
    @Override void move() { System.out.println("El gorrión se desplaza"); }
    @Override public void fly() { System.out.println("El gorrión está volando"); }
}

class Penguin extends Bird {
    @Override void move() { System.out.println("El pingüino nada y camina"); }
}
