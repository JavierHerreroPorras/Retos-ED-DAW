function calcularDNI(numero) {
    const letras = "TRWAGMYFPDXBNJZSQVHLCKE";
  
    if (numero > 0 && numero < 99999999) {
      let letra = letras.charAt(numero % 23);
      console.log("DNI completo: " + numero + letra);
    } else {
      console.log("Número incorrecto");
    }
  }
  
  calcularDNI(12345678);
  