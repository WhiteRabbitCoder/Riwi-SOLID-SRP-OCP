package com.riwi.solid.lsp;

public class Rectangle {
    protected int width;
    protected int height;

    /** El cliente espera poder cambiar cada dimensión por separado. */
    public void setWidth(int width) { this.width = width; }

    /** El cliente espera poder cambiar cada dimensión por separado. */
    public void setHeight(int height) { this.height = height; }
    public int area() { return width * height; }
}
