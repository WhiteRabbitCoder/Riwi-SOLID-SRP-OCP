# Liskov Substitution Principle — Contratos que se pueden cumplir

## Propósito

LSP pregunta si un subtipo puede ocupar el lugar de su tipo base sin sorprender al código que lo usa. No basta con que una clase compile o herede métodos: debe cumplir el contrato que esos métodos prometen.

Las señales más útiles son una excepción por operación no soportada, un `instanceof` para evitar un subtipo o una regla nueva que cambia el resultado esperado por el cliente.

## Caso de apertura: acceso a documentos

Un sistema modela todo documento con dos operaciones: `read()` y `write()`. Cuando aparece un documento de solo lectura, su implementación de `write()` lanza `UnsupportedOperationException`.

La pregunta no es cómo esconder la excepción. La pregunta es: ¿qué capacidad necesita cada cliente? Un visor puede depender de `ReadableDocument`; un editor necesita una capacidad adicional de escritura. El modelo mejora cuando los tipos expresan capacidades que todas sus implementaciones pueden cumplir.

## Actividad de diseño: vehículos de reparto

Una clase base ofrece `deliver()` y `refuel()`. Un vehículo eléctrico hereda la clase, puede entregar pedidos, pero no puede repostar combustible. Observa qué ocurre cuando un cliente recibe un vehículo genérico y llama ambas operaciones.

Diseña contratos que permitan expresar la entrega sin prometer recarga de combustible a todos los vehículos. Comprueba el resultado sustituyendo cada implementación en el mismo cliente.

## Prácticas

Estos escenarios empiezan con una jerarquía que parece razonable, pero cuyo contrato se rompe al sustituir una implementación.

| Práctica | Escenario | Código inicial | Pregunta clave |
| --- | --- | --- | --- |
| 1 | Aves y vuelo | `src/com/riwi/solid/lsp/Bird.java` | ¿Toda ave cumple el contrato de volar? |
| 2 | Rectángulos y cuadrados | `src/com/riwi/solid/lsp/Rectangle.java` | ¿Se pueden modificar ancho y alto de manera independiente? |
| 3 | Cuentas bancarias | `src/com/riwi/solid/lsp/BankAccount.java` | ¿Toda cuenta permite retirar dinero? |
| 4 | Pagos y reembolsos | `src/com/riwi/solid/lsp/Payment.java` | ¿Todo pago promete reembolso digital? |
| 5 | Archivos | `src/com/riwi/solid/lsp/WritableFile.java` | ¿Todo archivo legible también es escribible? |

Para cada escenario:

1. Escribe el comportamiento que el cliente espera del tipo base.
2. Ejecuta o razona la sustitución problemática.
3. Identifica la promesa que el subtipo no puede cumplir.
4. Separa tipos o capacidades sin introducir comprobaciones por tipo.
5. Vuelve a probar el mismo cliente con cada implementación válida.

## Criterio de cierre

Una jerarquía es útil cuando sus subtipos preservan las expectativas del cliente. Si una implementación necesita lanzar `UnsupportedOperationException` para cumplir una operación heredada, probablemente el contrato es demasiado amplio o la relación de herencia no representa las capacidades reales.
