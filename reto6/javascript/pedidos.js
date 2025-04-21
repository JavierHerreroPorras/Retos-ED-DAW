function procesarPedidos() {
    let pedidos = [
      {producto: "Libro", cantidad: 2, precio: 10},
      {producto: "Cuaderno", cantidad: 5, precio: 3},
      {producto: "Bolígrafo", cantidad: 10, precio: 1}
    ];
  
    for (let i = 0; i < pedidos.length; i++) {
      let total = pedidos[i].cantidad * pedidos[i].precio;
      console.log("Producto: " + pedidos[i].producto);
      console.log("Total: " + total);
      if (total > 20) {
        console.log("Pedido grande");
      } else {
        console.log("Pedido pequeño");
      }
      console.log("---------------");
    }
  }
  
  procesarPedidos();
  