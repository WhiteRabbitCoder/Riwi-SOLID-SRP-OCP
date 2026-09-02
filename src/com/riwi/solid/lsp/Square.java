package com.riwi.solid.lsp;

public class Square extends Rectangle {
    /**
     * Mantener los lados iguales cambia la expectativa que Rectangle ofrece al cliente.
     */
    @Override
    public void setWidth(int width) {
        this.width = width;
        this.height = width;
    }

    @Override
    public void setHeight(int height) {
        this.width = height;
        this.height = height;
    }
}
