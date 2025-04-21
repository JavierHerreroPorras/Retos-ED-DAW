function ejecutarSimuladorDados() {
    let cantidad = parseInt(prompt("¿Cuántos dados quieres lanzar?"));
    let resultados = [];
  
    for (let i = 0; i < cantidad; i++) {
      let valor = Math.floor(Math.random() * 6) + 1;
      resultados.push(valor);
    }
  
    let conteo = {1: 0, 2: 0, 3: 0, 4: 0, 5: 0, 6: 0};
  
    resultados.forEach(function(n) {
      conteo[n]++;
    });
  
    console.log("Resultados:");
    for (let i = 1; i <= 6; i++) {
      console.log(i + ": " + conteo[i] + " veces");
    }
  }
  
  ejecutarSimuladorDados();
  