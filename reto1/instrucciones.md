# Reto 1: Refactorización y mejora de código en Java y JavaScript

## Objetivo

Este reto está dividido en dos partes, una para Java y otra para JavaScript. En ambas deberás analizar el código proporcionado, detectar mejoras posibles y aplicar una refactorización que lo haga más claro, estructurado y mantenible. En el caso de Java, además de refactorizar, tendrás la posibilidad de ampliar la funcionalidad mediante la creación de nuevas clases.

---

## Parte 1: Java

### Descripción

Trabajarás sobre una pequeña aplicación que gestiona tareas pendientes. El código actual presenta varios problemas de diseño y estilo que deberás refactorizar. Además, implementarás una clase nueva que interactúe con las existentes.

### Archivos disponibles

- `java/Tarea.java`
- `java/GestorTareas.java`

### Instrucciones

1. Encapsula los atributos de la clase `Tarea` utilizando `private`.
2. Crea los getters y setters que consideres necesarios.
3. Mejora los nombres de variables y métodos para que sean más claros y expresivos.
4. Extrae la lógica de impresión desde la clase `Tarea` hacia la clase `GestorTareas`.
5. Modifica el método `mostrar()` de `GestorTareas` para que imprima las tareas ordenadas por prioridad, de mayor a menor.

#### Ampliación opcional (recomendable)

1. Crea una nueva clase llamada `TareaUrgente` que herede de `Tarea`.
2. Añade un nuevo atributo `horaLimite` (por ejemplo, en formato de texto).
3. Sobrescribe el método necesario para que al imprimir se muestre también la hora límite.
4. Asegúrate de que `GestorTareas` pueda gestionar tanto tareas normales como urgentes.

### Requisitos

- Documenta las clases y métodos utilizando **Javadoc**.
- Realiza **commits atómicos y bien descritos**. Cada commit debe corresponder a un cambio concreto.
- Trabaja en una rama separada llamada `reto1`.
- Crea un Pull Request cuando hayas terminado.

---

## Parte 2: JavaScript

### Descripción

Dispones de un pequeño programa en JavaScript que gestiona una lista de productos. El código tiene problemas de estilo, duplicidad y poca claridad. Tu tarea es refactorizar el código para que sea más limpio, legible y estructurado.

### Archivos disponibles

- `javascript/productos.js`

### Instrucciones

1. Renombra variables para que sean más descriptivas.
2. Extrae bloques repetidos en funciones reutilizables.
3. Separa responsabilidades: por ejemplo, no mezcles acceso a datos con presentación.
4. Aplica buenas prácticas de codificación (uso de `const` y `let`, funciones puras si es posible, etc.).

### Requisitos

- Realiza **commits atómicos y bien descritos**. Cada commit debe corresponder a un cambio concreto.
- Trabaja en una rama separada llamada `reto1`.
- Crea un Pull Request cuando hayas terminado.

---

## Evaluación

Se valorará en ambas partes:

- La calidad de la refactorización (claridad, estructura, buenas prácticas).
- En Java, el uso correcto de la programación orientada a objetos y la herencia.
- En Java, la documentación generada con Javadoc.
- La limpieza del historial de commits y el uso correcto de Git y GitHub.
- La participación en la revisión de código y en el análisis grupal en clase.
