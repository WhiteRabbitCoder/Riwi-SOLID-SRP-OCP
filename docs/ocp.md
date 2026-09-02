# Open/Closed Principle — Extender sin reabrir

## Propósito

El principio Open/Closed ayuda a reconocer los comportamientos que cambian por variantes: canales de notificación, medios de pago, formatos o estrategias de cálculo. La meta no es eliminar todos los `if`; es evitar que una clase estable deba cambiar cada vez que aparece una nueva variante del mismo concepto.

Al terminar el módulo deberías poder identificar un punto de variación, definir un contrato pequeño y agregar una implementación sin modificar el componente que coordina el flujo.

## Caso de apertura: tarifas de entrada

Una aplicación calcula el precio de una entrada según el tipo de visitante:

```java
double priceFor(String visitorType, double basePrice) {
    if ("STUDENT".equals(visitorType)) return basePrice * 0.8;
    if ("SENIOR".equals(visitorType)) return basePrice * 0.7;
    return basePrice;
}
```

Antes de crear una interfaz, responde:

1. ¿Qué es lo que puede variar?
2. ¿Qué información necesita cada variante?
3. ¿Qué componente debería calcular el precio final?
4. ¿Cómo se agregaría el tipo `MEMBER` sin editar el cálculo central?

Una solución razonable puede usar un contrato como `DiscountPolicy` y una implementación por regla. El nombre del contrato debe describir el comportamiento variable, no la tecnología usada para resolverlo.

## Actividad de diseño: exportar comprobantes

Un módulo genera comprobantes en PDF y CSV. La siguiente versión requiere JSON. Parte de este flujo:

```java
String export(String format, String content) {
    if ("PDF".equals(format)) return "PDF: " + content;
    if ("CSV".equals(format)) return "CSV: " + content;
    return "";
}
```

Define qué representa una variante de exportación, cuál clase depende del contrato y cómo comprobar que agregar JSON no obligó a modificar el coordinador. Mantén el diseño pequeño: una abstracción solo se justifica si representa una variación real.

## Prácticas

Los siguientes cinco escenarios contienen código inicial que funciona, pero concentra las variantes en condicionales. Cada práctica pide conservar el comportamiento observable y habilitar una nueva alternativa.

| Práctica | Escenario | Código inicial | Extensión para comprobar |
| --- | --- | --- | --- |
| 1 | Notificaciones | `src/com/riwi/solid/ocp/NotificationService.java` | WhatsApp o push |
| 2 | Pagos | `src/com/riwi/solid/ocp/PaymentService.java` | Nequi o transferencia |
| 3 | Exportación | `src/com/riwi/solid/ocp/FileExporter.java` | JSON, XML o Excel |
| 4 | Envíos | `src/com/riwi/solid/ocp/ShippingCalculator.java` | Same Day o dron |
| 5 | Ataques | `src/com/riwi/solid/ocp/AttackService.java` | Hielo o electricidad |

Para cada escenario:

1. Señala la condición que crecería con una nueva variante.
2. Nombra el comportamiento que realmente cambia.
3. Introduce solo el contrato e implementaciones que necesites.
4. Agrega una variante nueva como comprobación.
5. Explica por qué el coordinador no tuvo que modificarse.

## Criterio de cierre

Un diseño aplica OCP cuando agregar una variante se parece a sumar una clase que cumple un contrato, no a ampliar una cadena de condiciones en una clase estable. No es un objetivo crear interfaces para clases que no varían.
