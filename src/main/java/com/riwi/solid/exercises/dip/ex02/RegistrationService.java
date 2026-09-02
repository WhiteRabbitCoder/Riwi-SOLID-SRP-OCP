package com.riwi.solid.exercises.dip.ex02;

public class RegistrationService {
    private final EmailSender sender = new EmailSender();
    public void register(String username) {
        System.out.println("Registrado: " + username);
        sender.send("Bienvenido " + username);
    }
}
