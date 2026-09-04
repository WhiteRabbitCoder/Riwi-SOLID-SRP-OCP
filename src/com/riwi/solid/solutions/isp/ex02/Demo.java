package com.riwi.solid.solutions.isp.ex02;

/**
 * SOLUCIÓN ISP 02 — Impresoras
 *
 * Machine obligaba a toda impresora a escanear y enviar fax. Cada capacidad
 * pasa a ser un contrato propio; nadie lanza UnsupportedOperationException.
 */
public final class Demo {

    private Demo() {
    }

    public static void run() {
        System.out.println("== ISP 02 — Impresoras ==");
        BasicPrinter basic = new BasicPrinter();
        MultiFunctionPrinter multi = new MultiFunctionPrinter();

        printDocument(basic);
        printDocument(multi);

        // Solo el equipo que realmente escanea llega hasta aquí.
        scanDocument(multi);
        multi.fax();
    }

    static void printDocument(Printer printer) {
        printer.print();
    }

    static void scanDocument(Scanner scanner) {
        scanner.scan();
    }

    public static void main(String[] args) {
        run();
    }
}

interface Printer {
    void print();
}

interface Scanner {
    void scan();
}

interface FaxMachine {
    void fax();
}

class BasicPrinter implements Printer {
    @Override public void print() { System.out.println("Imprimiendo"); }
}

class MultiFunctionPrinter implements Printer, Scanner, FaxMachine {
    @Override public void print() { System.out.println("Imprimiendo (multifunción)"); }
    @Override public void scan() { System.out.println("Escaneando"); }
    @Override public void fax() { System.out.println("Enviando fax"); }
}
