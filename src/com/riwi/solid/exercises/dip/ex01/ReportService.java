package com.riwi.solid.exercises.dip.ex01;

public class ReportService {
    private final MySqlDatabase database = new MySqlDatabase();
    public void generateAndSave() {
        String report = "Reporte mensual";
        database.save(report);
    }
}
