package banco.dominio;
import banco.dominio.CuentaBancaria;
import banco.dominio.Persona;

public class Banco {
    private String nombre;

    public Banco(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}
