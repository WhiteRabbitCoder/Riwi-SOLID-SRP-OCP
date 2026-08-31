# 07 — Ejercicios de OCP

Los ejercicios están en:

```text
src/main/java/com/riwi/solid/exercises/ocp/
```

El código inicial funciona, pero cada ejercicio contiene un punto de variación que crecería mal.

## OCP 01 — Notificaciones

Archivo: `ex01/NotificationService.java`

### Situación

Actualmente existen EMAIL y SMS.

### Tu tarea

Diseña una solución que permita añadir posteriormente:

- WhatsApp;
- push notification;
- Telegram.

Agregar una nueva variante no debería exigir modificar el componente que coordina el envío.

### Pista

Busca un contrato que represente “algo capaz de enviar una notificación”.

---

## OCP 02 — Métodos de pago

Archivo: `ex02/PaymentService.java`

### Tu tarea

Refactoriza el código para soportar de forma extensible:

- tarjeta;
- efectivo;
- transferencia;
- Nequi.

### Restricción

No reemplaces el `if` por un `switch` y declares terminado el ejercicio. El objetivo es modelar el punto de variación.

---

## OCP 03 — Exportadores

Archivo: `ex03/FileExporter.java`

### Estado inicial

El sistema soporta PDF y CSV.

### Evolución esperada

Debe poder crecer a:

```text
JSON
XML
Excel
```

### Tu tarea

Diseña el contrato y las implementaciones necesarias sin introducir una clase central que conozca todos los formatos.

---

## OCP 04 — Cálculo de envíos

Archivo: `ex04/ShippingCalculator.java`

### Estado inicial

Existen envío estándar y express.

### Evolución esperada

Añade después:

- Same Day;
- Drone Shipping.

### Pregunta

¿Qué parte del sistema debería conocer la fórmula concreta de cada envío?

---

## OCP 05 — Ataques de videojuego

Archivo: `ex05/AttackService.java`

### Estado inicial

Existen ataques con espada, magia y arco.

### Tu tarea

Crea un diseño donde puedan aparecer nuevos ataques como:

- fuego;
- hielo;
- electricidad;

sin editar el servicio que ejecuta el ataque.

### Reflexión

¿Qué representa mejor el contrato: `Attack`, `Weapon`, `AttackStrategy` u otro nombre? Justifica tu decisión.
