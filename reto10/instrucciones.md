# Reto 10: Interacción y lógica condicional

## Objetivo

Este reto se centra en la interacción con el usuario y la toma de decisiones por consola. Se te pide reorganizar el código, mejorar la estructura y nombres, y mantener el funcionamiento interactivo en ambos lenguajes.

---

## Parte 1: Java

### Descripción

Dispones de un sistema básico para reservar entradas. El usuario elige el tipo (general o VIP) y cuántas desea. El código está mal organizado, usa nombres poco expresivos y mezcla todo en `main`. Tu reto es refactorizarlo y modularizarlo.

### Archivos disponibles

- `java/T.java` (entrada)
- `java/R.java` (reserva)

### Instrucciones

1. Renombra clases, atributos y métodos para que tengan sentido.
2. Separa la lógica de interacción de la lógica de negocio.
3. Encapsula los datos y aplica buenas prácticas de POO.
4. Utiliza `Scanner` para mantener la entrada por consola.
5. Implementa validaciones: no se puede reservar más de 10 entradas por persona.
6. Calcula el precio total y muéstralo según el tipo de entrada:
   - General: 15 €
   - VIP: 30 €

#### Ampliación opcional

1. Implementa una función que pregunte si desea hacer otra reserva.
2. Añade un contador de reservas totales.

### Requisitos

- Documenta el código Java con **Javadoc**.
- Usa commits atómicos y bien descritos.
- Trabaja en la rama `reto10`.
- Crea un archivo `README.md` con los cambios realizados y añádelo al Pull Request.

---

## Parte 2: JavaScript

### Descripción

Tienes una herramienta muy básica para convertir unidades. El código mezcla lógica, validación y mensajes. Deberás refactorizarlo para hacerlo más limpio y estructurado.

### Archivo disponible

- `javascript/conversor.js`

### Instrucciones

1. Mejora nombres de funciones y variables.
2. Separa funciones para cada conversión:
   - `metrosAKilometros`
   - `celsiusAFahrenheit`
   - etc.
3. Usa `prompt()` para interactuar con el usuario.
4. Crea una función principal que muestre un menú, recoja la elección y llame a la función correspondiente.

### Requisitos

- Usa commits atómicos y bien descritos.
- Trabaja en la rama `reto10`.
- Crea un archivo `README.md` con los cambios realizados y añádelo al Pull Request.
