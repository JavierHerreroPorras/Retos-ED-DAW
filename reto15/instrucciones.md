# Reto 15: Agenda y simulación de API

## Objetivo

En este reto trabajarás con estructuras complejas, acceso a datos tipo JSON, operaciones básicas (CRUD) y simulación de una mini API. Ideal para prepararte para aplicaciones reales y backend.

---

## Parte 1: Java

### Descripción

Dispones de un archivo `contactos.txt` con contactos en formato JSON (uno por línea o como array). El sistema debe cargar los contactos, permitir consultar uno por nombre, añadir nuevos o eliminarlos, y guardar los cambios.

### Archivos disponibles

- `java/Contacto.java`
- `java/Agenda.java`
- `java/contactos.txt`

### Instrucciones

1. Carga los contactos desde el archivo (`BufferedReader` + `String.split()` o JSON manual).
2. Permite:
   - Listar todos los contactos
   - Buscar un contacto por nombre
   - Añadir un contacto nuevo
   - Eliminar un contacto
3. Guarda el estado actualizado en el mismo archivo o en uno nuevo.

#### Ampliación opcional

1. Añade validaciones (email válido, no duplicados...).
2. Ordena por nombre antes de guardar.

### Requisitos

- Usa clases separadas (`Contacto`, `Agenda`) y `ArrayList`.
- Documenta con **Javadoc**.
- Usa commits atómicos y descriptivos.
- Trabaja en la rama `reto15`.
- Incluye un archivo `README.md` con los cambios realizados y añádelo al Pull Request.

---

## Parte 2: JavaScript

### Descripción

Simulas una API de productos. Dispones de un array de productos cargado como si fuera un archivo JSON (`fetch()` simulado con constante). Se deben aplicar operaciones básicas: buscar, filtrar, editar y mostrar de forma clara.

### Archivo disponible

- `javascript/apiProductos.js`

### Instrucciones

1. Parte de un array de objetos producto:
   - `nombre`, `precio`, `categoria`, `stock`
2. Permite:
   - Buscar productos por nombre
   - Filtrar por categoría
   - Editar precio o stock de un producto
   - Mostrar el listado como tabla en consola
3. Usa `prompt()` y estructuras de control.

### Requisitos

- Toda la lógica debe estar en la función `ejecutarGestorProductos()`, llamada al final.
- Usa funciones auxiliares para modularizar.
- Usa commits atómicos y descriptivos.
- Trabaja en la rama `reto15`.
- Incluye un archivo `README.md` con los cambios realizados y añádelo al Pull Request.
