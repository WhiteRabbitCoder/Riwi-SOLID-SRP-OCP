package com.riwi.solid.lsp;

public class AreaClient {
    public static int resizeAndCalculate(Rectangle rectangle) {
        rectangle.setWidth(5);
        rectangle.setHeight(4);
        return rectangle.area();
    }

    public static void main(String[] args) {
        System.out.println(resizeAndCalculate(new Rectangle()));
        // TODO: compara el resultado con new Square() y explica el contrato roto.
    }
}
