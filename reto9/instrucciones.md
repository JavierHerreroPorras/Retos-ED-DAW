# Reto 9: Competición y cálculo bancario

## Objetivo

En este reto trabajarás con una simulación de puntuaciones en una competición (Java) y con un cálculo bancario real (JavaScript). Deberás refactorizar, aplicar estructuras complejas y mejorar nombres y organización.

---

## Parte 1: Java

### Descripción

Dispones de un sistema que almacena participantes y sus puntuaciones. El código tiene problemas de organización, nombres mal puestos y lógica acoplada. Deberás refactorizarlo, mejorar los nombres y aplicar estructuras adecuadas.

### Archivos disponibles

- `java/Prog.java`
- `java/Puntuacion.java`

### Instrucciones

1. Mejora los nombres de clases, atributos y métodos (`Prog`, `n1`, `pts`, etc.).
2. Encapsula correctamente y crea getters/setters donde sea necesario.
3. Convierte cualquier array a `ArrayList`.
4. Añade lógica para:
   - Calcular la media de cada participante.
   - Mostrar únicamente los que han superado cierta puntuación media (por ejemplo, 75).
   - Ordenar por nota media de mayor a menor.

#### Ampliación opcional

1. Crea una clase `Finalista` que herede del participante y tenga un método para mostrar una insignia especial.
2. Usa `instanceof` para aplicar lógica distinta a los finalistas.

### Requisitos

- Documenta las clases y métodos con **Javadoc**.
- Realiza **commits atómicos y bien descritos**.
- Trabaja en la rama `reto9`.
- Crea un archivo `README.md` donde expliques los cambios realizados y añádelo al Pull Request.

---

## Parte 2: JavaScript

### Descripción

Tienes una función básica que intenta calcular los dígitos de control de una cuenta bancaria (CCC). El código está mal nombrado, no modular y poco legible. Deberás aplicar una refactorización completa y aplicar correctamente el algoritmo.

### Archivo disponible

- `javascript/ccc.js`

### Instrucciones

1. Mejora los nombres de funciones, variables y estructura del código.
2. Separa en funciones:
   - `esValidoIBAN(iban)`
   - `calcularDigitosControl(entidad, oficina, cuenta)`
   - `mostrarCCCCompleto(...)`
3. Aplica correctamente el algoritmo de cálculo de los dos dígitos de control según el sistema español.

### Requisitos

- Realiza **commits atómicos y bien descritos**.
- Trabaja en la rama `reto9`.
- Crea un archivo `README.md` donde expliques los cambios realizados y añádelo al Pull Request.
