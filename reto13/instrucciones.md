# Reto 13: Juego por niveles y verificación de expresiones

## Objetivo

En este reto trabajarás con múltiples decisiones, lógica acumulativa, y estructuras más complejas. En Java, el usuario pasa por varios niveles y acumula puntos. En JavaScript, se evalúan operaciones introducidas por el usuario.

---

## Parte 1: Java

### Descripción

Tienes un juego en el que un jugador atraviesa varios niveles, tomando decisiones que afectan a su puntuación. El código está algo desorganizado, las funciones hacen demasiado y hay lógica duplicada. Deberás refactorizar y clarificar el flujo del juego.

### Archivos disponibles

- `java/Jugador.java`
- `java/Nivel.java`
- `java/Juego.java`

### Instrucciones

1. Mejora los nombres de clases, métodos y variables.
2. Encapsula correctamente la lógica y separa responsabilidades.
3. Mantén la entrada interactiva con `Scanner`.
4. Controla la puntuación en función de las respuestas del jugador.
5. Muestra al final del juego la puntuación total y un mensaje personalizado:
   - Más de 70 puntos: ¡Nivel experto!
   - Entre 40 y 70: ¡Buen trabajo!
   - Menos de 40: ¡Sigue practicando!

#### Ampliación opcional

1. Permite repetir un nivel si el jugador falla.
2. Implementa un sistema de “vidas”.

### Requisitos

- Documenta el código Java con **Javadoc**.
- Usa commits atómicos y bien descritos.
- Trabaja en la rama `reto13`.
- Incluye un archivo `README.md` con los cambios realizados y añádelo al Pull Request.

---

## Parte 2: JavaScript

### Descripción

El sistema genera operaciones matemáticas aleatorias (suma, resta o multiplicación). El usuario debe introducir la operación completa (por ejemplo, `5 + 3 = 8`). El script evalúa si es correcta y lleva un conteo de aciertos y fallos.

### Archivo disponible

- `javascript/verificadorExpresiones.js`

### Instrucciones

1. Crea una función principal llamada `ejecutarVerificadorExpresiones()`.
2. Genera entre 3 y 5 operaciones aleatorias (suma/resta/multiplicación).
3. Pide al usuario que introduzca cada operación con el resultado.
4. Evalúa si lo que ha escrito es correcto (usa `split()`, validación numérica, etc.).
5. Al final, muestra cuántas ha acertado y una valoración.

### Requisitos

- Usa commits atómicos y bien descritos.
- Trabaja en la rama `reto13`.
- Incluye un archivo `README.md` con los cambios realizados y añádelo al Pull Request.
