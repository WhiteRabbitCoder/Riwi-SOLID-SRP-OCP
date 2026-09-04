package com.riwi.solid.exercises.ocp.ex05;

/**
 * EJERCICIO OCP 05
 *
 * Cada ataque nuevo aumenta la cantidad de condiciones de esta clase.
 * Modela el comportamiento de ataque como un punto de extensión.
 */
public class AttackService {

    public void attack(String type) {
        if ("SWORD".equals(type)) {
            System.out.println("Ataque con espada");
        }

        if ("MAGIC".equals(type)) {
            System.out.println("Ataque mágico");
        }

        if ("BOW".equals(type)) {
            System.out.println("Ataque con arco");
        }
    }
}
