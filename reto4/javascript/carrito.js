function gestionarCarrito() {
    let carrito = [
      {nombre: "Camiseta", precio: 20, cantidad: 2},
      {nombre: "Pantalón", precio: 35, cantidad: 1},
      {nombre: "Zapatos", precio: 50, cantidad: 1}
    ];
  
    let total = 0;
  
    for (let i = 0; i < carrito.length; i++) {
      let subtotal = carrito[i].precio * carrito[i].cantidad;
      console.log("Producto: " + carrito[i].nombre);
      console.log("Subtotal: " + subtotal);
      total += subtotal;
      console.log("-------------");
    }
  
    console.log("Total a pagar: " + total);
  }
  
  gestionarCarrito();
  