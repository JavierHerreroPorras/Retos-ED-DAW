function ejecutarConversor() {
    let opcion = prompt("Elige una opción:\n1. Metros a Km\n2. Celsius a Fahrenheit");
  
    if (opcion === "1") {
      let m = prompt("Introduce metros:");
      let km = m / 1000;
      console.log(km + " km");
    } else if (opcion === "2") {
      let c = prompt("Introduce grados Celsius:");
      let f = (c * 9/5) + 32;
      console.log(f + " °F");
    } else {
      console.log("Opción no válida");
    }
  }
  
  ejecutarConversor();
  