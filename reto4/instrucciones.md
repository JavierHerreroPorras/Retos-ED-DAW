# Reto 4: Refactorización y estructuras de datos

## Objetivo

En este reto trabajarás con estructuras de datos en Java (una pila de navegación) y en JavaScript (un carrito de la compra). Deberás aplicar refactorización y aplicar buenas prácticas de organización del código. En Java, también podrás ampliar la funcionalidad de forma opcional.

---

## Parte 1: Java

### Descripción

Simulas un historial de navegación con una pila. El código es funcional pero tiene varios problemas: uso de atributos públicos, nombres confusos, mezcla de responsabilidades y código acoplado.

### Archivos disponibles

- `java/Navegador.java`
- `java/Historial.java`

### Instrucciones

1. Encapsula los atributos de las clases.
2. Mejora los nombres de clases, métodos y variables.
3. Extrae funciones pequeñas y reutilizables si hay bloques repetidos.
4. Separa la lógica de presentación del modelo de datos (`System.out.println`).

#### Ampliación opcional

1. Implementa una funcionalidad para poder **rehacer** (como en un navegador real).
2. Crea una segunda pila que guarde las páginas "adelante".
3. Crea un método `rehacer()` que restaure la última página que fue retrocedida.

### Requisitos

- Documenta el código usando **Javadoc**.
- Haz **commits atómicos y claros**.
- Trabaja en la rama `reto4`.
- Crea un archivo `README.md` donde expliques los cambios realizados y añádelo al Pull Request.

---

## Parte 2: JavaScript

### Descripción

El script gestiona un carrito de la compra. Contiene código duplicado, mezcla datos con lógica de presentación y usa estructuras poco limpias.

### Archivo disponible

- `javascript/carrito.js`

### Instrucciones

1. Refactoriza el código extrayendo funciones para calcular totales y mostrar información.
2. Mejora los nombres de variables y funciones.
3. Usa `forEach`, `map` u otras estructuras modernas si es adecuado.
4. Separa la lógica de cálculo del precio total de la visualización en consola.

### Requisitos

- Haz **commits atómicos y claros**.
- Trabaja en la rama `reto4`.
- Crea un archivo `README.md` donde expliques los cambios realizados y añádelo al Pull Request.

---

## Evaluación

- Calidad y estructura del código.
- Refactorización efectiva.
- Uso correcto de pilas en Java y arrays en JavaScript.
- Claridad, reutilización y buenas prácticas.
- Documentación Java con Javadoc.
- Buen uso de Git: ramas, commits, Pull Requests.
