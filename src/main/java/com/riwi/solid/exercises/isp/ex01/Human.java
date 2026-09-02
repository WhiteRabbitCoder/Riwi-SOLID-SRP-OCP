package com.riwi.solid.exercises.isp.ex01;

public class Human implements Worker {
    @Override public void work() { System.out.println("Humano trabajando"); }
    @Override public void eat() { System.out.println("Humano comiendo"); }
    @Override public void sleep() { System.out.println("Humano durmiendo"); }
}
