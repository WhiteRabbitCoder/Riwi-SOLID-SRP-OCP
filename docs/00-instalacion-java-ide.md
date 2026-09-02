# 00 — Instalar Java y preparar el IDE

Este proyecto usa **Java 17** y no requiere Maven, Gradle ni dependencias externas. Instala un JDK —no solo un JRE— y elige uno de los dos IDE: VS Code o IntelliJ IDEA Community Edition.

## 1. Verificar Java

Abre una terminal nueva y ejecuta:

```text
java -version
javac -version
```

Ambos comandos deben mostrar versión 17 o superior. Si no se reconocen después de instalar Java, cierra y abre la terminal para recargar el `PATH`.

## Windows

Abre PowerShell como administrador. Instala el JDK 17:

```powershell
winget install --id EclipseAdoptium.Temurin.17.JDK --exact
```

Elige uno de estos IDE.

### Opción A — VS Code

```powershell
winget install --id Microsoft.VisualStudioCode --exact
```

Abre una nueva terminal e instala el soporte Java:

```powershell
code --install-extension vscjava.vscode-java-pack
code .
```

En VS Code abre `src/com/riwi/solid/Main.java`. En la vista **Run and Debug**, selecciona **Ejecutar Riwi - SOLID Principles** y presiona `F5`.

### Opción B — IntelliJ IDEA Community Edition

```powershell
winget install --id JetBrains.IntelliJIDEA.Community --exact
```

Abre IntelliJ, selecciona **Open** y elige la carpeta raíz del repositorio. Cuando lo solicite, selecciona el JDK 17 como **Project SDK**. Después abre `Main.java` y ejecuta el icono ▶ junto al método `main`.

Si configuraste el lanzador de línea de comandos de IntelliJ, también puedes abrir el proyecto con:

```powershell
idea .
```

## Linux (Debian o Ubuntu)

Instala el JDK 17:

```bash
sudo apt update
sudo apt install -y openjdk-17-jdk
```

Elige uno de estos IDE. Los siguientes comandos usan Snap; si tu distribución no tiene Snap, instala el IDE desde su administrador de paquetes o su sitio oficial.

### Opción A — VS Code

```bash
sudo snap install code --classic
code --install-extension vscjava.vscode-java-pack
code .
```

Abre `src/com/riwi/solid/Main.java` y ejecuta la configuración **Ejecutar Riwi - SOLID Principles** con `F5`.

### Opción B — IntelliJ IDEA Community Edition

```bash
sudo snap install intellij-idea-community --classic
```

Abre IntelliJ, elige **Open**, selecciona la carpeta raíz del repositorio y configura el JDK 17 como **Project SDK**. Ejecuta `Main.java` con el icono ▶ junto a `main`.

Si creaste un lanzador de línea de comandos desde IntelliJ, puedes usar:

```bash
idea .
```

## Compilar desde la terminal

Estas instrucciones sirven en cualquier IDE y comprueban que el JDK quedó bien configurado.

### Windows PowerShell

```powershell
$sourceFiles = Get-ChildItem src -Recurse -Filter *.java | ForEach-Object FullName
javac --release 17 -encoding UTF-8 -d out $sourceFiles
java -cp out com.riwi.solid.Main
```

### Linux

```bash
find src -type f -name '*.java' -print0 | xargs -0 javac --release 17 -encoding UTF-8 -d out
java -cp out com.riwi.solid.Main
```

La carpeta `out/` contiene archivos compilados temporales y ya está excluida de Git.
