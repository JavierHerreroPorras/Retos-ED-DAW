# Reto 11: Votación y validación de palíndromos

## Objetivo

En este reto deberás trabajar con estructuras de decisión y lógica de validación. El sistema Java simula una votación por consola. En JavaScript, verificarás si un número introducido es palíndromo, organizando el código en funciones reutilizables.

---

## Parte 1: Java

### Descripción

Se ha implementado un sistema básico de votación por consola. Los nombres son inconsistentes, y la lógica está poco clara. Deberás organizar el código, renombrar elementos y hacer que el proceso sea más limpio, claro y validado.

### Archivos disponibles

- `java/Votante.java`
- `java/Votacion.java`

### Instrucciones

1. Refactoriza las clases: cambia nombres como `v`, `op`, etc.
2. Separa lógica de presentación y estructura de datos.
3. Valida que el voto solo pueda ser "A", "B" o "C".
4. Calcula el ganador e imprime el resultado tras la votación.

#### Ampliación opcional

1. Permite votar hasta que el usuario introduzca "fin".
2. Añade un resumen con total de votos, porcentaje por opción, y nulos.

### Requisitos

- Documenta con **Javadoc**.
- Usa commits atómicos y descriptivos.
- Trabaja en la rama `reto11`.
- Incluye un archivo `README.md` con los cambios realizados y añádelo al Pull Request.

---

## Parte 2: JavaScript

### Descripción

Tienes un script que comprueba si un número es palíndromo. Deberás refactorizarlo y encapsularlo en una función principal llamada explícitamente. Además, deberás separar lógica y validación.

### Archivo disponible

- `javascript/palindromo.js`

### Instrucciones

1. Valida que el usuario introduzca un número.
2. Separa la lógica en funciones:
   - `esNumeroValido()`
   - `esPalindromo()`
   - `mostrarResultado()`
3. Encapsula todo dentro de una función principal (`ejecutarPalindromo()`) que se llame al final.

### Requisitos

- Usa commits atómicos y descriptivos.
- Trabaja en la rama `reto11`.
- Incluye un archivo `README.md` con los cambios realizados y añádelo al Pull Request.
