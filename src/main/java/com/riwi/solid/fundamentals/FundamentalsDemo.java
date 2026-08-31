package com.riwi.solid.fundamentals;

public class FundamentalsDemo {
    public static void main(String[] args) {
        Product product = new Product("Laptop", 3_000_000);
        System.out.println(product.getName());
        System.out.println(product.calculatePriceWithTax());

        Animal firstAnimal = new Dog();
        Animal secondAnimal = new Cat();

        firstAnimal.makeSound();
        secondAnimal.makeSound();
    }
}
