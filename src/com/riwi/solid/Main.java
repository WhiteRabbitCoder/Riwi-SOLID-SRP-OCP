package com.riwi.solid;

/**
 * Punto de entrada rápido para comprobar la configuración Java desde VS Code.
 */
public final class Main {
    private Main() {
    }

    public static void main(String[] args) {
        System.out.println("Riwi - SOLID Principles");
        System.out.println("Java: " + Runtime.version().feature());
        System.out.println("\nSesión actual:");
        System.out.println("- Open/Closed Principle: docs/ocp.md");
        System.out.println("- Liskov Substitution Principle: docs/lsp.md");
        System.out.println("\nLa configuración Java funciona correctamente.");
    }
}
