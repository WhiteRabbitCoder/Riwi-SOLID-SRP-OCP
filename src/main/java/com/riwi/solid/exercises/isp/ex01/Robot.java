package com.riwi.solid.exercises.isp.ex01;

public class Robot implements Worker {
    @Override public void work() { System.out.println("Robot trabajando"); }
    @Override public void eat() { /* TODO: esta capacidad no corresponde */ }
    @Override public void sleep() { /* TODO: esta capacidad no corresponde */ }
}
