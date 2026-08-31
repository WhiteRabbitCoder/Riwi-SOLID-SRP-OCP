package com.riwi.solid.exercises.srp.ex03;

import java.util.List;

/**
 * EJERCICIO SRP 03
 *
 * La clase mezcla análisis, presentación, persistencia y comunicación.
 * Decide qué responsabilidades deberían separarse.
 */
public class Report {

    public double calculateAverage(List<Double> values) {
        return values.stream().mapToDouble(Double::doubleValue).average().orElse(0);
    }

    public String generateHtml(double average) {
        return "<h1>Average: " + average + "</h1>";
    }

    public void saveToDatabase(String html) {
        System.out.println("Guardando reporte: " + html);
    }

    public void sendByEmail(String email, String html) {
        System.out.println("Enviando reporte a " + email + ": " + html);
    }
}
