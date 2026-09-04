# 10 — Ejercicios LSP

Los ejercicios están en:

```text
src/com/riwi/solid/exercises/lsp/
```

No existe una solución incluida en el repositorio. Cada jerarquía compila, pero rompe una expectativa del cliente al sustituir el subtipo.

Para cada uno:

1. Escribe el comportamiento que el cliente espera del tipo base.
2. Ejecuta o razona la sustitución problemática.
3. Identifica la promesa que el subtipo no puede cumplir.
4. Separa tipos o capacidades sin introducir comprobaciones por tipo.
5. Vuelve a probar el mismo cliente con cada implementación válida.

No soluciones el problema ocultando la excepción ni preguntando por el tipo concreto con `instanceof`.

## 1. Aves y vuelo
Ruta: `exercises/lsp/ex01`

`Penguin` hereda `fly()` de `Bird` y lanza `UnsupportedOperationException`. El cliente es `BirdDemo`.

Pregunta clave: ¿toda ave cumple el contrato de volar?

## 2. Rectángulos y cuadrados
Ruta: `exercises/lsp/ex02`

`Square` mantiene los lados iguales y cambia el resultado que `AreaClient` espera de `Rectangle`.

Pregunta clave: ¿se pueden modificar ancho y alto de manera independiente?

## 3. Cuentas bancarias
Ruta: `exercises/lsp/ex03`

`FixedTermAccount` no admite retiros inmediatos, pero `AccountDemo` los pide a cualquier `BankAccount`.

Pregunta clave: ¿toda cuenta permite retirar dinero?

## 4. Pagos y reembolsos
Ruta: `exercises/lsp/ex04`

`Payment` obliga a todo pago a soportar reembolsos; `CashPayment` no puede cumplirlo.

Pregunta clave: ¿todo pago promete reembolso digital?

Este escenario no trae cliente demo: escribe uno que reciba un `Payment` y ejecute ambas operaciones.

## 5. Archivos de solo lectura
Ruta: `exercises/lsp/ex05`

`ReadOnlyFile` hereda `write()` de `WritableFile` y la rechaza.

Pregunta clave: ¿todo archivo legible también es escribible?

Este escenario no trae cliente demo: escribe uno antes de rediseñar el contrato.
