# 11 — Interface Segregation Principle (ISP)

## Idea central

> Ningún cliente debería depender de métodos que no necesita.

Una interfaz demasiado grande obliga a sus implementaciones a conocer operaciones irrelevantes o imposibles para ellas.

## Pregunta de diagnóstico

> ¿Hay implementaciones que dejan métodos vacíos, retornan valores falsos o lanzan excepciones porque esa operación no les corresponde?

## Señales frecuentes

- Interfaces con demasiadas capacidades no relacionadas.
- Métodos implementados con `throw new UnsupportedOperationException()`.
- Implementaciones vacías.
- Clases que dependen de una interfaz enorme aunque usen un solo método.

## Objetivo

Crear contratos pequeños y cohesivos basados en las necesidades reales de sus consumidores.
