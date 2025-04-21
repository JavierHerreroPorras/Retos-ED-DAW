# Reto 3: Refactorización y ampliación de un sistema de empleados

## Objetivo

En este reto trabajarás con un sistema básico de gestión de empleados. Deberás aplicar refactorización tanto en Java como en JavaScript. En el caso de Java, podrás también ampliar el sistema con nuevas clases y funcionalidades.

---

## Parte 1: Java

### Descripción

Dispones de un sistema muy básico que permite almacenar información de empleados y calcular sus sueldos. Sin embargo, la estructura del código no es adecuada, los métodos hacen demasiado y hay errores de diseño.

### Archivos disponibles

- `java/Empleado.java`
- `java/Nomina.java`

### Instrucciones

1. Mejora los nombres de clases, variables y métodos para que sean claros.
2. Encapsula los atributos y añade los métodos de acceso necesarios.
3. Extrae métodos que dividan responsabilidades (por ejemplo, el cálculo del sueldo no debe estar mezclado con la impresión).
4. Separa la lógica de negocio de la de presentación.

#### Ampliación opcional

1. Crea una clase `EmpleadoPorHoras` que herede de `Empleado`.
2. Esta clase debe tener una propiedad `horasTrabajadas` y una tarifa por hora.
3. Reutiliza métodos comunes de la clase base y sobrescribe el cálculo del sueldo.

### Requisitos

- Documenta todas las clases y métodos usando **Javadoc**.
- Realiza **commits atómicos y bien descritos**.
- Trabaja en la rama `reto3`.
- Crea un archivo `README.md` dentro del reto donde expliques los cambios realizados y añádelo al Pull Request.

---

## Parte 2: JavaScript

### Descripción

El script gestiona una lista de empleados, pero presenta duplicación, nombres genéricos y mezcla lógica de datos con presentación.

### Archivo disponible

- `javascript/empleados.js`

### Instrucciones

1. Refactoriza el código eliminando duplicaciones y extrayendo funciones reutilizables.
2. Mejora los nombres de variables y funciones.
3. Separa el cálculo del salario de la parte que lo muestra por consola.
4. Utiliza estructuras modernas si es adecuado (`map`, `forEach`, destructuring...).

### Requisitos

- Realiza **commits atómicos y bien descritos**.
- Trabaja en la rama `reto3`.
- Crea un archivo `README.md` dentro del reto donde expliques los cambios realizados y añádelo al Pull Request.

---

## Evaluación

- Calidad de la refactorización.
- Aplicación de buenas prácticas de codificación y estructura.
- Uso de POO y herencia en Java.
- Claridad del código JavaScript.
- Correcta documentación (Java) y uso de Git: commits, ramas, Pull Requests.
