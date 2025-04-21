function validarContraseña(password) {
    if (password.length >= 8) {
      let tieneNumero = false;
      let tieneLetra = false;
      for (let i = 0; i < password.length; i++) {
        let c = password.charAt(i);
        if (!isNaN(c * 1)) {
          tieneNumero = true;
        } else {
          tieneLetra = true;
        }
      }
  
      if (tieneNumero && tieneLetra) {
        console.log("Contraseña válida");
      } else {
        console.log("Debe contener letras y números");
      }
    } else {
      console.log("Demasiado corta");
    }
  }
  
  validarContraseña("abc123");
  