package com.riwi.solid.ocp;

/**
 * EJERCICIO OCP 01
 *
 * El código funciona, pero cada canal nuevo obliga a editar esta clase.
 * Refactoriza pensando en un contrato común para las notificaciones.
 */
public class NotificationService {

    public void send(String type, String message) {
        if ("EMAIL".equals(type)) {
            System.out.println("Email: " + message);
        } else if ("SMS".equals(type)) {
            System.out.println("SMS: " + message);
        }
    }
}
