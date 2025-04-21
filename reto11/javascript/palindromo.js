function ejecutarPalindromo() {
    let entrada = prompt("Introduce un número:");
  
    if (isNaN(entrada)) {
      console.log("Eso no es un número válido.");
      return;
    }
  
    let invertido = entrada.split("").reverse().join("");
  
    if (entrada === invertido) {
      console.log("Es un número palíndromo.");
    } else {
      console.log("No es un número palíndromo.");
    }
  }
  
  ejecutarPalindromo();
  