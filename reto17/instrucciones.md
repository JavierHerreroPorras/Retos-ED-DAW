# Reto 17: Librería y gestión de pedidos

## Objetivo

En este reto trabajarás con operaciones sobre estructuras más complejas, manipulación de datos en formato JSON y simulaciones muy cercanas a aplicaciones reales.

---

## Parte 1: Java

### Descripción

Dispones de un archivo `libros.json` con un listado de libros. El sistema debe permitir:
- Leer todos los libros
- Buscar un libro por título
- Añadir un nuevo libro
- Modificar el precio de un libro
- Eliminar un libro
- Guardar los cambios actualizados

### Archivos disponibles

- `java/Libro.java`
- `java/Libreria.java`
- `java/libros.json`

### Instrucciones

1. Carga el JSON manualmente (como en el Reto 16).
2. Permite operaciones básicas desde consola.
3. Guarda los cambios al salir en un archivo actualizado `libros_actualizados.json`.

#### Ampliación opcional

- Ordena los libros por título al guardar.
- Añade validaciones: precio no negativo, título no vacío.

### Requisitos

- Usa estructuras como `ArrayList`.
- Controla errores comunes (entrada mal formada).
- Documenta con **Javadoc**.
- Trabaja en la rama `reto17` y crea un archivo `README.md` con los cambios realizados.

---

## Parte 2: JavaScript

### Descripción

Dispones de un array de pedidos, cada uno con `idPedido`, `cliente`, `productos` (array de nombres) y `estado`. Se deben permitir operaciones básicas simulando un sistema de pedidos.

### Archivo disponible

- `javascript/pedidos.js`

### Instrucciones

1. Implementa un sistema interactivo que permita:
   - Listar todos los pedidos
   - Buscar pedidos por cliente
   - Modificar el estado de un pedido
   - Eliminar un pedido
2. Usa funciones separadas para cada acción.
3. Muestra el contenido usando `console.table` y `console.log`.

### Requisitos

- Toda la lógica en `ejecutarGestorPedidos()`.
- Usa commits atómicos y descriptivos.
- Trabaja en la rama `reto17`.
- Crea un archivo `README.md` con los cambios realizados.
