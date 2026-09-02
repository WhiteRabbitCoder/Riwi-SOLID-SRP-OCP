# Prácticas LSP

Cada carpeta contiene una jerarquía que compila, pero cuya sustitución rompe una expectativa del cliente. No soluciones el problema ocultando la excepción ni preguntando por el tipo concreto; revisa el contrato que el cliente realmente necesita.

| Carpeta | Escenario |
| --- | --- |
| `Bird.java` y `Penguin.java` | Aves y vuelo |
| `Rectangle.java` y `Square.java` | Rectángulos y cuadrados |
| `BankAccount.java` y `FixedTermAccount.java` | Cuentas bancarias |
| `Payment.java` y sus implementaciones | Pagos y reembolsos |
| `WritableFile.java` y `ReadOnlyFile.java` | Archivos de solo lectura |

Consulta la guía de [LSP](../../../../../docs/lsp.md) para el orden de trabajo y los criterios de cierre.
