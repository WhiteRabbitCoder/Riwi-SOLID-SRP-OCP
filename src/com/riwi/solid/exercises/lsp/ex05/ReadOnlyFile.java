package com.riwi.solid.exercises.lsp.ex05;

public class ReadOnlyFile extends WritableFile {
    /** Señal de LSP: un archivo de solo lectura no debería prometer escritura. */
    @Override
    public void write(String content) {
        throw new UnsupportedOperationException("Archivo de solo lectura");
    }
}
