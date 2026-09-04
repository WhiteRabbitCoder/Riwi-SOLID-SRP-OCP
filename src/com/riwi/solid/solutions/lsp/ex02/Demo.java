package com.riwi.solid.solutions.lsp.ex02;

/**
 * SOLUCIÓN LSP 02 — Rectángulos y cuadrados
 *
 * El contrato roto era "ancho y alto se cambian por separado". Un cuadrado no
 * puede cumplirlo, así que deja de heredar de Rectangle: ambos son Shape y sus
 * dimensiones se fijan al construir.
 */
public final class Demo {

    private Demo() {
    }

    public static void run() {
        System.out.println("== LSP 02 — Rectángulos y cuadrados ==");
        // El mismo cliente funciona con cualquier Shape y el resultado no sorprende.
        printArea(new Rectangle(5, 4));
        printArea(new Square(5));
    }

    static void printArea(Shape shape) {
        System.out.println(shape.name() + " -> área " + shape.area());
    }

    public static void main(String[] args) {
        run();
    }
}

interface Shape {
    int area();
    String name();
}

class Rectangle implements Shape {
    private final int width;
    private final int height;

    Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    /** Redimensionar devuelve otro rectángulo en vez de mutar el actual. */
    Rectangle resized(int width, int height) {
        return new Rectangle(width, height);
    }

    @Override public int area() { return width * height; }
    @Override public String name() { return "Rectángulo " + width + "x" + height; }
}

class Square implements Shape {
    private final int side;

    Square(int side) {
        this.side = side;
    }

    Square resized(int side) {
        return new Square(side);
    }

    @Override public int area() { return side * side; }
    @Override public String name() { return "Cuadrado de lado " + side; }
}
