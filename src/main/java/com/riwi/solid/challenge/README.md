# Reto SRP + OCP

`OrderService.java` es el código inicial del reto de [documentación correspondiente](../../../../../../../docs/08-reto-final.md). El servicio mezcla descuentos, persistencia, notificaciones y exportación de facturas.

El objetivo es identificar responsabilidades y puntos de variación antes de cambiar el código. Una solución debe mantener el flujo de creación de pedidos y permitir extender descuentos, canales y exportadores sin convertir el diseño en una colección de abstracciones innecesarias.
