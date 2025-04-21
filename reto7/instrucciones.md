# Reto 7: Lógica de juego y condiciones múltiples

## Objetivo

En Java trabajarás con una simulación de un combate entre jugadores. En JavaScript programarás una versión simplificada de un trivial. Ambos ejercicios requieren estructuras de control más elaboradas y separación de lógica.

---

## Parte 1: Java

### Descripción

Dispones de un código inicial que simula una batalla entre jugadores. Cada jugador tiene puntos de vida, ataque y defensa. El código inicial es muy básico, poco organizado y no aprovecha colecciones ni estructuras complejas.

### Archivos disponibles

- `java/Jugador.java`
- `java/Juego.java`

### Instrucciones

1. Refactoriza el código para separar responsabilidades: la lógica del jugador no debe estar mezclada con el sistema de juego.
2. Encapsula correctamente atributos y crea getters/setters donde se necesiten.
3. Mejora nombres de métodos y variables.
4. Sustituye arrays por `ArrayList`.
5. Utiliza estructuras `if-else` anidadas o con condiciones múltiples para simular ataques con efectos diferentes según las estadísticas.

#### Ampliación opcional

1. Añade una nueva clase `Guerrero` o `Mago` que herede de `Jugador` y tenga reglas de ataque diferentes.
2. Introduce un sistema de rondas donde se simulan varios turnos de ataque hasta que uno gane.

### Requisitos

- Documenta las clases y métodos con **Javadoc**.
- Realiza **commits atómicos y bien descritos**.
- Trabaja en la rama `reto7`.
- Crea un archivo `README.md` donde expliques los cambios realizados y añádelo al Pull Request.

---

## Parte 2: JavaScript

### Descripción

En este reto se incluye un validador de contraseñas. El código está desorganizado, mezcla lógica y presentación, y no aplica buenas prácticas de validación. Tu tarea será refactorizarlo para dejarlo modular, limpio y reutilizable.

### Archivo disponible

- `javascript/validador.js`

### Instrucciones

1. Crea funciones independientes para:
   - Validar longitud mínima
   - Verificar si contiene letras y números
   - Verificar si contiene caracteres especiales
2. Crea una función general `esValida(password)` que combine las anteriores.
3. Separa toda la lógica de validación de la de visualización (uso de `console.log`).
4. Añade mensajes claros si la contraseña no cumple los requisitos.
5. Usa estructuras condicionales múltiples o encadenadas correctamente.

### Requisitos

- Realiza **commits atómicos y bien descritos**.
- Trabaja en la rama `reto7`.
- Crea un archivo `README.md` donde expliques los cambios realizados y añádelo al Pull Request.


---

## Evaluación

- Refactorización efectiva.
- Uso de ArrayList, herencia y estructuras complejas en Java.
- Estructuración clara y modular en JavaScript.
- Correcta documentación y control de versiones.
