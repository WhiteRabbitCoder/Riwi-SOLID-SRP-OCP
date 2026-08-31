# 04 — Single Responsibility Principle

## Definición

> Una clase debería tener una sola razón para cambiar.

También suele resumirse como:

> Una clase debería tener una sola responsabilidad.

La primera formulación suele ser más útil para analizar código.

## Ejemplo de diagnóstico

Imagina una clase `InvoiceService` que:

- calcula el total;
- guarda la factura;
- envía un email;
- genera un PDF.

Esa clase podría cambiar porque:

1. cambia la lógica de cálculo;
2. cambia la base de datos;
3. cambia el proveedor de correo;
4. cambia la librería de PDF.

Son razones de cambio diferentes.

## Señal práctica: la prueba del “y”

Describe una clase en voz alta:

> “Esta clase registra al usuario **y** lo guarda **y** manda correo **y** genera reportes”.

Los “y” no demuestran una violación, pero son una señal para revisar responsabilidades.

## SRP no significa atomizar

No conviertas automáticamente cada método en una clase distinta.

Una clase `Rectangle` puede calcular área, perímetro y cambiar dimensiones porque esos comportamientos pueden pertenecer coherentemente al concepto de rectángulo.

## Preguntas de diagnóstico

Antes de separar una clase, pregunta:

- ¿Qué concepto representa?
- ¿Qué actor o regla del negocio puede hacerla cambiar?
- ¿Sus métodos evolucionan por las mismas razones?
- ¿Estoy separando responsabilidades o solo aumentando archivos?

Continúa con los cinco ejercicios de `05-ejercicios-srp.md`.
