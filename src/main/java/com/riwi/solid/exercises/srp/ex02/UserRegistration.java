package com.riwi.solid.exercises.srp.ex02;

/**
 * EJERCICIO SRP 02
 *
 * Refactoriza separando las razones de cambio relacionadas con
 * registro, persistencia y comunicación.
 */
public class UserRegistration {

    public void register(String name, String email) {
        System.out.println("Registrando a " + name + " con email " + email);
        saveInMysql(name, email);
        sendWelcomeEmail(email);
    }

    private void saveInMysql(String name, String email) {
        System.out.println("INSERT simulado en MySQL para " + name);
    }

    private void sendWelcomeEmail(String email) {
        System.out.println("Email de bienvenida enviado a " + email);
    }
}
