# Reto 6: Refactorización de sistemas de atención y gestión de pedidos

## Objetivo

En este reto trabajarás con colas de atención al cliente en Java y con la gestión de pedidos en JavaScript. Deberás refactorizar y mejorar el diseño y legibilidad del código. En Java, además, se te propone una ampliación basada en herencia..

---

## Parte 1: Java

### Descripción

Simulas un sistema de atención al cliente en un banco, usando una cola. El código actual mezcla lógica, usa atributos públicos y no sigue buenas prácticas. Se te pide refactorizarlo y ampliarlo opcionalmente.

### Archivos disponibles

- `java/Cliente.java`
- `java/ColaBanco.java`

### Instrucciones

1. Encapsula los atributos de las clases.
2. Mejora nombres de clases, métodos y variables.
3. Extrae funciones pequeñas y bien definidas.
4. Separa lógica de presentación y lógica de datos.

#### Ampliación opcional

1. Crea una clase `ClienteEmpresa` que herede de `Cliente`.
2. Añade un campo `nombreEmpresa` y sobrescribe la presentación de datos.
3. Refactoriza `ColaBanco` para gestionar ambos tipos de clientes.

### Requisitos

- Documenta las clases y métodos con **Javadoc**.
- Realiza **commits atómicos y descriptivos**.
- Trabaja en la rama `reto6`.
- Crea un archivo `README.md` donde expliques los cambios realizados y añádelo al Pull Request.

---

## Parte 2: JavaScript

### Descripción

El script gestiona una lista de pedidos. Tiene nombres pobres, mezcla responsabilidades y se repite mucho código.

### Archivo disponible

- `javascript/pedidos.js`

### Instrucciones

1. Refactoriza usando funciones bien nombradas y reutilizables.
2. Mejora los nombres de variables y estructuras.
3. Separa el cálculo de la lógica de impresión.
4. Usa `map`, `filter` u otras estructuras modernas si es útil.

### Requisitos

- Realiza **commits atómicos y descriptivos**.
- Trabaja en la rama `reto6`.
- Crea un archivo `README.md` donde expliques los cambios realizados y añádelo al Pull Request.

---

## Evaluación

- Refactorización efectiva.
- Uso correcto de colas en Java.
- Aplicación de herencia si se hace la ampliación.
- Código claro y modular en JavaScript.
- Documentación Java con Javadoc.
- Buen uso de ramas, commits y Pull Requests.
