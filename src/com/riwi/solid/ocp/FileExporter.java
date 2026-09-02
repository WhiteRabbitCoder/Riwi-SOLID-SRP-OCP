package com.riwi.solid.ocp;

/**
 * EJERCICIO OCP 03
 *
 * El sistema hoy conoce PDF y CSV. La siguiente versión necesitará
 * JSON, XML y otros formatos.
 */
public class FileExporter {

    public void export(String format, String data) {
        if ("PDF".equals(format)) {
            System.out.println("Exportando PDF: " + data);
        } else if ("CSV".equals(format)) {
            System.out.println("Exportando CSV: " + data);
        }
    }
}
