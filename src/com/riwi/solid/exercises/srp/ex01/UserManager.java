package com.riwi.solid.exercises.srp.ex01;

/**
 * EJERCICIO SRP 01
 *
 * Esta clase funciona, pero reúne responsabilidades diferentes.
 * No hay solución incluida: identifica las responsabilidades y refactoriza.
 */
public class UserManager {

    public void createUser(String name) {
        System.out.println("Usuario creado: " + name);
    }

    public void saveUser(String name) {
        System.out.println("Guardando usuario: " + name);
    }

    public void sendWelcomeEmail(String name) {
        System.out.println("Enviando correo de bienvenida a: " + name);
    }
}
