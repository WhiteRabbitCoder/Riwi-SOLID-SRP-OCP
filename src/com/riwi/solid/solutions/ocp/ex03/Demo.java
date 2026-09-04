package com.riwi.solid.solutions.ocp.ex03;

/**
 * SOLUCIÓN OCP 03 — Exportación de archivos
 *
 * El formato es la variación. Agregar JSON solo suma una clase que cumple
 * el contrato Exporter.
 */
public final class Demo {

    private Demo() {
    }

    public static void run() {
        System.out.println("== OCP 03 — Exportación ==");
        FileExportService service = new FileExportService();
        service.export(new PdfExporter(), "Reporte mensual");
        service.export(new CsvExporter(), "Reporte mensual");
        // Formato agregado sin tocar FileExportService.
        service.export(new JsonExporter(), "Reporte mensual");
    }

    public static void main(String[] args) {
        run();
    }
}

interface Exporter {
    void export(String data);
}

class PdfExporter implements Exporter {
    @Override public void export(String data) { System.out.println("Exportando PDF: " + data); }
}

class CsvExporter implements Exporter {
    @Override public void export(String data) { System.out.println("Exportando CSV: " + data); }
}

class JsonExporter implements Exporter {
    @Override public void export(String data) { System.out.println("Exportando JSON: {\"data\":\"" + data + "\"}"); }
}

class FileExportService {
    void export(Exporter exporter, String data) {
        exporter.export(data);
    }
}
