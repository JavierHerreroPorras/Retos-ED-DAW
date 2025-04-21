function ejecutarGestorPedidos() {
    let pedidos = [
      { idPedido: 1, cliente: "Ana", productos: ["Libro", "Bolígrafo"], estado: "Pendiente" },
      { idPedido: 2, cliente: "Luis", productos: ["Portátil"], estado: "Enviado" },
      { idPedido: 3, cliente: "Clara", productos: ["Camiseta", "Pantalón"], estado: "Entregado" }
    ];
  
    function listarPedidos() {
      console.table(pedidos);
    }
  
    function buscarPorCliente() {
      const cliente = prompt("Introduce el nombre del cliente:");
      const resultado = pedidos.filter(p => p.cliente.toLowerCase() === cliente.toLowerCase());
      console.table(resultado);
    }
  
    function modificarEstado() {
      const id = parseInt(prompt("ID del pedido a modificar:"));
      const pedido = pedidos.find(p => p.idPedido === id);
      if (pedido) {
        const nuevoEstado = prompt("Nuevo estado (Pendiente/Enviado/Entregado):");
        pedido.estado = nuevoEstado;
        console.log("Estado actualizado.");
      } else {
        console.log("Pedido no encontrado.");
      }
    }
  
    function eliminarPedido() {
      const id = parseInt(prompt("ID del pedido a eliminar:"));
      pedidos = pedidos.filter(p => p.idPedido !== id);
      console.log("Pedido eliminado.");
    }
  
    listarPedidos();
    const opcion = prompt("¿Qué quieres hacer? (buscar/modificar/eliminar)");
  
    if (opcion === "buscar") buscarPorCliente();
    else if (opcion === "modificar") modificarEstado();
    else if (opcion === "eliminar") eliminarPedido();
    else console.log("Opción no válida.");
  
    console.log("Estado actual de pedidos:");
    console.table(pedidos);
  }
  
  ejecutarGestorPedidos();
  