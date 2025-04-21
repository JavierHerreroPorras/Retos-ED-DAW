function ejecutarSimuladorAPI() {
    let usuarios = [
      { id: 1, nombre: "Ana", email: "ana@mail.com" },
      { id: 2, nombre: "Luis", email: "luis@mail.com" },
      { id: 3, nombre: "Clara", email: "clara@mail.com" }
    ];
  
    function getAll() {
      console.table(usuarios);
    }
  
    function postUsuario() {
      const nombre = prompt("Nombre:");
      const email = prompt("Email:");
      const nuevo = { id: usuarios.length + 1, nombre, email };
      usuarios.push(nuevo);
      console.log("Usuario añadido.");
    }
  
    function putUsuario() {
      const id = parseInt(prompt("ID del usuario a modificar:"));
      const user = usuarios.find(u => u.id === id);
      if (user) {
        user.nombre = prompt("Nuevo nombre:", user.nombre);
        user.email = prompt("Nuevo email:", user.email);
        console.log("Usuario actualizado.");
      } else {
        console.log("Usuario no encontrado.");
      }
    }
  
    function deleteUsuario() {
      const id = parseInt(prompt("ID del usuario a eliminar:"));
      usuarios = usuarios.filter(u => u.id !== id);
      console.log("Usuario eliminado.");
    }
  
    const accion = prompt("¿Qué acción deseas hacer? (GET/POST/PUT/DELETE)").toUpperCase();
  
    switch (accion) {
      case "GET": getAll(); break;
      case "POST": postUsuario(); break;
      case "PUT": putUsuario(); break;
      case "DELETE": deleteUsuario(); break;
      default: console.log("Acción no reconocida.");
    }
  
    console.log("Usuarios actuales:");
    console.table(usuarios);
  }
  
  ejecutarSimuladorAPI();
  