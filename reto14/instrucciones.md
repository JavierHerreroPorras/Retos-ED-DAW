# Reto 14: Lectura y escritura de archivos

## Objetivo

En este reto comenzarás a trabajar con archivos. En Java, leerás una lista de tareas desde un archivo `.txt` y escribirás los cambios. En JavaScript, simularás la lectura de un archivo JSON de puntuaciones y escribirás una estructura modificada.

---

## Parte 1: Java

### Descripción

Tienes un archivo `tareas.txt` con una lista de tareas. El programa debe leerlas, mostrarlas con su estado (pendiente o completada), permitir marcar tareas como completadas por consola y guardar el nuevo estado en otro archivo.

### Archivos disponibles

- `java/Tarea.java`
- `java/GestorTareas.java`
- `java/tareas.txt` (simulado con texto como: `Lavar los platos,false`)

### Instrucciones

1. Carga las tareas desde `tareas.txt` usando `BufferedReader`.
2. Muestra las tareas numeradas al usuario.
3. Permite marcar tareas como completadas introduciendo su número.
4. Guarda el nuevo estado de todas las tareas en un archivo nuevo `tareas_actualizadas.txt`.

#### Ampliación opcional

1. Permite añadir nuevas tareas desde consola.
2. Ordena las tareas completadas al final.

### Requisitos

- Usa clases separadas (`Tarea`, `GestorTareas`) y estructuras como `ArrayList`.
- Documenta el código con **Javadoc**.
- Usa commits atómicos y descriptivos.
- Trabaja en la rama `reto14`.
- Incluye un archivo `README.md` con los cambios realizados y añádelo al Pull Request.

---

## Parte 2: JavaScript

### Descripción

Simulas un sistema que lee una lista de puntuaciones desde un archivo JSON (simulado como constante). El script muestra los jugadores, permite modificar una puntuación desde consola (`prompt()`) y guarda el nuevo JSON en un objeto simulado.

### Archivo disponible

- `javascript/puntuaciones.js`

### Instrucciones

1. Usa un array de objetos (`{nombre, puntos}`) como si fuese una lectura de JSON.
2. Muestra las puntuaciones por consola.
3. Pide al usuario qué jugador quiere modificar y su nueva puntuación.
4. Muestra el "JSON actualizado" por consola (con `JSON.stringify`).

### Requisitos

- Todo dentro de la función principal `ejecutarGestorPuntuaciones()`.
- Usa commits atómicos y descriptivos.
- Trabaja en la rama `reto14`.
- Incluye un archivo `README.md` con los cambios realizados y añádelo al Pull Request.
