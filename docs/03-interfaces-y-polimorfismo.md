# 03 — Interfaces y polimorfismo

## ¿Qué es una interfaz?

Una interfaz permite definir un **contrato**.

```java
public interface Animal {
    void makeSound();
}
```

Una clase que implementa la interfaz se compromete a ofrecer ese comportamiento:

```java
public class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Guau");
    }
}
```

## `implements`

Cuando escribimos:

```java
public class Dog implements Animal
```

decimos que `Dog` cumple el contrato `Animal`.

## Programar contra el contrato

Esto es válido:

```java
Animal animal = new Dog();
animal.makeSound();
```

Y también:

```java
Animal animal = new Cat();
animal.makeSound();
```

El código consumidor puede trabajar con `Animal` sin conocer cada detalle de `Dog` o `Cat`.

## Polimorfismo

Diferentes objetos pueden responder al mismo contrato de maneras distintas.

```java
Animal dog = new Dog();
Animal cat = new Cat();

 dog.makeSound();
 cat.makeSound();
```

Esa capacidad es una herramienta central para OCP.

## Atención

Crear una interfaz no convierte automáticamente un diseño en SOLID.

Una interfaz es útil cuando representa un contrato real o un punto de variación significativo.

## Código base

Revisa `src/com/riwi/solid/fundamentals` y ejecuta `FundamentalsDemo` desde tu IDE.
