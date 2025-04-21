# Reto 16: Importación JSON y simulador de API

## Objetivo

En este reto trabajarás con lectura/escritura de JSON en Java y operaciones CRUD simuladas en JavaScript. Se busca profundizar en estructuras anidadas, operaciones por consola y lógica modular.

---

## Parte 1: Java

### Descripción

Dispones de un archivo `productos.json` con un array de productos en formato JSON. El programa debe:
- Importar esos productos
- Modificar datos (precio, stock)
- Exportar los datos actualizados

### Archivos disponibles

- `java/Producto.java`
- `java/GestorProductos.java`
- `java/productos.json`

### Instrucciones

1. Lee el contenido completo del archivo `productos.json`.
2. Convierte cada objeto JSON en una instancia de la clase `Producto`.
3. Permite:
   - Listar productos
   - Modificar precio o stock
4. Escribe un nuevo archivo `productos_actualizados.json` con los productos actualizados.

#### Ampliación opcional

- Implementa validaciones numéricas y nombres únicos.
- Añade opción de añadir nuevos productos.

### Requisitos

- Usa `BufferedReader`, `StringBuilder` y `ArrayList`.
- Realiza parseo manual de JSON básico (sin librerías externas).
- Documenta con **Javadoc**.
- Trabaja en la rama `reto16` y crea un archivo `README.md` con los cambios realizados.
---

## Parte 2: JavaScript

### Descripción

Simulas una API local de usuarios. El sistema arranca con una lista de usuarios y permite ejecutar comandos interactivos simulando endpoints (`GET`, `POST`, `PUT`, `DELETE`) con `prompt()` y `console.log`.

### Archivo disponible

- `javascript/apiUsuarios.js`

### Instrucciones

1. Usa un array de usuarios con atributos: `id`, `nombre`, `email`.
2. Muestra un menú donde el usuario puede:
   - Ver todos los usuarios (`GET`)
   - Crear uno nuevo (`POST`)
   - Modificar uno (`PUT`)
   - Eliminar uno (`DELETE`)
3. Usa funciones separadas para cada operación.

### Requisitos

- Toda la lógica debe estar dentro de `ejecutarSimuladorAPI()`.
- Usa `console.table()` para mostrar usuarios.
- Trabaja en la rama `reto16`.
- Crea un archivo `README.md` con los cambios realizados.
