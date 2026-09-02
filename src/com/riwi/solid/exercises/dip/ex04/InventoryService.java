package com.riwi.solid.exercises.dip.ex04;

public class InventoryService {
    private final FileLogger logger = new FileLogger();
    public void reduceStock(String product) {
        logger.log("Stock reducido para " + product);
    }
}
