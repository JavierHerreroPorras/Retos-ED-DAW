function procesarNotas() {
    let alumnos = [
      {nombre: "Ana", nota1: 8, nota2: 9},
      {nombre: "Luis", nota1: 5, nota2: 6},
      {nombre: "Clara", nota1: 7, nota2: 8}
    ];
  
    for (let i = 0; i < alumnos.length; i++) {
      let promedio = (alumnos[i].nota1 + alumnos[i].nota2) / 2;
      console.log("Alumno: " + alumnos[i].nombre);
      console.log("Nota media: " + promedio);
      if (promedio >= 5) {
        console.log("Aprobado");
      } else {
        console.log("Suspenso");
      }
      console.log("----------");
    }
  }
  
procesarNotas();
  