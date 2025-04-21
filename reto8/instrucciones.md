# Reto 8: Control de acceso y cálculo de letra del DNI

## Objetivo

En este reto pondrás en práctica estructuras condicionales complejas, uso de listas, y resolución de problemas reales. El contexto cambia: trabajamos con accesos restringidos y algoritmos oficiales.

---

## Parte 1: Java

### Descripción

Tienes un sistema que controla si una persona puede entrar a un edificio. El código está mal organizado y usa arrays básicos. Tu tarea será refactorizarlo, adaptarlo a `ArrayList` y aplicar condiciones múltiples según roles y permisos.

### Archivos disponibles

- `java/Persona.java`
- `java/AccesoEdificio.java`

### Instrucciones

1. Refactoriza y encapsula las clases.
2. Convierte los arrays a `ArrayList`.
3. Mejora nombres y organización general.
4. Usa estructuras `if-else` con múltiples condiciones para definir el acceso:
   - Si es **administrador**, siempre entra.
   - Si es **empleado** y su tarjeta está **activa**, entra.
   - Si es **visitante**, solo entra si está en la lista de invitados.
   - En cualquier otro caso, se deniega el acceso.

#### Ampliación opcional

1. Crea una clase `PersonaVIP` con prioridad de acceso automática.
2. Introduce un sistema de registro de accesos permitidos y denegados.

### Requisitos

- Documenta las clases y métodos con **Javadoc**.
- Realiza **commits atómicos y descriptivos**.
- Trabaja en la rama `reto8`.
- Crea un archivo `README.md` donde expliques los cambios realizados y añádelo al Pull Request.

---

## Parte 2: JavaScript

### Descripción

En este ejercicio deberás implementar una función que calcule la letra del DNI español. El código actual tiene errores, mezcla todo en una sola función, y no valida correctamente la entrada.

### Archivo disponible

- `javascript/dni.js`

### Instrucciones

1. Refactoriza la función para que:
   - Valide que el número introducido es correcto (entre 0 y 99.999.999).
   - Calcule la letra usando el algoritmo oficial.
2. Separa la lógica en funciones pequeñas:
   - `esNumeroValido(num)`
   - `calcularLetraDNI(num)`
   - `mostrarResultado(num, letra)`
3. Usa condicionales claras y evita repetir código.

### Requisitos

- Realiza **commits atómicos y descriptivos**.
- Trabaja en la rama `reto8`.
- Crea un archivo `README.md` donde expliques los cambios realizados y añádelo al Pull Request.

---

## Evaluación

- Refactorización efectiva y ordenada.
- Uso de estructuras condicionales y listas en Java.
- Aplicación correcta del algoritmo del DNI en JavaScript.
- Código modular, claro y bien documentado.
- Control de versiones con ramas, commits y Pull Requests.
