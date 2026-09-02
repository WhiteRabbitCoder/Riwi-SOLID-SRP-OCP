package com.riwi.solid.lsp;

public class Penguin extends Bird {
    /**
     * Señal de LSP: este subtipo no puede cumplir la operación heredada.
     */
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Los pingüinos no vuelan");
    }
}
