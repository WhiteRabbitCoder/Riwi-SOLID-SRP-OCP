package com.riwi.solid.exercises.srp.ex05;

/**
 * EJERCICIO SRP 05
 *
 * Este ejercicio NO presupone que la clase esté mal.
 * Antes de dividirla, argumenta si realmente existen múltiples
 * responsabilidades o razones de cambio.
 */
public class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double calculateArea() {
        return width * height;
    }

    public double calculatePerimeter() {
        return 2 * width + 2 * height;
    }

    public void resize(double width, double height) {
        this.width = width;
        this.height = height;
    }
}
