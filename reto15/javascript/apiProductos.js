function ejecutarGestorProductos() {
    const productos = [
      { nombre: "Ratón", precio: 20, categoria: "periféricos", stock: 50 },
      { nombre: "Monitor", precio: 150, categoria: "pantallas", stock: 10 },
      { nombre: "Teclado", precio: 35, categoria: "periféricos", stock: 25 }
    ];
  
    function mostrarTabla() {
      console.table(productos);
    }
  
    function buscar(nombre) {
      return productos.find(p => p.nombre.toLowerCase() === nombre.toLowerCase());
    }
  
    function filtrarCategoria(cat) {
      return productos.filter(p => p.categoria.toLowerCase() === cat.toLowerCase());
    }
  
    function modificarProducto(nombre) {
      const prod = buscar(nombre);
      if (prod) {
        const nuevoPrecio = parseFloat(prompt("Nuevo precio:"));
        const nuevoStock = parseInt(prompt("Nuevo stock:"));
        prod.precio = nuevoPrecio;
        prod.stock = nuevoStock;
      } else {
        console.log("Producto no encontrado.");
      }
    }
  
    mostrarTabla();
  
    const opcion = prompt("¿Qué deseas hacer? (buscar/filtrar/modificar)");
  
    if (opcion === "buscar") {
      const nombre = prompt("Introduce el nombre:");
      console.log(buscar(nombre));
    } else if (opcion === "filtrar") {
      const cat = prompt("Categoría:");
      console.table(filtrarCategoria(cat));
    } else if (opcion === "modificar") {
      const nombre = prompt("Nombre del producto a modificar:");
      modificarProducto(nombre);
      mostrarTabla();
    } else {
      console.log("Opción no válida.");
    }
  }
  
  ejecutarGestorProductos();
  