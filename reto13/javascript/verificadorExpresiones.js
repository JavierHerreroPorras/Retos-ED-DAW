function ejecutarVerificadorExpresiones() {
    const operaciones = ["+", "-", "*"];
    let aciertos = 0;
    let total = Math.floor(Math.random() * 3) + 3;
  
    for (let i = 0; i < total; i++) {
      let a = Math.floor(Math.random() * 10);
      let b = Math.floor(Math.random() * 10);
      let op = operaciones[Math.floor(Math.random() * operaciones.length)];
  
      let resultadoReal;
      switch (op) {
        case "+": resultadoReal = a + b; break;
        case "-": resultadoReal = a - b; break;
        case "*": resultadoReal = a * b; break;
      }
  
      let entrada = prompt(`¿Cuánto es ${a} ${op} ${b}?`);
      if (parseInt(entrada) === resultadoReal) {
        console.log("Correcto");
        aciertos++;
      } else {
        console.log(`Incorrecto. Era ${resultadoReal}`);
      }
    }
  
    console.log(`Has acertado ${aciertos} de ${total}`);
    if (aciertos === total) {
      console.log("¡Perfecto!");
    } else if (aciertos >= total / 2) {
      console.log("¡Bien hecho!");
    } else {
      console.log("Sigue practicando.");
    }
  }
  
  ejecutarVerificadorExpresiones();
  