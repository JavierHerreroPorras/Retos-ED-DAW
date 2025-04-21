# Reto 12: Test de personalidad y simulador de dados

## Objetivo

En este reto trabajarás con lógica de decisión y aleatoriedad. En Java, harás un test interactivo que muestra un perfil final. En JavaScript, simularás el lanzamiento de varios dados y contarás cuántas veces sale cada resultado.

---

## Parte 1: Java

### Descripción

Dispones de un test interactivo con varias preguntas y respuestas tipo A o B. El sistema da un perfil según las respuestas. El código tiene clases mal nombradas y lógica poco clara. Deberás refactorizarlo y modularizarlo.

### Archivos disponibles

- `java/Q.java`
- `java/Test.java`

### Instrucciones

1. Renombra atributos, clases y métodos mal nombrados (`Q`, `r1`, etc.).
2. Encapsula correctamente los datos.
3. Usa `Scanner` para la entrada por consola.
4. Suma puntos para perfil A o B y muestra el resultado final:
   - Más respuestas A → perfil lógico
   - Más respuestas B → perfil creativo

#### Ampliación opcional

1. Añade un tercer tipo de respuesta y un perfil mixto.
2. Haz que el número de preguntas no sea fijo (ArrayList de preguntas).

### Requisitos

- Documenta el código Java con **Javadoc**.
- Usa commits atómicos y descriptivos.
- Trabaja en la rama `reto12`.
- Incluye un archivo `README.md` con los cambios realizados y añádelo al Pull Request.

---

## Parte 2: JavaScript

### Descripción

El código actual lanza dados virtuales pero está desorganizado y sin modularidad. Tu tarea es refactorizarlo para que sea interactivo, claro y reutilizable.

### Archivo disponible

- `javascript/dados.js`

### Instrucciones

1. Usa `prompt()` para preguntar cuántos dados se quieren lanzar.
2. Lanza los dados (valores de 1 a 6).
3. Cuenta cuántas veces ha salido cada valor.
4. Separa funciones:
   - `lanzarDado()`
   - `contarResultados(resultados)`
   - `mostrarEstadisticas(conteo)`

### Requisitos

- Todo el código debe estar dentro de una función principal (`ejecutarSimuladorDados()`), llamada al final del archivo.
- Usa commits atómicos y descriptivos.
- Trabaja en la rama `reto12`.
- Incluye un archivo `README.md` con los cambios realizados y añádelo al Pull Request.
