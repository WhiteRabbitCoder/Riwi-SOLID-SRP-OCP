package com.riwi.solid.exercises.isp.ex02;

public class BasicPrinter implements Machine {
    @Override public void print() { System.out.println("Imprimiendo"); }
    @Override public void scan() { throw new UnsupportedOperationException(); }
    @Override public void fax() { throw new UnsupportedOperationException(); }
}
