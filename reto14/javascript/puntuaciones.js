function ejecutarGestorPuntuaciones() {
    const puntuaciones = [
      { nombre: "Ana", puntos: 30 },
      { nombre: "Luis", puntos: 45 },
      { nombre: "Clara", puntos: 50 }
    ];
  
    console.log("Puntuaciones actuales:");
    puntuaciones.forEach(p => console.log(`${p.nombre}: ${p.puntos}`));
  
    let jugador = prompt("¿A qué jugador quieres cambiarle la puntuación?");
    let nuevoPuntos = parseInt(prompt("Nueva puntuación:"));
  
    let encontrado = puntuaciones.find(p => p.nombre.toLowerCase() === jugador.toLowerCase());
    if (encontrado) {
      encontrado.puntos = nuevoPuntos;
      console.log("Puntuaciones actualizadas:");
      console.log(JSON.stringify(puntuaciones, null, 2));
    } else {
      console.log("Jugador no encontrado.");
    }
  }
  
  ejecutarGestorPuntuaciones();
  