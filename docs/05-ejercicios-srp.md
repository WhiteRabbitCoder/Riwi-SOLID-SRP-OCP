# 05 — Ejercicios de SRP

Los ejercicios están en:

```text
src/main/java/com/riwi/solid/exercises/srp/
```

No existe una solución incluida en el repositorio.

## SRP 01 — Identificar responsabilidades

Archivo: `ex01/UserManager.java`

### Contexto

`UserManager` crea usuarios, simula persistencia y envía un correo de bienvenida.

### Tu tarea

1. Enumera las responsabilidades presentes.
2. Explica qué razones independientes podrían modificar la clase.
3. Propón nombres para las clases resultantes.
4. Refactoriza el código.
5. Crea un `Main` o método demostrativo que conserve el comportamiento inicial.

### Restricción

No agregues interfaces solamente para “hacerlo más SOLID”. Este ejercicio trata de **SRP**.

---

## SRP 02 — Registro de usuarios

Archivo: `ex02/UserRegistration.java`

### Tu tarea

Separa como mínimo los conceptos de:

- creación/registro;
- almacenamiento;
- comunicación al usuario.

Los nombres concretos de las clases son decisión tuya.

### Pregunta

¿Qué clase debería cambiar si mañana el sistema deja de guardar en MySQL y empieza a usar PostgreSQL?

---

## SRP 03 — Sistema de reportes

Archivo: `ex03/Report.java`

### Problema

La misma clase analiza datos, genera HTML, simula persistencia y envía correo.

### Tu tarea

Refactoriza el sistema de forma que puedas justificar la responsabilidad de cada clase en una sola frase.

### Antes de programar

Escribe primero una lista como:

```text
Clase X -> responsabilidad Y
```

Después implementa.

---

## SRP 04 — Tienda y pedidos

Archivo: `ex04/OrderService.java`

### Tu tarea

Identifica las responsabilidades involucradas en:

- cálculo del total;
- validación de stock;
- persistencia;
- confirmación al cliente;
- generación de factura.

Refactoriza manteniendo un flujo sencillo de compra.

### Pregunta de revisión

¿Todas tus nuevas clases eran necesarias?

---

## SRP 05 — Cuándo NO dividir

Archivo: `ex05/Rectangle.java`

### Tu tarea

No empieces programando.

Analiza si `calculateArea`, `calculatePerimeter` y `resize` realmente representan razones de cambio diferentes.

Responde:

1. ¿Viola SRP?
2. ¿Crearías `AreaCalculator`, `PerimeterCalculator` y `RectangleResizer`?
3. ¿Qué ganamos y qué perdemos si dividimos demasiado?

Solo refactoriza si puedes defender claramente que existe una responsabilidad separada.
