package com.riwi.solid.exercises.lsp.ex05;

public class WritableFile {
    protected String content = "";
    public String read() { return content; }

    /** El contrato base promete que sus subtipos aceptan escritura. */
    public void write(String content) { this.content = content; }
}
