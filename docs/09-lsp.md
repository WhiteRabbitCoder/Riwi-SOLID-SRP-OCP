# 09 — Liskov Substitution Principle: contratos que se pueden cumplir

## Propósito

LSP pregunta si un subtipo puede ocupar el lugar de su tipo base sin sorprender al código que lo usa. No basta con que una clase compile o herede métodos: debe cumplir el contrato que esos métodos prometen.

Las señales más útiles son una excepción por operación no soportada, un `instanceof` para evitar un subtipo o una regla nueva que cambia el resultado esperado por el cliente.

## Caso de apertura: acceso a documentos

Un sistema modela todo documento con dos operaciones: `read()` y `write()`. Cuando aparece un documento de solo lectura, su implementación de `write()` lanza `UnsupportedOperationException`.

La pregunta no es cómo esconder la excepción. La pregunta es: ¿qué capacidad necesita cada cliente? Un visor puede depender de `ReadableDocument`; un editor necesita una capacidad adicional de escritura. El modelo mejora cuando los tipos expresan capacidades que todas sus implementaciones pueden cumplir.

## Actividad de diseño: vehículos de reparto

Una clase base ofrece `deliver()` y `refuel()`. Un vehículo eléctrico hereda la clase, puede entregar pedidos, pero no puede repostar combustible. Observa qué ocurre cuando un cliente recibe un vehículo genérico y llama ambas operaciones.

Diseña contratos que permitan expresar la entrega sin prometer recarga de combustible a todos los vehículos. Comprueba el resultado sustituyendo cada implementación en el mismo cliente.

## Criterio de cierre

Una jerarquía es útil cuando sus subtipos preservan las expectativas del cliente. Si una implementación necesita lanzar `UnsupportedOperationException` para cumplir una operación heredada, probablemente el contrato es demasiado amplio o la relación de herencia no representa las capacidades reales.

Continúa con los cinco ejercicios de `10-ejercicios-lsp.md`.
