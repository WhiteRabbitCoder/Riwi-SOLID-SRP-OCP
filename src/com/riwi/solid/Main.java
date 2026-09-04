package com.riwi.solid;

/**
 * Punto de entrada rápido para comprobar la configuración Java desde VS Code
 * y ejecutar las soluciones incluidas de OCP, ISP y LSP.
 */
public final class Main {
    private Main() {
    }

    public static void main(String[] args) {
        System.out.println("Riwi - SOLID Principles");
        System.out.println("Java: " + Runtime.version().feature());

        System.out.println("\n--- Soluciones OCP ---");
        com.riwi.solid.solutions.ocp.ex01.Demo.run();
        // com.riwi.solid.solutions.ocp.ex02.Demo.run();
        // com.riwi.solid.solutions.ocp.ex03.Demo.run();

        // System.out.println("\n--- Soluciones ISP ---");
        // com.riwi.solid.solutions.isp.ex01.Demo.run();
        // com.riwi.solid.solutions.isp.ex02.Demo.run();
        // com.riwi.solid.solutions.isp.ex03.Demo.run();

        // System.out.println("\n--- Soluciones LSP ---");
        // com.riwi.solid.solutions.lsp.ex01.Demo.run();
        // com.riwi.solid.solutions.lsp.ex02.Demo.run();
        // com.riwi.solid.solutions.lsp.ex03.Demo.run();
    }
}
