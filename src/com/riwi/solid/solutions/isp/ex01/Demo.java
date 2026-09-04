package com.riwi.solid.solutions.isp.ex01;

/**
 * SOLUCIÓN ISP 01 — Trabajador humano y robot
 *
 * Worker exigía trabajar, comer y dormir. Se separan en capacidades para que
 * ninguna clase implemente métodos vacíos.
 */
public final class Demo {

    private Demo() {
    }

    public static void run() {
        System.out.println("== ISP 01 — Trabajador humano y robot ==");
        Human human = new Human();
        Robot robot = new Robot();

        // Un cliente que solo necesita trabajo acepta a los dos.
        assignShift(human);
        assignShift(robot);

        // El descanso solo aplica a quien puede cumplirlo.
        takeBreak(human);
    }

    static void assignShift(Workable worker) {
        worker.work();
    }

    static void takeBreak(Restable worker) {
        worker.eat();
        worker.sleep();
    }

    public static void main(String[] args) {
        run();
    }
}

interface Workable {
    void work();
}

interface Restable {
    void eat();
    void sleep();
}

class Human implements Workable, Restable {
    @Override public void work() { System.out.println("Humano trabajando"); }
    @Override public void eat() { System.out.println("Humano comiendo"); }
    @Override public void sleep() { System.out.println("Humano durmiendo"); }
}

class Robot implements Workable {
    @Override public void work() { System.out.println("Robot trabajando"); }
}
