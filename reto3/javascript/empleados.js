function procesarEmpleados() {
    let empleados = [
      {nombre: "Carlos", salarioBase: 1200},
      {nombre: "Laura", salarioBase: 1500},
      {nombre: "Diego", salarioBase: 1000}
    ];
  
    for (let i = 0; i < empleados.length; i++) {
      let salarioFinal = empleados[i].salarioBase;
      console.log("Empleado: " + empleados[i].nombre);
      console.log("Salario: " + salarioFinal);
      console.log("-------------");
    }
  }
  
  procesarEmpleados();
  