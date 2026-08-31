# 02 — Clases y objetos

## Clase

Una clase define la estructura y el comportamiento común de un tipo de objeto.

Ejemplo:

```java
public class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double calculatePriceWithTax() {
        return price * 1.19;
    }
}
```

## Objeto

Un objeto es una instancia concreta de una clase:

```java
Product laptop = new Product("Laptop", 3_000_000);
Product mouse = new Product("Mouse", 80_000);
```

## Atributos y métodos

En `Product`:

- `name` y `price` representan estado.
- `calculatePriceWithTax()` representa comportamiento.

## Encapsulación

Los atributos suelen declararse `private` para evitar que cualquier parte del programa pueda modificar directamente el estado interno del objeto.

El objeto expone operaciones controladas mediante métodos.

## Una clase puede tener varios métodos

SRP **no** dice que una clase deba tener un solo método.

Por ejemplo, una clase `ShoppingCart` podría agregar productos, retirar productos, calcular el total y saber si está vacía. Todos esos comportamientos pueden pertenecer a la misma responsabilidad: administrar el carrito.

## Pregunta de preparación

¿Qué sería más sospechoso?

A. Una clase `ShoppingCart` con cinco métodos relacionados con el carrito.

B. Una clase `ShoppingCart` que además envía emails, escribe PDFs y administra conexiones SQL.

Explica por qué antes de continuar.
