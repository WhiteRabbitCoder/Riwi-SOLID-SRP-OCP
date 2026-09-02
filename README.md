# Riwi - SOLID Principles

Material didáctico para aprender y practicar los cinco principios **SOLID** con Java, usando únicamente aplicaciones de consola y ejemplos orientados a objetos.

El repositorio está pensado para trabajarse por etapas: primero fundamentos de POO e interfaces; después SRP y OCP; luego LSP, ISP y DIP; finalmente un proyecto integrador donde los cinco principios aparecen en el mismo sistema.

## ¿Qué se aprende?

- Clases, objetos, estado y comportamiento.
- Interfaces, contratos y polimorfismo.
- **S — Single Responsibility Principle**.
- **O — Open/Closed Principle**.
- **L — Liskov Substitution Principle**.
- **I — Interface Segregation Principle**.
- **D — Dependency Inversion Principle**.
- Cómo detectar problemas de diseño antes de refactorizar.
- Cómo aplicar SOLID sin convertir el proyecto en una colección innecesaria de interfaces y clases.

## Requisitos

- Java 17 o superior.
- Conocimientos básicos de Java y POO.

## Ejecutar los ejemplos

### Desde VS Code

1. Abre esta carpeta en VS Code.
2. Abre [Main.java](src/main/java/com/riwi/solid/Main.java).
3. Pulsa **Run** (▶) sobre el método `main`, o elige **Ejecutar Riwi - SOLID Principles** en la vista *Run and Debug* y presiona `F5`.

VS Code compila el proyecto antes de ejecutarlo y usa `out/` como classpath; no requiere Maven.

### Desde la terminal

Compilar todo el proyecto con Java 17:

```powershell
$sourceFiles = Get-ChildItem src/main/java -Recurse -Filter *.java | ForEach-Object FullName
javac --release 17 -encoding UTF-8 -d out $sourceFiles
```

Ejecutar el `main` de prueba:

```powershell
java -cp out com.riwi.solid.Main
```

También puedes ejecutar directamente cualquier otra clase que tenga un método `main`.

## Regla de trabajo

Los ejercicios **no están resueltos**. El código base está hecho para compilar y, en muchos casos, funcionar, aunque tenga problemas de diseño intencionales.

Antes de modificar código, responde siempre:

1. ¿Cuál es el problema de diseño?
2. ¿Qué principio se está incumpliendo?
3. ¿Qué comportamiento debe conservarse?
4. ¿Qué cambio estructural permitiría mejorar el diseño?
5. ¿La solución introduce complejidad innecesaria?

## Estructura

```text
Riwi - SOLID Principles/
├── docs/
├── src/main/java/com/riwi/solid/
│   ├── Main.java
│   ├── fundamentals/
│   ├── exercises/
│   │   ├── srp/
│   │   ├── ocp/
│   │   ├── lsp/
│   │   ├── isp/
│   │   └── dip/
│   └── integrator/
├── .vscode/settings.json
└── README.md
```

## Proyecto integrador

El proyecto final es una pequeña tienda por consola. La versión inicial permite:

- listar productos;
- agregar productos al carrito;
- visualizar el carrito;
- finalizar una compra;
- aplicar descuento por tipo de cliente;
- elegir método de pago;
- guardar el pedido de forma simulada;
- enviar una notificación simulada.

La aplicación funciona, pero su diseño tiene problemas intencionales relacionados con los cinco principios SOLID. El reto es **refactorizar sin cambiar el comportamiento observable de la aplicación**.

## Filosofía del repositorio

SOLID no significa "crear una interfaz para todo" ni "una clase por método". El objetivo es aprender a reconocer responsabilidades, contratos, variaciones y dependencias para decidir cuándo una abstracción aporta valor.
