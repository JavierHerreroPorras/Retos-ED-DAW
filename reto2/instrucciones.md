# Reto 2: Refactorización de estructuras de datos y mejoras de diseño

## Objetivo

Este reto incluye dos tareas de refactorización, una en Java y otra en JavaScript. En la parte de Java se trabaja con colas y programación orientada a objetos. En la parte de JavaScript, con manipulación de datos de estudiantes.

---

## Parte 1: Java

### Descripción

Dispones de una pequeña simulación de un sistema de atención al cliente mediante una cola. El código actual presenta problemas de diseño, nombres poco claros y mezcla de responsabilidades. Deberás refactorizarlo y, opcionalmente, ampliar su funcionalidad.

### Archivos disponibles

- `java/Cliente.java`
- `java/ColaClientes.java`

### Instrucciones

1. Renombra las variables y métodos para que tengan nombres significativos.
2. Encapsula los atributos en ambas clases.
3. Separa responsabilidades. Por ejemplo, la clase `Cliente` no debería tener lógica de impresión.
4. Mejora el método de atención para que registre quién ha sido atendido.

#### Ampliación opcional

1. Crea una clase `ClienteVIP` que herede de `Cliente`.
2. Incluye una prioridad que permita atender primero a los VIP si hay alguno en la cola.
3. Refactoriza `ColaClientes` para gestionar esta lógica.

### Requisitos

- Documenta todas las clases y métodos usando **Javadoc**.
- Realiza **commits atómicos y descriptivos**.
- Usa una rama llamada `reto2`.
- Crea un Pull Request al finalizar.

---

## Parte 2: JavaScript

### Descripción

Tienes una función que gestiona las notas de varios alumnos, pero contiene código duplicado y poco mantenible. Deberás refactorizarlo para mejorar su claridad y estructura.

### Archivo disponible

- `javascript/notas.js`

### Instrucciones

1. Elimina duplicación de código creando funciones reutilizables.
2. Mejora los nombres de funciones y variables.
3. Separa la lógica de cálculo de la de presentación (`console.log`).
4. Usa `forEach` u otras estructuras modernas si lo consideras adecuado.

### Requisitos

- Realiza **commits atómicos y descriptivos**.
- Usa una rama llamada `reto2`.
- Crea un Pull Request al finalizar.

---

## Evaluación

- Refactorización efectiva y estructurada.
- Uso adecuado de POO, herencia y estructuras de datos en Java.
- Código claro, bien nombrado y modular en JavaScript.
- Documentación en Java con Javadoc.
- Buen uso de Git: ramas, commits limpios y Pull Requests.
