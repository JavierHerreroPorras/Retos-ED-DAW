package reto3.java;

import java.util.ArrayList;

public class Nomina {
    ArrayList<Empleado> empleados = new ArrayList<>();

    public void agregar(Empleado e) {
        empleados.add(e);
    }

    public void procesar() {
        for (Empleado e : empleados) {
            e.mostrarInformacion();
        }
    }
}

