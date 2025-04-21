function analizarCadenas() {
    let frases = [
      "Hola Mundo",
      "JavaScript es genial",
      "Refactorizar es importante"
    ];
  
    for (let i = 0; i < frases.length; i++) {
      let mayus = frases[i].toUpperCase();
      console.log("Original: " + frases[i]);
      console.log("Mayúsculas: " + mayus);
      console.log("Longitud: " + frases[i].length);
      console.log("-----------");
    }
  }
  
  analizarCadenas();
  