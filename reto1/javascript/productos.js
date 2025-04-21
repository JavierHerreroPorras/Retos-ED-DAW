let productos = [
    {nombre: "Manzana", precio: 1.2, disponible: true},
    {nombre: "Plátano", precio: 0.9, disponible: true},
    {nombre: "Naranja", precio: 1.1, disponible: false}
  ];
  
  function mostrar() {
    for (let i = 0; i < productos.length; i++) {
      console.log("Producto: " + productos[i].nombre);
      console.log("Precio: " + productos[i].precio);
      if (productos[i].disponible) {
        console.log("Disponible");
      } else {
        console.log("No disponible");
      }
      console.log("------");
    }
  }
  
  function buscar(nombre) {
    for (let i = 0; i < productos.length; i++) {
      if (productos[i].nombre === nombre) {
        console.log("Producto: " + productos[i].nombre);
        console.log("Precio: " + productos[i].precio);
        if (productos[i].disponible) {
          console.log("Disponible");
        } else {
          console.log("No disponible");
        }
      }
    }
  }
  
  mostrar();
  buscar("Plátano");
  