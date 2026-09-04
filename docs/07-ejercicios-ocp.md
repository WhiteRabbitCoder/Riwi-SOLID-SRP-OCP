# 07 — Ejercicios OCP

Los ejercicios están en:

```text
src/com/riwi/solid/exercises/ocp/
```

No existe una solución incluida en el repositorio. Cada escenario funciona hoy, pero concentra sus variantes en una cadena de condicionales.

Para cada uno:

1. Señala la condición que crecería con una nueva variante.
2. Nombra el comportamiento que realmente cambia.
3. Introduce solo el contrato e implementaciones que necesites.
4. Agrega la variante indicada como comprobación.
5. Explica por qué el coordinador no tuvo que modificarse.

## 1. Notificaciones
Ruta: `exercises/ocp/ex01`

`NotificationService` decide el canal con `if`. Cada canal nuevo obliga a editar la clase.

Extensión para comprobar: WhatsApp o push.

## 2. Métodos de pago
Ruta: `exercises/ocp/ex02`

`PaymentService.processPayment()` conoce tarjeta, efectivo y transferencia en el mismo método.

Extensión para comprobar: Nequi o transferencia internacional.

## 3. Exportación de archivos
Ruta: `exercises/ocp/ex03`

`FileExporter` hoy conoce PDF y CSV. La siguiente versión necesita más formatos.

Extensión para comprobar: JSON, XML o Excel.

## 4. Cálculo de envíos
Ruta: `exercises/ocp/ex04`

Cada modalidad de envío tiene su propia fórmula dentro de `ShippingCalculator`. Decide dónde debería vivir esa fórmula.

Extensión para comprobar: Same Day o entrega con dron.

## 5. Ataques de videojuego
Ruta: `exercises/ocp/ex05`

`AttackService` suma una condición por cada tipo de ataque. Modela el ataque como punto de extensión.

Extensión para comprobar: hielo o electricidad.

## Pregunta de revisión

¿Alguna de tus interfaces tiene una sola implementación que nunca variará? Si es así, probablemente sobra.
