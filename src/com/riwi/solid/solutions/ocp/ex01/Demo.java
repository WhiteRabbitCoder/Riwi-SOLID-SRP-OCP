package com.riwi.solid.solutions.ocp.ex01;

/**
 * SOLUCIÓN OCP 01 — Notificaciones
 *
 * El canal es el punto de variación. NotificationService coordina el envío
 * y no vuelve a cambiar cuando aparece un canal nuevo.
 */
public final class Demo {

    private Demo() {
    }

    public static void run() {
        System.out.println("== OCP 01 — Notificaciones ==");
        new NotificationService(new EmailNotifier()).notifyUser("Pedido creado");
        new NotificationService(new SmsNotifier()).notifyUser("Pedido creado");
        // Canal agregado sin tocar NotificationService.
        new NotificationService(new WhatsAppNotifier()).notifyUser("Pedido creado");
    }

    public static void main(String[] args) {
        run();
    }
}

interface Notifier {
    void send(String message);
}

class EmailNotifier implements Notifier {
    @Override public void send(String message) { System.out.println("Email: " + message); }
}

class SmsNotifier implements Notifier {
    @Override public void send(String message) { System.out.println("SMS: " + message); }
}

class WhatsAppNotifier implements Notifier {
    @Override public void send(String message) { System.out.println("WhatsApp: " + message); }
}

class NotificationService {
    private final Notifier notifier;

    NotificationService(Notifier notifier) {
        this.notifier = notifier;
    }

    void notifyUser(String message) {
        notifier.send(message);
    }
}
