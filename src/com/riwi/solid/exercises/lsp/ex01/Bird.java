package com.riwi.solid.exercises.lsp.ex01;

public class Bird {
    /**
     * Contrato inicial deliberadamente amplio: el cliente asume que toda ave vuela.
     * La práctica consiste en revisar esa promesa, no en ocultar su incumplimiento.
     */
    public void fly() {
        System.out.println("El ave está volando");
    }
}
