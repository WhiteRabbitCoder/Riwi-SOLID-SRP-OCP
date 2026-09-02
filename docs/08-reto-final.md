# 08 — Reto final: SRP + OCP

Archivo inicial:

```text
src/com/riwi/solid/challenge/OrderService.java
```

## Contexto

El servicio actual:

- crea pedidos;
- calcula descuentos según tipo;
- guarda pedidos;
- envía notificaciones según canal;
- exporta una factura según formato.

Aquí aparecen dos tipos de problemas:

### Problema 1 — Responsabilidades

Hay comportamientos que cambian por razones distintas.

Piensa en SRP.

### Problema 2 — Variantes

Descuentos, notificaciones y exportadores pueden tener múltiples implementaciones.

Piensa en OCP.

## Requerimientos

Tu solución debe permitir agregar, sin modificar el núcleo del flujo:

### Descuentos

```text
Regular
Premium
VIP
```

### Notificaciones

```text
Email
SMS
WhatsApp
```

### Exportadores

```text
PDF
CSV
```

## Entrega

La solución debe incluir:

1. Diagrama sencillo de clases o Mermaid.
2. Código refactorizado.
3. Un `Main` que demuestre al menos dos configuraciones diferentes.
4. Explicación de dónde aplicaste SRP.
5. Explicación de dónde aplicaste OCP.
6. Una decisión de diseño que **no** abstrajiste y por qué.

## Criterio clave

No se evalúa por cantidad de interfaces ni por cantidad de archivos.

Se evalúa la capacidad para explicar:

> qué cambia, por qué cambia y dónde debería vivir ese cambio.
