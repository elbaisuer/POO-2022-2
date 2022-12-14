package banco.dominio;

import banco.dominio.CuentaBancaria;
import banco.dominio.Persona;

public class Persona {
    private String nombre;
    private int cedula;

    private Persona(String nombre) {
        this.nombre = nombre;
    }

    public Persona(String nombre, int cedula) {
        this(nombre);
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

