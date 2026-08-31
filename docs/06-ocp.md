# 06 — Open/Closed Principle

## Definición

> Las entidades de software deberían estar abiertas a extensión y cerradas a modificación.

La idea no es prohibir modificar código.

La idea es que ciertos puntos de variación puedan crecer agregando nuevas implementaciones sin reescribir continuamente código que ya está estable.

## Ejemplo típico

```java
if (type.equals("CARD")) {
    // ...
} else if (type.equals("PAYPAL")) {
    // ...
} else if (type.equals("NEQUI")) {
    // ...
}
```

Un `if` no viola OCP automáticamente.

La señal aparece cuando **cada nueva variante del mismo concepto** obliga a regresar a una clase central y modificarla.

## Punto de variación

Métodos de pago son un buen ejemplo:

```text
PaymentMethod
├── CreditCardPayment
├── PaypalPayment
└── NequiPayment
```

El consumidor puede depender del contrato `PaymentMethod` y cada variante implementa su propio comportamiento.

## OCP e interfaces

Las interfaces ayudan cuando existe una familia de comportamientos intercambiables.

Pero esto:

```java
interface UserServiceInterface { ... }
class UserService implements UserServiceInterface { ... }
```

no aporta necesariamente valor si nunca existe un punto de variación real.

## Preguntas de diagnóstico

- ¿Qué comportamiento cambia entre variantes?
- ¿Cada nueva variante obliga a editar un bloque central?
- ¿Existe un contrato común claro?
- ¿Puedo extender el sistema agregando una implementación?
- ¿Estoy abstrayendo una necesidad real o anticipando complejidad innecesaria?

Continúa con `07-ejercicios-ocp.md`.
