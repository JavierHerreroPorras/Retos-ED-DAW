// backofficeUsuariosPedidos.js

function ejecutarBackoffice() {
    let usuarios = [
      {
        id: 1,
        nombre: "Ana",
        pedidos: [
          { idPedido: 101, producto: "Libro", estado: "Enviado" },
          { idPedido: 102, producto: "Agenda", estado: "Pendiente" }
        ]
      },
      {
        id: 2,
        nombre: "Luis",
        pedidos: [
          { idPedido: 103, producto: "Portátil", estado: "Entregado" }
        ]
      }
    ];
  
    function mostrarUsuarios() {
      console.table(usuarios.map(u => ({ id: u.id, nombre: u.nombre, pedidos: u.pedidos.length })));
    }
  
    function verPedidosUsuario() {
      const id = parseInt(prompt("ID del usuario:"));
      const usuario = usuarios.find(u => u.id === id);
      if (usuario) {
        console.table(usuario.pedidos);
      } else {
        console.log("Usuario no encontrado.");
      }
    }
  
    function añadirPedido() {
      const id = parseInt(prompt("ID del usuario:"));
      const usuario = usuarios.find(u => u.id === id);
      if (usuario) {
        const producto = prompt("Producto:");
        const estado = prompt("Estado del pedido:");
        const nuevoPedido = {
          idPedido: Math.floor(Math.random() * 1000) + 200,
          producto,
          estado
        };
        usuario.pedidos.push(nuevoPedido);
        console.log("Pedido añadido correctamente.");
      } else {
        console.log("Usuario no encontrado.");
      }
    }
  
    function eliminarUsuario() {
      const id = parseInt(prompt("ID del usuario a eliminar:"));
      const antes = usuarios.length;
      usuarios = usuarios.filter(u => u.id !== id);
      if (usuarios.length < antes) {
        console.log("Usuario eliminado junto con sus pedidos.");
      } else {
        console.log("Usuario no encontrado.");
      }
    }
  
    mostrarUsuarios();
    const accion = prompt("¿Qué deseas hacer? (ver/añadir/eliminar):");
    if (accion === "ver") verPedidosUsuario();
    else if (accion === "añadir") añadirPedido();
    else if (accion === "eliminar") eliminarUsuario();
    else console.log("Acción no válida.");
  
    console.log("Usuarios actualizados:");
    console.table(usuarios.map(u => ({ id: u.id, nombre: u.nombre, pedidos: u.pedidos.length })));
  }
  
  ejecutarBackoffice();
  