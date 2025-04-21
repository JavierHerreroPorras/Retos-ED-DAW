# Reto 18: Sistema de gestión de reservas y backoffice relacional

## Objetivo

Este reto plantea un caso completo y desafiante, similar a un entorno profesional. En Java, implementarás un sistema de gestión de reservas de hotel. En JavaScript, simularás un sistema de backoffice que relaciona usuarios con sus pedidos.

---

## Parte 1: Java – Sistema de gestión de reservas de hotel

### Descripción

El sistema de reservas gestiona habitaciones, clientes y reservas, cargando la información desde un archivo JSON (`reservas.json`) y permitiendo:

- Consultar habitaciones disponibles para una fecha concreta.
- Registrar nuevas reservas si no hay conflicto con otras existentes.
- Visualizar todas las reservas.
- Guardar los datos actualizados en un archivo `reservas_actualizadas.json`.

### Archivos incluidos

- `Cliente.java`: representa el cliente con nombre y DNI.
- `Habitacion.java`: representa la habitación con número y tipo.
- `Reserva.java`: contiene cliente, habitación y fecha.
- `Hotel.java`: gestiona la lógica de reservas.
- `reservas.json`: contiene reservas simuladas, una por línea en formato JSON.

### Instrucciones

1. Revisa el código proporcionado y asegúrate de entender la lógica.
2. Usa el menú por consola para realizar operaciones.
3. Añade `Javadoc` a todas las clases y métodos.
4. Realiza los cambios necesarios para mejorar nombres, modularidad o reutilización si lo crees conveniente.
5. Trabaja en la rama `reto18`.
6. Crea un archivo `README.md` explicando:
   - Cambios realizados
   - Cómo se usa el sistema
   - Qué validaciones incluye

### Validaciones mínimas

- No se puede reservar una habitación ya ocupada en una fecha dada.
- La fecha debe seguir el formato `yyyy-mm-dd`.
- Las habitaciones están numeradas del 1 al 10.

### Ampliación opcional

- Añadir opción para cancelar o modificar una reserva.
- Mostrar reservas filtradas por cliente, fecha o tipo de habitación.
- Evitar duplicados de cliente por nombre/DNI.

---

## Parte 2: JavaScript – Backoffice de usuarios y pedidos

### Descripción

Se simula un sistema de administración donde puedes gestionar usuarios y sus pedidos. Cada usuario puede tener múltiples pedidos y las operaciones deben reflejar una lógica de tipo CRUD.

### Archivo incluido

- `backofficeUsuariosPedidos.js`: contiene un array de usuarios, cada uno con sus pedidos.

### Instrucciones

1. Ejecuta el código y usa los `prompt()` para probar las diferentes acciones.
2. Implementa funciones para:
   - Ver todos los usuarios
   - Ver pedidos de un usuario
   - Añadir un nuevo pedido a un usuario
   - Eliminar un usuario (y sus pedidos)
3. Toda la lógica debe estar dentro de la función `ejecutarBackoffice()`, que se llama al final del archivo.
4. Usa `console.table()` para mostrar listas y `console.log()` para mensajes.
5. Haz commits atómicos y bien descritos en la rama `reto18`.
6. Crea un `README.md` que explique el funcionamiento del sistema, estructura de datos y decisiones de implementación.

### Ampliación opcional

- Añadir posibilidad de modificar un pedido existente.
- Validar que no se repitan los `idPedido`.
- Permitir búsqueda por nombre parcial del usuario.

---

## Evaluación

- Correcta gestión de la lógica en ambos lenguajes.
- Uso adecuado de estructuras de datos, clases, objetos y validaciones.
- Uso correcto de ficheros en Java y estructuras anidadas en JavaScript.
- Documentación clara y bien organizada.
- Control de versiones y claridad en los commits.