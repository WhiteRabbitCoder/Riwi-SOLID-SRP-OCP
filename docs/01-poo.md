# 01 — Recordatorio de Programación Orientada a Objetos

## ¿Qué es POO?

La Programación Orientada a Objetos organiza un programa alrededor de objetos que representan conceptos del problema.

En una tienda podrían existir conceptos como:

```text
Product
Customer
Order
Payment
Invoice
```

Un objeto combina principalmente:

- **Estado:** los datos que posee.
- **Comportamiento:** las operaciones que puede realizar.

## ¿Por qué importa para SOLID?

SOLID no reemplaza POO. Es un conjunto de principios que ayuda a distribuir responsabilidades y dependencias de forma más mantenible dentro de un diseño orientado a objetos.

Una clase puede compilar, ejecutar correctamente y aun así estar mal diseñada.

Ejemplo conceptual:

```text
User
 ├─ register()
 ├─ saveToDatabase()
 ├─ sendEmail()
 ├─ generatePdf()
 └─ calculateTaxes()
```

La pregunta de diseño no es solamente “¿funciona?”. También debemos preguntar:

- ¿Qué representa esta clase?
- ¿Cuántas responsabilidades posee?
- ¿Qué razones pueden obligarla a cambiar?
- ¿Qué partes del comportamiento son variables?

Esas preguntas nos llevan a SRP y OCP.

## Antes de continuar

Asegúrate de poder explicar con tus palabras:

1. ¿Qué es un objeto?
2. ¿Qué diferencia hay entre estado y comportamiento?
3. ¿Por qué código que funciona puede seguir siendo difícil de mantener?
