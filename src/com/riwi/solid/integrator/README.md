# Tienda por consola — proyecto integrador

Este directorio contiene el punto de partida del proyecto integrador. La aplicación funciona a propósito con decisiones de diseño mejorables; la meta es conservar su experiencia de uso mientras se reconocen y separan sus responsabilidades.

## Cómo empezar

Ejecuta `StoreConsoleApp.java` desde VS Code. El flujo permite listar productos, agregar ítems, revisar el carrito y finalizar una compra.

## Mapa del código

| Área | Archivos | Responsabilidad actual |
| --- | --- | --- |
| Consola | `StoreConsoleApp` | Menú, lectura de datos y presentación. |
| Carrito | `Cart`, `CartItem`, `Product` | Productos y total de la compra. |
| Compra | `CheckoutService` | Orquesta el cobro, descuento, registro y notificación. |
| Pago | `PaymentProcessor`, `CardPaymentProcessor`, `CashPaymentProcessor` | Operaciones de pago disponibles. |
| Registro | `InMemoryOrderDatabase` | Almacenamiento simulado de pedidos. |

## Pistas para el análisis

- `CheckoutService` conoce demasiados detalles: reglas de descuento, selección de pago, persistencia, notificación y salida por consola.
- `CashPaymentProcessor` no puede cumplir todas las operaciones que promete `PaymentProcessor`.
- Agregar un medio de pago, descuento o canal de notificación obliga a modificar código existente.
- La aplicación crea sus dependencias concretas en lugar de recibirlas.

No resuelvas todo de una vez. Conserva un comportamiento observable, identifica una expectativa rota o una variación y luego justifica el cambio estructural mínimo.
