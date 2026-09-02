package com.riwi.solid.exercises.isp.ex03;

public class UserViewer implements UserOperations {
    @Override public void findUser() { System.out.println("Consultando usuario"); }
    @Override public void createUser() { throw new UnsupportedOperationException(); }
    @Override public void updateUser() { throw new UnsupportedOperationException(); }
    @Override public void deleteUser() { throw new UnsupportedOperationException(); }
}
